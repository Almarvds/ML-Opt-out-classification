
import processing.core.PApplet;
import processing.core.PImage;

import java.awt.*;

public class test_class extends PApplet
{

    //core measurements
    int largeBlockSize;
    int numberofBlocks;

    //secondary measurements
    int sizeofBlocks;
    int largeBlockX;
    int largeBlockY;
    int blocksX;
    int blocksY;
    int distanceBetweenBlocks;

    Item item;
    ItemSelector itemSelector;


    //code elements
    boolean[] enabled = new boolean[0];
    boolean loadedImages;

    public static void main(String[]args){
        PApplet.main("test_class",args);
    }

    public void settings(){
        size(1152,864);
    }


    public void setup(){

        largeBlockSize = 650;
        numberofBlocks = 4;

        PImage backgroundRoom = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\rooms\\Room1.jpg");
        background(backgroundRoom);
        noStroke();
        fill(0,0,0,180);
        rect(0,0,width,height);
        fill(30,30,30);
        rect(0,0,width,60);

        sizeofBlocks = (width-largeBlockSize)/4;
        largeBlockX = ((width-largeBlockSize)/4)*3;
        largeBlockY = (height-largeBlockSize)/2;
        blocksX = sizeofBlocks;
        blocksY = largeBlockY;
        distanceBetweenBlocks = (largeBlockSize - (numberofBlocks*sizeofBlocks))/(numberofBlocks-1) ;

        fill(240,240,240,200);
        strokeWeight(5);
        stroke(0);
        rect(largeBlockX,largeBlockY,largeBlockSize,largeBlockSize,10);

        enabled = new boolean[numberofBlocks];
        setUserProfile();
        System.out.println("finished setup");
    }

    public void setUserProfile(){
        itemSelector = new ItemSelector();
        loadCategories();
        loadChairs();
        item = new Item(itemSelector.chair_Grbrc, itemSelector.greydrop, itemSelector.browndrop, itemSelector.functionChair, itemSelector.Basic);
        itemSelector.AssignChairs();
    }

    public void loadCategories(){
        itemSelector.reddrop = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\categories\\red_drop.png");
        itemSelector.browndrop = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\categories\\brown_drop.png");
        itemSelector.bluedrop = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\categories\\blue_drop.png");
        itemSelector.greydrop = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\categories\\grey_drop.png");
        itemSelector.blackdrop = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\categories\\black_drop.png");
        itemSelector.greendrop = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\categories\\green_drop.png");
        itemSelector.yellowdrop = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\categories\\yellow_drop.png");
        itemSelector.pinkdrop = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\categories\\pink_drop.png");
        itemSelector.purpledrop = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\categories\\purple_drop.png");
        itemSelector.Classic = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\categories\\Classic.png");
        itemSelector.Modern = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\categories\\Modern.png");
        itemSelector.Basic = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\categories\\Basic.png");
        itemSelector.functionChair = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\categories\\chair_icon.png");;
        itemSelector.functionAccesory = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\categories\\lamp.png");;
        itemSelector.functionCloset = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\categories\\closet.png");;
        itemSelector.functionCouch = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\categories\\sofa.png");;
    }

    public void loadChairs(){

        itemSelector.chair_Bnb = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chair bnb.jpg");
        itemSelector.chair_Bnm = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chair bnm.jpg");

        itemSelector.chair_Brnb = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chair brbrb.jpg");
        itemSelector.chair_Brnm = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chair brnm.jpg");
        itemSelector.chair_Brnc = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chair brnc.jpg");

        itemSelector.chair_Gnb = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chair gnb.jpg");
        itemSelector.chair_Gnc = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chair gnc.jpg");
        itemSelector.chair_Gnm = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chair gnm.jpg");

        itemSelector.chair_Grbrc = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chair grbrc.jpg");
        itemSelector.chair_Grnm = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chair grnm.jpg");

        itemSelector.chair_Pinb = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chair pinb.jpg");
        itemSelector.chair_Pinc = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chair_pinc.jpg");
        itemSelector.chair_Pinm = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chair_pinm.jpg");

        itemSelector.chair_Punb = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chair_punb.jpg");
        itemSelector.chair_Punc = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chair_punc.jpg");

        itemSelector.chair_Yenb = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chair yenb.jpg");
        itemSelector.chair_Yenc = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chair yenc.jpg");
        itemSelector.chair_Yenm = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chair yenm.jpg");

        itemSelector.chair_Rnm = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chair rnm.jpg");
        itemSelector.chair_Rbb = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chair rbb.jpg");


    }

