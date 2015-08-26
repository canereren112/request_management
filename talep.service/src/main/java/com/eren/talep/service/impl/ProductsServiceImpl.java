///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.eren.bitirme.service.impl;
//
//import com.eren.bitirme.dao.parent.EntityDAOFactory;
//import com.eren.bitirme.domain.Images;
//import com.eren.bitirme.domain.Members;
//import com.eren.bitirme.domain.ProductCategories;
//import com.eren.bitirme.domain.ProductProporty;
//import com.eren.bitirme.domain.Products;
//import com.eren.bitirme.service.ProductsService;
//import com.google.gdata.data.books.VolumeEntry;
//import com.google.gdata.data.dublincore.Creator;
//import java.util.ArrayList;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.dao.DataAccessException;
//
///**
// *
// * @author firat
// */
//public class ProductsServiceImpl implements ProductsService {
//
//    @Autowired
//    private EntityDAOFactory entityDAOFactory;
//
//    public EntityDAOFactory getEntityDAOFactory() {
//        return entityDAOFactory;
//    }
//
//    public void setEntityDAOFactory(EntityDAOFactory entityDAOFactory) {
//        this.entityDAOFactory = entityDAOFactory;
//    }
//
//    public ProductCategories findCategory(String subject) {
//        if (subject.indexOf("/") > 0) {
//            subject = subject.substring(subject.indexOf("/") + 2, subject.length()).trim();
//        }
//        ProductCategories pc = new ProductCategories();
//        pc.setProductName(subject);
//        List<ProductCategories> list = entityDAOFactory.getProductsDAO().loadEntityByParam(pc);
//        if (list.isEmpty() == true) {
//            return null;
//        }
//        return list.get(0);
//    }
//    
//    public List<ProductCategories> getLevel2Categories() {
//        ProductCategories pc = new ProductCategories();
//        pc.setDescription("kitaplar");
//        return entityDAOFactory.getProductsDAO().loadEntityByParam(pc);
//    }
//
//    public boolean insertBooks(List<VolumeEntry> volumeEntries, String subject) {
//        ProductCategories pc = findCategory(subject);
//        Members member = (Members) entityDAOFactory.getMembersDAO().loadEntity(Members.class, 28);
//        //List<Products> products = new ArrayList<Products>();
//        List<ProductProporty> productProportys = new ArrayList<ProductProporty>();
//        for (VolumeEntry volumeEntry : volumeEntries) {
//            Products p = new Products();
//            ProductProporty pp = new ProductProporty();
//            p.setProductCategoryID(pc);
//            p.setMemberID(member);
//            if (volumeEntry.hasRating()) {
//                p.setChecked(volumeEntry.getRating().getAverage().intValue());
//            }
//            if (volumeEntry.hasReview()) {
//                p.setChecked(volumeEntry.getRating().getValue().intValue());
//            }
//            Images images = new Images();
//            String kitapAdi = volumeEntry.getTitles().get(0).getValue().trim();
//            if (kitapAdi.equals("Fab")) {
//                return false;
//            }
//            try {
//                entityDAOFactory.getProductsDAO().saveEntity(p);
//                pp.setProductID(p);
//                pp.setDurumu("Y");
//                pp.setKitapAdi(volumeEntry.getTitles().get(0).getValue().trim());
//                String author = "";
//                for (Creator c : volumeEntry.getCreators()) {
//                    author += c.getValue() + ", ";
//                }
//                pp.setKitapYazari(author.trim());
//                if (volumeEntry.hasDescriptions()) {
//                    pp.setSaticiYorum(volumeEntry.getDescriptions().get(0).getValue().trim());
//                }
//                if (volumeEntry.hasFormats()) {
//                    String pages = volumeEntry.getFormats().get(0).getValue();
//                    if (pages.length() > 6) {
//                        int sayfaNo = Integer.parseInt(pages.substring(0, pages.length() - 6).trim());
//                        pp.setSayfaSayisi(sayfaNo);
//                        if (sayfaNo < 50) {
//                            entityDAOFactory.getProductsDAO().deleteEntity(p);
//                            continue;
//                        }
//                    }
//
//                }
//                if (volumeEntry.hasDates()) {
//                    pp.setTarih(volumeEntry.getDates().get(0).getValue().substring(0, 4).trim());
//                }
//                if (volumeEntry.hasPublishers()) {
//                    pp.setYayinci(volumeEntry.getPublishers().get(0).getValue().trim());
//                }
//                productProportys.add(pp);
//
//                images = new Images();
//                if (volumeEntry.getThumbnailLink() != null) {
//                    images.setProductID(p);
//                    images.setImageURL(volumeEntry.getThumbnailLink().getHref());
//                    images.setImageComment(volumeEntry.getThumbnailLink().getTitle());
//                    String href = volumeEntry.getHtmlLink().getHref();
//                    int index = href.indexOf("id=") + 3;
//                    String id = href.substring(index, href.indexOf("&", index));
//                    images.setImageName(id);
//                    entityDAOFactory.getProductsDAO().saveEntity(images);
//                }
//                entityDAOFactory.getProductsDAO().saveEntity(pp);
//            } catch (DataAccessException ex) {
//                System.out.println("Hata:" + volumeEntry.getId());
//                entityDAOFactory.getProductsDAO().deleteEntity(p);
//                entityDAOFactory.getProductsDAO().deleteEntity(images);
//            }
//
//        }
//        return true;
////entityDAOFactory.getProductsDAO().saveEntity(productProportys);
//    }
//    
//    public List<ProductProporty> getProductProportyByCategory(ProductCategories category) {
//        return entityDAOFactory.getProductsDAO().getProductProportyByCategory(category);
//    }
//}