    public void draw(){
        for(int i=0;i<numberofBlocks;i++){
            drawCategory(i);
            if(enabled[i] == true){
                drawX(i);
            }
        }
        drawItem();
        drawLikeandDislike();

        //check mouse for hovering categories
        if(mouseX>sizeofBlocks && mouseX<sizeofBlocks*2) {
            for (int i = 0; i < numberofBlocks; i++) {
                if (mouseY > blocksY + ((sizeofBlocks + distanceBetweenBlocks) * i) && mouseY < blocksY + sizeofBlocks +
                        ((sizeofBlocks + distanceBetweenBlocks) * i)) {
                    hoverCategory(i);
                }
            }
        }

        //check mouse for hovering the like and dislike
        if(mouseY>(largeBlockY+largeBlockSize+30)/2 && mouseY < (largeBlockY+largeBlockSize+30)/2+60){
            if(mouseX>largeBlockX +((((largeBlockSize-350)/2)-60)/2) && mouseX < largeBlockX +((((largeBlockSize-350)/2)-60)/2)+60){
                fill(240,240,240);
                circle(largeBlockX +((((largeBlockSize-350)/2)-60)/2)+30,(largeBlockY+largeBlockSize+30)/2+26,80);
                PImage like = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\buttons\\like-01.png");
                image(like, largeBlockX +((((largeBlockSize-350)/2)-60)/2),(largeBlockY+largeBlockSize+30)/2,60,60);
            }
            if(mouseX>largeBlockX+largeBlockSize-((((largeBlockSize-350)/2)-60)/2)-60 && mouseX < largeBlockX+largeBlockSize-((((largeBlockSize-350)/2)-60)/2)){
                fill(240,240,240);
                circle(largeBlockX+largeBlockSize-((((largeBlockSize-350)/2)-60)/2)-31,(largeBlockY+largeBlockSize+30)/2+30,80);
                PImage dislike = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\buttons\\dislike-01.png");
                image(dislike, largeBlockX+largeBlockSize-((((largeBlockSize-350)/2)-60)/2)-60,(largeBlockY+largeBlockSize+30)/2,60,60);
            }
        }
    }

    private void drawItem() {

        int imageSize = 350;
        rect(largeBlockX - 3 + (largeBlockSize-imageSize)/2 ,largeBlockY - 3 + (largeBlockSize-imageSize)/2 ,
                imageSize +6 ,imageSize + 6,2);
        image(item.itemImage,largeBlockX +(largeBlockSize-imageSize)/2,largeBlockY+(largeBlockSize-imageSize)/2,
                imageSize,imageSize);

    }

    public void mousePressed(){

        //check if categories are being clicked whenever the mouse clicks
        if(mouseX>sizeofBlocks && mouseX<sizeofBlocks*2){
            for(int i=0;i<numberofBlocks;i++){
                if(mouseY>blocksY+((sizeofBlocks+distanceBetweenBlocks)*i) && mouseY<blocksY+ sizeofBlocks +
                        ((sizeofBlocks+distanceBetweenBlocks)*i)){
                    clickedCategory(i);
                }
            }
        }

        //check if either the like or dislike button is clicked whenever the mouse clicks
        if(mouseY>(largeBlockY+largeBlockSize+30)/2 && mouseY < (largeBlockY+largeBlockSize+30)/2+60){
            if(mouseX>largeBlockX +((((largeBlockSize-350)/2)-60)/2) && mouseX < largeBlockX +((((largeBlockSize-350)/2)-60)/2)+60){
                likeButtonPressed();
            }
            if(mouseX>largeBlockX+largeBlockSize-((((largeBlockSize-350)/2)-60)/2)-60 && mouseX < largeBlockX+largeBlockSize-((((largeBlockSize-350)/2)-60)/2)){
                dislikeButtonPressed();
            }
        }
    }

    //draws categories
    void drawCategory(int i){
        fill(197,196,194);
        rect(blocksX,blocksY+((sizeofBlocks+distanceBetweenBlocks)*i),sizeofBlocks,sizeofBlocks,10);
        fill(0);
        textSize(14);
        if (i==0){
            textAlign(CENTER);
            text("Main color",blocksX+sizeofBlocks/2,blocksY+((sizeofBlocks+distanceBetweenBlocks)*i)+30);
            image(item.itemColor1,blocksX+40,blocksY+((sizeofBlocks+distanceBetweenBlocks)*i)+45,sizeofBlocks-80,sizeofBlocks-60);
        }
        if (i==1){
            text("Second color",blocksX+sizeofBlocks/2,blocksY+((sizeofBlocks+distanceBetweenBlocks)*i)+30);
            if(item.itemColor2 != null)
                image(item.itemColor2,blocksX+40,blocksY+((sizeofBlocks+distanceBetweenBlocks)*i)+45,sizeofBlocks-80,sizeofBlocks-60);
        }
        if (i==2){
            text("Function",blocksX+sizeofBlocks/2,blocksY+((sizeofBlocks+distanceBetweenBlocks)*i)+30);
            image(item.functionality,blocksX+40,blocksY+((sizeofBlocks+distanceBetweenBlocks)*i)+45,sizeofBlocks-80,sizeofBlocks-60);
        }
        if (i==3){
            text("Style",blocksX+sizeofBlocks/2,blocksY+((sizeofBlocks+distanceBetweenBlocks)*i)+30);
            image(item.styling,blocksX+30,blocksY+((sizeofBlocks+distanceBetweenBlocks)*i)+40,sizeofBlocks-60,sizeofBlocks-60);
        }
    }

    //draws hover effects
    void hoverCategory(int i){
        fill(255,255,255,200);
        rect(blocksX,blocksY+((sizeofBlocks+distanceBetweenBlocks)*i),sizeofBlocks,sizeofBlocks,10);
    }

    void drawX(int i){
        PImage redX = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\buttons\\redX.png");
        image(redX,blocksX+30,blocksY+((sizeofBlocks+distanceBetweenBlocks)*i)+40,sizeofBlocks-60,sizeofBlocks-60);
        fill(0,0,0,180);
        rect( blocksX, blocksY+((sizeofBlocks+distanceBetweenBlocks)*i), sizeofBlocks, sizeofBlocks, 8);
    }

    //disables or enables categories when clicked
    void clickedCategory(int i){
        enabled[i] =! enabled[i];
    }

    void drawLikeandDislike(){
    PImage like = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\buttons\\likes-02.png");
        PImage dislike = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\buttons\\dislikes-02.png");
        noStroke();
        fill(220,220,220);
        circle(largeBlockX +((((largeBlockSize-350)/2)-60)/2)+30,(largeBlockY+largeBlockSize+30)/2+26,80);
        circle(largeBlockX+largeBlockSize-((((largeBlockSize-350)/2)-60)/2)-31,(largeBlockY+largeBlockSize+30)/2+30,80);
        image(like, largeBlockX +((((largeBlockSize-350)/2)-60)/2),(largeBlockY+largeBlockSize+30)/2,60,60);
        image(dislike, largeBlockX+largeBlockSize-((((largeBlockSize-350)/2)-60)/2)-60,(largeBlockY+largeBlockSize+30)/2,60,60);
    }

    void likeButtonPressed(){
        item = itemSelector.returnLikedItem(item, enabled);
    }

    void dislikeButtonPressed(){
        item = itemSelector.returnDislikedItem(item);
    }

}
