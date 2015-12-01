/*     */ package com.pam.harvestcraft;
/*     */ 
/*     */ import cpw.mods.fml.common.event.FMLPreInitializationEvent;
/*     */ import cpw.mods.fml.common.registry.GameRegistry;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
/*     */ import net.minecraftforge.common.config.Configuration;
/*     */ import net.minecraftforge.common.config.Property;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BlockRegistry
/*     */ {
/*     */   public static Block[] PamTemperateSaplings;
/*     */   public static Block[] PamWarmSaplings;
/*     */   public static Block[] PamLogSaplings;
/*     */   public static Block pamcuttingBoard;
/*     */   public static Block pamPot;
/*     */   public static Block pamBeehive;
/*     */   public static Block pamApiary;
/*     */   public static Block pamPresser;
/*     */   public static Block pamSink;
/*     */   public static Block pamSalt;
/*     */   public static Block pamcompressedsaltBlock;
/*     */   public static Block pamMarket;
/*     */   public static Block pamOven;
/*     */   public static Block pamOvenon;
/*     */   public static Block pamChurn;
/*     */   public static Block pamChurnon;
/*     */   public static Block pamQuern;
/*     */   public static Block pamQuernon;
/*     */   public static Block pamDehydrator;
/*     */   public static Block pamDehydratoron;
/*     */   public static Block pamfishTrap;
/*     */   public static Block pamanimalTrap;
/*     */   public static Block pamberryGarden;
/*     */   public static Block pamdesertGarden;
/*     */   public static Block pamgrassGarden;
/*     */   public static Block pamgourdGarden;
/*     */   public static Block pamgroundGarden;
/*     */   public static Block pamherbGarden;
/*     */   public static Block pamleafyGarden;
/*     */   public static Block pammushroomGarden;
/*     */   public static Block pamstalkGarden;
/*     */   public static Block pamtextileGarden;
/*     */   public static Block pamtropicalGarden;
/*     */   public static Block pamwaterGarden;
/*     */   public static Block pamApple;
/*     */   public static Block pamappleSapling;
/*     */   public static Block pamAlmond;
/*     */   public static Block pamalmondSapling;
/*     */   public static Block pamApricot;
/*     */   public static Block pamapricotSapling;
/*     */   public static Block pamAvocado;
/*     */   public static Block pamavocadoSapling;
/*     */   public static Block pamBanana;
/*     */   public static Block pambananaSapling;
/*     */   public static Block pamCashew;
/*     */   public static Block pamcashewSapling;
/*     */   public static Block pamCherry;
/*     */   public static Block pamcherrySapling;
/*     */   public static Block pamChestnut;
/*     */   public static Block pamchestnutSapling;
/*     */   public static Block pamCinnamon;
/*     */   public static Block pamcinnamonSapling;
/*     */   public static Block pamCoconut;
/*     */   public static Block pamcoconutSapling;
/*     */   public static Block pamDate;
/*     */   public static Block pamdateSapling;
/*     */   public static Block pamDragonfruit;
/*     */   public static Block pamdragonfruitSapling;
/*     */   public static Block pamDurian;
/*     */   public static Block pamdurianSapling;
/*     */   public static Block pamFig;
/*     */   public static Block pamfigSapling;
/*     */   public static Block pamGrapefruit;
/*     */   public static Block pamgrapefruitSapling;
/*     */   public static Block pamLemon;
/*     */   public static Block pamlemonSapling;
/*     */   public static Block pamLime;
/*     */   public static Block pamlimeSapling;
/*     */   public static Block pamMaple;
/*     */   public static Block pammapleSapling;
/*     */   public static Block pamMango;
/*     */   public static Block pammangoSapling;
/*     */   public static Block pamNutmeg;
/*     */   public static Block pamnutmegSapling;
/*     */   public static Block pamOlive;
/*     */   public static Block pamoliveSapling;
/*     */   public static Block pamOrange;
/*     */   public static Block pamorangeSapling;
/*     */   public static Block pamPapaya;
/*     */   public static Block pampapayaSapling;
/*     */   public static Block pamPaperbark;
/*     */   public static Block pampaperbarkSapling;
/*     */   public static Block pamPeach;
/*     */   public static Block pampeachSapling;
/*     */   public static Block pamPear;
/*     */   public static Block pampearSapling;
/*     */   public static Block pamPecan;
/*     */   public static Block pampecanSapling;
/*     */   public static Block pamPeppercorn;
/*     */   public static Block pampeppercornSapling;
/*     */   public static Block pamPersimmon;
/*     */   public static Block pampersimmonSapling;
/*     */   public static Block pamPistachio;
/*     */   public static Block pampistachioSapling;
/*     */   public static Block pamPlum;
/*     */   public static Block pamplumSapling;
/*     */   public static Block pamPomegranate;
/*     */   public static Block pampomegranateSapling;
/*     */   public static Block pamStarfruit;
/*     */   public static Block pamstarfruitSapling;
/*     */   public static Block pamVanillabean;
/*     */   public static Block pamvanillabeanSapling;
/*     */   public static Block pamWalnut;
/*     */   public static Block pamwalnutSapling;
/*     */   public static Block pamGooseberry;
/*     */   public static Block pamgooseberrySapling;
/*     */   public static Block pamblackberryCrop;
/*     */   public static Block pamblueberryCrop;
/*     */   public static Block pamcandleberryCrop;
/*     */   public static Block pamraspberryCrop;
/*     */   public static Block pamstrawberryCrop;
/*     */   public static Block pamcactusfruitCrop;
/*     */   public static Block pamasparagusCrop;
/*     */   public static Block pambarleyCrop;
/*     */   public static Block pamoatsCrop;
/*     */   public static Block pamryeCrop;
/*     */   public static Block pamcornCrop;
/*     */   public static Block pambambooshootCrop;
/*     */   public static Block pamcantaloupeCrop;
/*     */   public static Block pamcucumberCrop;
/*     */   public static Block pamwintersquashCrop;
/*     */   public static Block pamzucchiniCrop;
/*     */   public static Block pambeetCrop;
/*     */   public static Block pamonionCrop;
/*     */   public static Block pamparsnipCrop;
/*     */   public static Block pampeanutCrop;
/*     */   public static Block pamradishCrop;
/*     */   public static Block pamrutabagaCrop;
/*     */   public static Block pamsweetpotatoCrop;
/*     */   public static Block pamturnipCrop;
/*     */   public static Block pamrhubarbCrop;
/*     */   public static Block pamceleryCrop;
/*     */   public static Block pamgarlicCrop;
/*     */   public static Block pamgingerCrop;
/*     */   public static Block pamspiceleafCrop;
/*     */   public static Block pamtealeafCrop;
/*     */   public static Block pamcoffeebeanCrop;
/*     */   public static Block pammustardseedsCrop;
/*     */   public static Block pambroccoliCrop;
/*     */   public static Block pamcauliflowerCrop;
/*     */   public static Block pamleekCrop;
/*     */   public static Block pamlettuceCrop;
/*     */   public static Block pamscallionCrop;
/*     */   public static Block pamartichokeCrop;
/*     */   public static Block pambrusselsproutCrop;
/*     */   public static Block pamcabbageCrop;
/*     */   public static Block pamspinachCrop;
/*     */   public static Block pamwhitemushroomCrop;
/*     */   public static Block pambeanCrop;
/*     */   public static Block pamsoybeanCrop;
/*     */   public static Block pambellpepperCrop;
/*     */   public static Block pamchilipepperCrop;
/*     */   public static Block pameggplantCrop;
/*     */   public static Block pamokraCrop;
/*     */   public static Block pampeasCrop;
/*     */   public static Block pamtomatoCrop;
/*     */   public static Block pamcottonCrop;
/*     */   public static Block pampineappleCrop;
/*     */   public static Block pamgrapeCrop;
/*     */   public static Block pamkiwiCrop;
/*     */   public static Block pamcranberryCrop;
/*     */   public static Block pamriceCrop;
/*     */   public static Block pamseaweedCrop;
/*     */   public static Block pamcurryleafCrop;
/*     */   public static Block pamsesameseedsCrop;
/*     */   public static Block pamwaterchestnutCrop;
/*     */   public static Block pamcandleDeco1;
/*     */   public static Block pamcandleDeco2;
/*     */   public static Block pamcandleDeco3;
/*     */   public static Block pamcandleDeco4;
/*     */   public static Block pamcandleDeco5;
/*     */   public static Block pamcandleDeco6;
/*     */   public static Block pamcandleDeco7;
/*     */   public static Block pamcandleDeco8;
/*     */   public static Block pamcandleDeco9;
/*     */   public static Block pamcandleDeco10;
/*     */   public static Block pamcandleDeco11;
/*     */   public static Block pamcandleDeco12;
/*     */   public static Block pamcandleDeco13;
/*     */   public static Block pamcandleDeco14;
/*     */   public static Block pamcandleDeco15;
/*     */   public static Block pamcandleDeco16;
/*     */   public static Block pamcarrotCake;
/*     */   public static Block pamcheeseCake;
/*     */   public static Block pamcherrycheeseCake;
/*     */   public static Block pampineappleupsidedownCake;
/*     */   public static Block pamchocolatesprinkleCake;
/*     */   public static Block pamredvelvetCake;
/*     */   public static Block pamlamingtonCake;
/*     */   public static Block pampavlovaCake;
/*     */   public static Block pamholidayCake;
/*     */   public static Block pampumpkincheeseCake;
/*     */   public static int saltRarity;
/*     */   public static boolean enablesaltGeneration;
/*     */   public static int beehiveRarity;
/*     */   public static boolean enablebeehiveGeneration;
/*     */   public static boolean marketsellSeeds;
/*     */   public static boolean marketselltemperateSaplings;
/*     */   public static boolean marketselltropicalSaplings;
/*     */   public static boolean marketsellconiferousSaplings;
/*     */   public static boolean marketsellPig;
/*     */   public static boolean marketsellSheep;
/*     */   public static boolean marketsellCow;
/*     */   public static boolean marketsellChicken;
/*     */   public static boolean marketsellHorse;
/*     */   public static boolean marketsellBonemeal;
/*     */   public static int marketblockrecipeItem;
/*     */   public static int marketseedPrice;
/*     */   public static int marketsaplingPrice;
/*     */   public static int marketpigPrice;
/*     */   public static int marketsheepPrice;
/*     */   public static int marketcowPrice;
/*     */   public static int marketchickenPrice;
/*     */   public static int markethorsePrice;
/*     */   public static int marketbonemealPrice;
/*     */   public static int marketcurrencySeeds;
/*     */   public static int marketcurrencytemperateSaplings;
/*     */   public static int marketcurrencytropicalSaplings;
/*     */   public static int marketcurrencyconiferousSaplings;
/*     */   public static int marketcurrencyPig;
/*     */   public static int marketcurrencySheep;
/*     */   public static int marketcurrencyCow;
/*     */   public static int marketcurrencyChicken;
/*     */   public static int marketcurrencyHorse;
/*     */   public static int marketcurrencyBonemeal;
/*     */   public static int gardenRarity;
/*     */   public static int gardendropAmount;
/*     */   public static boolean enablegardenSpread;
/*     */   public static int gardenspreadRate;
/*     */   public static boolean enableberrygardenGeneration;
/*     */   public static boolean enabledesertgardenGeneration;
/*     */   public static boolean enablegrassgardenGeneration;
/*     */   public static boolean enablegourdgardenGeneration;
/*     */   public static boolean enablegroundgardenGeneration;
/*     */   public static boolean enableherbgardenGeneration;
/*     */   public static boolean enableleafygardenGeneration;
/*     */   public static boolean enablemushroomgardenGeneration;
/*     */   public static boolean enablestalkgardenGeneration;
/*     */   public static boolean enabletextilegardenGeneration;
/*     */   public static boolean enabletropicalgardenGeneration;
/*     */   public static boolean enablewatergardenGeneration;
/*     */   public static int temperatefruittreeRarity;
/*     */   public static int tropicalfruittreeRarity;
/*     */   public static int coniferousfruittreeRarity;
/*     */   public static boolean appletreeGeneration;
/*     */   public static boolean almondtreeGeneration;
/*     */   public static boolean apricottreeGeneration;
/*     */   public static boolean avocadotreeGeneration;
/*     */   public static boolean bananatreeGeneration;
/*     */   public static boolean cashewtreeGeneration;
/*     */   public static boolean cherrytreeGeneration;
/*     */   public static boolean chestnuttreeGeneration;
/*     */   public static boolean cinnamontreeGeneration;
/*     */   public static boolean coconuttreeGeneration;
/*     */   public static boolean datetreeGeneration;
/*     */   public static boolean dragonfruittreeGeneration;
/*     */   public static boolean duriantreeGeneration;
/*     */   public static boolean figtreeGeneration;
/*     */   public static boolean grapefruittreeGeneration;
/*     */   public static boolean lemontreeGeneration;
/*     */   public static boolean limetreeGeneration;
/*     */   public static boolean mapletreeGeneration;
/*     */   public static boolean mangotreeGeneration;
/*     */   public static boolean nutmegtreeGeneration;
/*     */   public static boolean olivetreeGeneration;
/*     */   public static boolean orangetreeGeneration;
/*     */   public static boolean papayatreeGeneration;
/*     */   public static boolean paperbarktreeGeneration;
/*     */   public static boolean peachtreeGeneration;
/*     */   public static boolean peartreeGeneration;
/*     */   public static boolean pecantreeGeneration;
/*     */   public static boolean peppercorntreeGeneration;
/*     */   public static boolean persimmontreeGeneration;
/*     */   public static boolean pistachiotreeGeneration;
/*     */   public static boolean plumtreeGeneration;
/*     */   public static boolean pomegranatetreeGeneration;
/*     */   public static boolean starfruittreeGeneration;
/*     */   public static boolean vanillabeantreeGeneration;
/*     */   public static boolean walnuttreeGeneration;
/*     */   public static boolean gooseberrytreeGeneration;
/*     */   public static boolean cropsdropSeeds;
/*     */   public static boolean rightclickmatureshowfruitHearts;
/*     */   public static boolean rightclickmatureshowcropHearts;
/*     */   public static boolean rightclickharvestCrop;
/*     */   public static boolean rightclickharvestFruit;
/*     */   public static boolean gardensdropSeeds;
/*     */   public static boolean enablecropspecialplanting;
/*     */   public static int candlerecipeAmount;
/*     */   public static float candlelightLevel;
/*     */   public static boolean enabletwilightforestfruittreeGen;
/*     */   public static boolean enabletwilightforestgardenGen;
/*     */   public static boolean enableAroma1997sdimensionalworldfruittreeGen;
/*     */   public static boolean enableAroma1997sdimensionalworldgardenGen;
/*     */   
/*     */   public static void initBlocks(FMLPreInitializationEvent event, Configuration config)
/*     */   {
/* 324 */     saltRarity = config.get("salt", "saltRarity", 30).getInt();
/*     */     
/* 326 */     enablesaltGeneration = config.get("salt", "enablesaltGeneration", true).getBoolean(true);
/* 327 */     beehiveRarity = config.get("beekeeping", "beehiveRarity", 5).getInt();
/* 328 */     enablebeehiveGeneration = config.get("beekeeping", "enablebeehiveGeneration", true).getBoolean(true);
/* 329 */     marketsellSeeds = config.get("market sales", "marketsellSeeds", true).getBoolean(true);
/* 330 */     marketselltemperateSaplings = config.get("market sales", "marketselltemperateSaplings", true).getBoolean(true);
/* 331 */     marketselltropicalSaplings = config.get("market sales", "marketselltropicalSaplings", true).getBoolean(true);
/* 332 */     marketsellconiferousSaplings = config.get("market sales", "marketsellconiferousSaplings", true).getBoolean(true);
/* 333 */     marketsellPig = config.get("market sales", "marketsellPig", true).getBoolean(true);
/* 334 */     marketsellSheep = config.get("market sales", "marketsellSheep", true).getBoolean(true);
/* 335 */     marketsellCow = config.get("market sales", "marketsellCow", true).getBoolean(true);
/* 336 */     marketsellChicken = config.get("market sales", "marketsellChicken", true).getBoolean(true);
/* 337 */     marketsellHorse = config.get("market sales", "marketsellHorse", true).getBoolean(true);
/* 338 */     marketsellBonemeal = config.get("market sales", "marketsellBonemeal", true).getBoolean(true);
/* 339 */     marketblockrecipeItem = config.get("miscellaneous recipes", "marketblockrecipeItem", 0).getInt();
/* 340 */     marketseedPrice = config.get("market prices", "marketseedPrice", 1).getInt();
/* 341 */     marketsaplingPrice = config.get("market prices", "marketsaplingPrice", 3).getInt();
/* 342 */     marketpigPrice = config.get("market prices", "marketpigPrice", 6).getInt();
/* 343 */     marketsheepPrice = config.get("market prices", "marketsheepPrice", 6).getInt();
/* 344 */     marketcowPrice = config.get("market prices", "marketcowPrice", 9).getInt();
/* 345 */     marketchickenPrice = config.get("market prices", "marketchickenPrice", 3).getInt();
/* 346 */     markethorsePrice = config.get("market prices", "markethorsePrice", 12).getInt();
/* 347 */     marketbonemealPrice = config.get("market prices", "marketbonemealPrice", 3).getInt();
/* 348 */     marketcurrencySeeds = config.get("market currency", "marketcurrencySeeds", 0).getInt();
/* 349 */     marketcurrencytemperateSaplings = config.get("market currency", "marketcurrencytemperateSaplings", 0).getInt();
/* 350 */     marketcurrencytropicalSaplings = config.get("market currency", "marketcurrencytropicalSaplings", 0).getInt();
/* 351 */     marketcurrencyconiferousSaplings = config.get("market currency", "marketcurrencyconiferousSaplings", 0).getInt();
/* 352 */     marketcurrencyPig = config.get("market currency", "marketcurrencyPig", 0).getInt();
/* 353 */     marketcurrencySheep = config.get("market currency", "marketcurrencySheep", 0).getInt();
/* 354 */     marketcurrencyCow = config.get("market currency", "marketcurrencyCow", 0).getInt();
/* 355 */     marketcurrencyChicken = config.get("market currency", "marketcurrencyChicken", 0).getInt();
/* 356 */     marketcurrencyHorse = config.get("market currency", "marketcurrencyHorse", 0).getInt();
/* 357 */     marketcurrencyBonemeal = config.get("market currency", "marketcurrencyBonemeal", 0).getInt();
/* 358 */     gardenRarity = config.get("gardens", "gardenRarity", 2).getInt();
/* 359 */     gardendropAmount = config.get("gardens", "gardendropAmount", 3).getInt();
/* 360 */     enablegardenSpread = config.get("gardens", "enablegardenSpread", true).getBoolean(true);
/* 361 */     gardenspreadRate = config.get("gardens", "gardenspreadRate", 100).getInt();
/* 362 */     enableberrygardenGeneration = config.get("gardens", "enableberrygardenGeneration", true).getBoolean(true);
/* 363 */     enabledesertgardenGeneration = config.get("gardens", "enabledesertgardenGeneration", true).getBoolean(true);
/* 364 */     enablegrassgardenGeneration = config.get("gardens", "enablegrassgardenGeneration", true).getBoolean(true);
/* 365 */     enablegourdgardenGeneration = config.get("gardens", "enablegourdgardenGeneration", true).getBoolean(true);
/* 366 */     enablegroundgardenGeneration = config.get("gardens", "enablegroundgardenGeneration", true).getBoolean(true);
/* 367 */     enableherbgardenGeneration = config.get("gardens", "enableherbgardenGeneration", true).getBoolean(true);
/* 368 */     enableleafygardenGeneration = config.get("gardens", "enableleafygardenGeneration", true).getBoolean(true);
/* 369 */     enablemushroomgardenGeneration = config.get("gardens", "enablemushroomgardenGeneration", true).getBoolean(true);
/* 370 */     enablestalkgardenGeneration = config.get("gardens", "enablestalkgardenGeneration", true).getBoolean(true);
/* 371 */     enabletextilegardenGeneration = config.get("gardens", "enabletextilegardenGeneration", true).getBoolean(true);
/* 372 */     enabletropicalgardenGeneration = config.get("gardens", "enabletropicalgardenGeneration", true).getBoolean(true);
/* 373 */     enablewatergardenGeneration = config.get("gardens", "enablewatergardenGeneration", true).getBoolean(true);
/* 374 */     temperatefruittreeRarity = config.get("fruit trees", "temperatefruittreeRarity", 15).getInt();
/* 375 */     tropicalfruittreeRarity = config.get("fruit trees", "tropicalfruittreeRarity", 10).getInt();
/* 376 */     coniferousfruittreeRarity = config.get("fruit trees", "coniferousfruittreeRarity", 15).getInt();
/* 377 */     appletreeGeneration = config.get("fruit trees", "appletreeGeneration", true).getBoolean(true);
/* 378 */     almondtreeGeneration = config.get("fruit trees", "almondtreeGeneration", true).getBoolean(true);
/* 379 */     apricottreeGeneration = config.get("fruit trees", "apricottreeGeneration", true).getBoolean(true);
/* 380 */     avocadotreeGeneration = config.get("fruit trees", "avocadotreeGeneration", true).getBoolean(true);
/* 381 */     bananatreeGeneration = config.get("fruit trees", "bananatreeGeneration", true).getBoolean(true);
/* 382 */     cashewtreeGeneration = config.get("fruit trees", "cashewtreeGeneration", true).getBoolean(true);
/* 383 */     cherrytreeGeneration = config.get("fruit trees", "cherrytreeGeneration", true).getBoolean(true);
/* 384 */     chestnuttreeGeneration = config.get("fruit trees", "chestnuttreeGeneration", true).getBoolean(true);
/* 385 */     cinnamontreeGeneration = config.get("fruit trees", "cinnamontreeGeneration", true).getBoolean(true);
/* 386 */     coconuttreeGeneration = config.get("fruit trees", "coconuttreeGeneration", true).getBoolean(true);
/* 387 */     datetreeGeneration = config.get("fruit trees", "datetreeGeneration", true).getBoolean(true);
/* 388 */     dragonfruittreeGeneration = config.get("fruit trees", "dragonfruittreeGeneration", true).getBoolean(true);
/* 389 */     duriantreeGeneration = config.get("fruit trees", "duriantreeGeneration", true).getBoolean(true);
/* 390 */     figtreeGeneration = config.get("fruit trees", "figtreeGeneration", true).getBoolean(true);
/* 391 */     grapefruittreeGeneration = config.get("fruit trees", "grapefruittreeGeneration", true).getBoolean(true);
/* 392 */     lemontreeGeneration = config.get("fruit trees", "lemontreeGeneration", true).getBoolean(true);
/* 393 */     limetreeGeneration = config.get("fruit trees", "limetreeGeneration", true).getBoolean(true);
/* 394 */     mapletreeGeneration = config.get("fruit trees", "mapletreeGeneration", true).getBoolean(true);
/* 395 */     mangotreeGeneration = config.get("fruit trees", "mangotreeGeneration", true).getBoolean(true);
/* 396 */     nutmegtreeGeneration = config.get("fruit trees", "nutmegtreeGeneration", true).getBoolean(true);
/* 397 */     olivetreeGeneration = config.get("fruit trees", "olivetreeGeneration", true).getBoolean(true);
/* 398 */     orangetreeGeneration = config.get("fruit trees", "orangetreeGeneration", true).getBoolean(true);
/* 399 */     papayatreeGeneration = config.get("fruit trees", "papayatreeGeneration", true).getBoolean(true);
/* 400 */     paperbarktreeGeneration = config.get("fruit trees", "paperbarktreeGeneration", true).getBoolean(true);
/* 401 */     peachtreeGeneration = config.get("fruit trees", "peachtreeGeneration", true).getBoolean(true);
/* 402 */     peartreeGeneration = config.get("fruit trees", "peartreeGeneration", true).getBoolean(true);
/* 403 */     pecantreeGeneration = config.get("fruit trees", "pecantreeGeneration", true).getBoolean(true);
/* 404 */     peppercorntreeGeneration = config.get("fruit trees", "peppercorntreeGeneration", true).getBoolean(true);
/* 405 */     persimmontreeGeneration = config.get("fruit trees", "persimmontreeGeneration", true).getBoolean(true);
/* 406 */     pistachiotreeGeneration = config.get("fruit trees", "pistachiotreeGeneration", true).getBoolean(true);
/* 407 */     plumtreeGeneration = config.get("fruit trees", "plumtreeGeneration", true).getBoolean(true);
/* 408 */     pomegranatetreeGeneration = config.get("fruit trees", "pomegranatetreeGeneration", true).getBoolean(true);
/* 409 */     starfruittreeGeneration = config.get("fruit trees", "starfruittreeGeneration", true).getBoolean(true);
/* 410 */     vanillabeantreeGeneration = config.get("fruit trees", "vanillabeantreeGeneration", true).getBoolean(true);
/* 411 */     walnuttreeGeneration = config.get("fruit trees", "walnuttreeGeneration", true).getBoolean(true);
/* 412 */     gooseberrytreeGeneration = config.get("fruit trees", "gooseberrytreeGeneration", true).getBoolean(true);
/*     */     
/* 414 */     cropsdropSeeds = config.get("crops", "cropsdropSeeds", false).getBoolean(false);
/* 415 */     rightclickmatureshowfruitHearts = config.get("fruit trees", "rightclickmatureshowfruitHearts", false).getBoolean(false);
/* 416 */     rightclickmatureshowcropHearts = config.get("crops", "rightclickmatureshowcropHearts", false).getBoolean(false);
/* 417 */     rightclickharvestCrop = config.get("crops", "rightclickharvestCrop", true).getBoolean(true);
/* 418 */     rightclickharvestFruit = config.get("fruit trees", "rightclickharvestFruit", true).getBoolean(true);
/* 419 */     gardensdropSeeds = config.get("gardens", "gardensdropSeeds", false).getBoolean(false);
/* 420 */     enablecropspecialplanting = config.get("crops", "enablecropspecialplanting", true).getBoolean(true);
/*     */     
/* 422 */     candlerecipeAmount = config.get("candles", "candlerecipeAmount", 4).getInt();
/* 423 */     candlelightLevel = (float)config.get("candles", "candlelightLevel", 0.9375D).getDouble(0.9375D);
/*     */     
/* 425 */     enabletwilightforestfruittreeGen = config.get("dimensions", "enabletwilightforestfruittreeGen", false).getBoolean(false);
/* 426 */     enabletwilightforestgardenGen = config.get("dimensions", "enabletwilightforestgardenGen", false).getBoolean(false);
/* 427 */     enableAroma1997sdimensionalworldfruittreeGen = config.get("dimensions", "enableAroma1997sdimensionalworldfruittreeGen", false).getBoolean(false);
/* 428 */     enableAroma1997sdimensionalworldgardenGen = config.get("dimensions", "enableAroma1997sdimensionalworldgardenGen", false).getBoolean(false);
/*     */   }
/*     */   
/*     */   public static void registerBlocks()
/*     */   {
/* 433 */     pamcuttingBoard = new BlockPamCuttingBoard().setHardness(1.0F).setBlockName("cuttingboard");
/* 434 */     GameRegistry.registerBlock(pamcuttingBoard, "cuttingboard");
/*     */     
/* 436 */     pamPot = new BlockPamPot().setHardness(1.0F).setBlockName("pot");
/* 437 */     GameRegistry.registerBlock(pamPot, "pot");
/*     */     
/* 439 */     pamBeehive = new BlockPamBeehive(Material.plants).setHardness(1.0F).setBlockName("beehive");
/* 440 */     GameRegistry.registerBlock(pamBeehive, "beehive");
/*     */     
/* 442 */     pamApiary = new BlockPamApiary().setHardness(1.0F).setBlockName("apiary");
/* 443 */     GameRegistry.registerBlock(pamApiary, "apiary");
/*     */     
/* 445 */     pamPresser = new BlockPamPresser().setHardness(1.0F).setBlockName("presser");
/* 446 */     GameRegistry.registerBlock(pamPresser, "presser");
/*     */     
/* 448 */     pamSink = new BlockPamSink().setHardness(1.0F).setBlockName("sink");
/* 449 */     GameRegistry.registerBlock(pamSink, "sink");
/*     */     
/* 451 */     pamSalt = new BlockPamSalt().setHardness(1.5F).setResistance(10.0F).setBlockTextureName("harvestcraft:salt").setBlockName("salt").setCreativeTab(harvestcraft.tabHarvestCraft);
/* 452 */     GameRegistry.registerBlock(pamSalt, "salt");
/*     */     
/* 454 */     pamcompressedsaltBlock = new BlockPamSalt().setHardness(1.5F).setResistance(10.0F).setBlockTextureName("harvestcraft:pamcompressedsaltBlock").setBlockName("pamcompressedsaltBlock").setCreativeTab(harvestcraft.tabHarvestCraft);
/* 455 */     GameRegistry.registerBlock(pamcompressedsaltBlock, "spamcompressedsaltBlockalt");
/*     */     
/* 457 */     pamMarket = new BlockPamMarket(Material.wood).setHardness(1.0F).setResistance(1.0F).setBlockName("market");
/* 458 */     GameRegistry.registerBlock(pamMarket, "market");
/*     */     
/* 460 */     pamOven = new BlockPamOven(false).setHardness(1.5F).setResistance(10.0F).setBlockName("oven").setCreativeTab(harvestcraft.tabHarvestCraft);
/* 461 */     GameRegistry.registerBlock(pamOven, "oven");
/* 462 */     pamOvenon = new BlockPamOven(true).setHardness(1.5F).setResistance(10.0F).setBlockName("ovenon");
/* 463 */     GameRegistry.registerBlock(pamOvenon, "ovenon");
/*     */     
/* 465 */     pamChurn = new BlockPamChurn(false).setHardness(1.5F).setResistance(10.0F).setBlockName("churn").setCreativeTab(harvestcraft.tabHarvestCraft);
/* 466 */     GameRegistry.registerBlock(pamChurn, "churn");
/* 467 */     pamChurnon = new BlockPamChurn(true).setHardness(1.5F).setResistance(10.0F).setBlockName("churnon");
/* 468 */     GameRegistry.registerBlock(pamChurnon, "churnon");
/*     */     
/* 470 */     pamQuern = new BlockPamQuern(false).setHardness(1.5F).setResistance(10.0F).setBlockName("quern").setCreativeTab(harvestcraft.tabHarvestCraft);
/* 471 */     GameRegistry.registerBlock(pamQuern, "quern");
/* 472 */     pamQuernon = new BlockPamQuern(true).setHardness(1.5F).setResistance(10.0F).setBlockName("quernon");
/* 473 */     GameRegistry.registerBlock(pamQuernon, "quernon");
/*     */     
/* 475 */     pamfishTrap = new BlockPamFishTrap().setHardness(1.0F).setBlockName("fishtrap");
/* 476 */     GameRegistry.registerBlock(pamfishTrap, "fishtrap");
/*     */     
/* 478 */     pamanimalTrap = new BlockPamAnimalTrap().setHardness(1.0F).setBlockName("animaltrap");
/* 479 */     GameRegistry.registerBlock(pamanimalTrap, "animaltrap");
/*     */     
/* 481 */     pamberryGarden = new BlockPamNormalGarden(0).setBlockTextureName("harvestcraft:berrygarden0").setBlockName("berrygarden");
/* 482 */     GameRegistry.registerBlock(pamberryGarden, "berrygarden");
/*     */     
/* 484 */     pamdesertGarden = new BlockPamDesertGarden(0).setBlockTextureName("harvestcraft:desertgarden0").setBlockName("desertgarden");
/* 485 */     GameRegistry.registerBlock(pamdesertGarden, "desertgarden");
/*     */     
/* 487 */     pamgrassGarden = new BlockPamNormalGarden(0).setBlockTextureName("harvestcraft:grassgarden0").setBlockName("grassgarden");
/* 488 */     GameRegistry.registerBlock(pamgrassGarden, "grassgarden");
/*     */     
/* 490 */     pamgourdGarden = new BlockPamNormalGarden(0).setBlockTextureName("harvestcraft:gourdgarden0").setBlockName("gourdgarden");
/* 491 */     GameRegistry.registerBlock(pamgourdGarden, "gourdgarden");
/*     */     
/* 493 */     pamgroundGarden = new BlockPamNormalGarden(0).setBlockTextureName("harvestcraft:groundgarden0").setBlockName("groundgarden");
/* 494 */     GameRegistry.registerBlock(pamgroundGarden, "groundgarden");
/*     */     
/* 496 */     pamherbGarden = new BlockPamNormalGarden(0).setBlockTextureName("harvestcraft:herbgarden0").setBlockName("herbgarden");
/* 497 */     GameRegistry.registerBlock(pamherbGarden, "herbgarden");
/*     */     
/* 499 */     pamleafyGarden = new BlockPamNormalGarden(0).setBlockTextureName("harvestcraft:leafygarden0").setBlockName("leafygarden");
/* 500 */     GameRegistry.registerBlock(pamleafyGarden, "leafygarden");
/*     */     
/* 502 */     pammushroomGarden = new BlockPamMushroomGarden(0).setBlockTextureName("harvestcraft:mushroomgarden0").setBlockName("mushroomgarden");
/* 503 */     GameRegistry.registerBlock(pammushroomGarden, "mushroomgarden");
/*     */     
/* 505 */     pamstalkGarden = new BlockPamNormalGarden(0).setBlockTextureName("harvestcraft:stalkgarden0").setBlockName("stalkgarden");
/* 506 */     GameRegistry.registerBlock(pamstalkGarden, "stalkgarden");
/*     */     
/* 508 */     pamtextileGarden = new BlockPamNormalGarden(0).setBlockTextureName("harvestcraft:textilegarden0").setBlockName("textilegarden");
/* 509 */     GameRegistry.registerBlock(pamtextileGarden, "textilegarden");
/*     */     
/* 511 */     pamtropicalGarden = new BlockPamNormalGarden(0).setBlockTextureName("harvestcraft:tropicalgarden0").setBlockName("tropicalgarden");
/* 512 */     GameRegistry.registerBlock(pamtropicalGarden, "tropicalgarden");
/*     */     
/* 514 */     pamwaterGarden = new BlockPamWaterGarden(0).setBlockTextureName("harvestcraft:watergarden0").setBlockName("watergarden");
/* 515 */     GameRegistry.registerBlock(pamwaterGarden, "watergarden");
/*     */     
/* 517 */     pamApple = new BlockPamFruit("apple").setBlockName("pamApple");
/* 518 */     GameRegistry.registerBlock(pamApple, "pamApple");
/* 519 */     pamappleSapling = new BlockPamSapling().setBlockName("pamappleSapling");
/* 520 */     GameRegistry.registerBlock(pamappleSapling, "pamappleSapling");
/*     */     
/* 522 */     pamAlmond = new BlockPamFruit("almond").setBlockName("pamAlmond");
/* 523 */     GameRegistry.registerBlock(pamAlmond, "pamAlmond");
/* 524 */     pamalmondSapling = new BlockPamSapling().setBlockName("pamalmondSapling");
/* 525 */     GameRegistry.registerBlock(pamalmondSapling, "pamalmondSapling");
/*     */     
/* 527 */     pamApricot = new BlockPamFruit("apricot").setBlockName("pamApricot");
/* 528 */     GameRegistry.registerBlock(pamApricot, "pamApricot");
/* 529 */     pamapricotSapling = new BlockPamSapling().setBlockName("pamapricotSapling");
/* 530 */     GameRegistry.registerBlock(pamapricotSapling, "pamapricotSapling");
/*     */     
/* 532 */     pamAvocado = new BlockPamFruit("avocado").setBlockName("pamAvocado");
/* 533 */     GameRegistry.registerBlock(pamAvocado, "pamAvocado");
/* 534 */     pamavocadoSapling = new BlockPamSapling().setBlockName("pamavocadoSapling");
/* 535 */     GameRegistry.registerBlock(pamavocadoSapling, "pamavocadoSapling");
/*     */     
/* 537 */     pamBanana = new BlockPamFruit("banana").setBlockName("pamBanana");
/* 538 */     GameRegistry.registerBlock(pamBanana, "pamBanana");
/* 539 */     pambananaSapling = new BlockPamSapling().setBlockName("pambananaSapling");
/* 540 */     GameRegistry.registerBlock(pambananaSapling, "pambananaSapling");
/*     */     
/* 542 */     pamCashew = new BlockPamFruit("cashew").setBlockName("pamCashew");
/* 543 */     GameRegistry.registerBlock(pamCashew, "pamCashew");
/* 544 */     pamcashewSapling = new BlockPamSapling().setBlockName("pamcashewSapling");
/* 545 */     GameRegistry.registerBlock(pamcashewSapling, "pamcashewSapling");
/*     */     
/* 547 */     pamCherry = new BlockPamFruit("cherry").setBlockName("pamCherry");
/* 548 */     GameRegistry.registerBlock(pamCherry, "pamCherry");
/* 549 */     pamcherrySapling = new BlockPamSapling().setBlockName("pamcherrySapling");
/* 550 */     GameRegistry.registerBlock(pamcherrySapling, "pamcherrySapling");
/*     */     
/* 552 */     pamChestnut = new BlockPamFruit("chestnut").setBlockName("pamChestnut");
/* 553 */     GameRegistry.registerBlock(pamChestnut, "pamChestnut");
/* 554 */     pamchestnutSapling = new BlockPamSapling().setBlockName("pamchestnutSapling");
/* 555 */     GameRegistry.registerBlock(pamchestnutSapling, "pamchestnutSapling");
/*     */     
/* 557 */     pamCinnamon = new BlockPamFruitingLog("pamCinnamon", "cinnamon"); //pamCinnamon = new BlockPamFruit("cinnamon").setBlockName("pamCinnamon");
/* 558 */     GameRegistry.registerBlock(pamCinnamon, "pamCinnamon");
/* 559 */     pamcinnamonSapling = new BlockPamSapling().setBlockName("pamcinnamonSapling");
/* 560 */     GameRegistry.registerBlock(pamcinnamonSapling, "pamcinnamonSapling");
/*     */     
/* 562 */     pamCoconut = new BlockPamFruit("coconut").setBlockName("pamCoconut");
/* 563 */     GameRegistry.registerBlock(pamCoconut, "pamCoconut");
/* 564 */     pamcoconutSapling = new BlockPamSapling().setBlockName("pamcoconutSapling");
/* 565 */     GameRegistry.registerBlock(pamcoconutSapling, "pamcoconutSapling");
/*     */     
/* 567 */     pamDate = new BlockPamFruit("date").setBlockName("pamDate");
/* 568 */     GameRegistry.registerBlock(pamDate, "pamDate");
/* 569 */     pamdateSapling = new BlockPamSapling().setBlockName("pamdateSapling");
/* 570 */     GameRegistry.registerBlock(pamdateSapling, "pamdateSapling");
/*     */     
/* 572 */     pamDragonfruit = new BlockPamFruit("dragonfruit").setBlockName("pamDragonfruit");
/* 573 */     GameRegistry.registerBlock(pamDragonfruit, "pamDragonfruit");
/* 574 */     pamdragonfruitSapling = new BlockPamSapling().setBlockName("pamdragonfruitSapling");
/* 575 */     GameRegistry.registerBlock(pamdragonfruitSapling, "pamdragonfruitSapling");
/*     */     
/* 577 */     pamDurian = new BlockPamFruit("durian").setBlockName("pamDurian");
/* 578 */     GameRegistry.registerBlock(pamDurian, "pamDurian");
/* 579 */     pamdurianSapling = new BlockPamSapling().setBlockName("pamdurianSapling");
/* 580 */     GameRegistry.registerBlock(pamdurianSapling, "pamdurianSapling");
/*     */     
/* 582 */     pamFig = new BlockPamFruit("fig").setBlockName("pamFig");
/* 583 */     GameRegistry.registerBlock(pamFig, "pamFig");
/* 584 */     pamfigSapling = new BlockPamSapling().setBlockName("pamfigSapling");
/* 585 */     GameRegistry.registerBlock(pamfigSapling, "pamfigSapling");
/*     */     
/* 587 */     pamGrapefruit = new BlockPamFruit("grapefruit").setBlockName("pamGrapefruit");
/* 588 */     GameRegistry.registerBlock(pamGrapefruit, "pamGrapefruit");
/* 589 */     pamgrapefruitSapling = new BlockPamSapling().setBlockName("pamgrapefruitSapling");
/* 590 */     GameRegistry.registerBlock(pamgrapefruitSapling, "pamgrapefruitSapling");
/*     */     
/* 592 */     pamLemon = new BlockPamFruit("lemon").setBlockName("pamLemon");
/* 593 */     GameRegistry.registerBlock(pamLemon, "pamLemon");
/* 594 */     pamlemonSapling = new BlockPamSapling().setBlockName("pamlemonSapling");
/* 595 */     GameRegistry.registerBlock(pamlemonSapling, "pamlemonSapling");
/*     */     
/* 597 */     pamLime = new BlockPamFruit("lime").setBlockName("pamLime");
/* 598 */     GameRegistry.registerBlock(pamLime, "pamLime");
/* 599 */     pamlimeSapling = new BlockPamSapling().setBlockName("pamlimeSapling");
/* 600 */     GameRegistry.registerBlock(pamlimeSapling, "pamlimeSapling");
/*     */     
/* 602 */     pamMaple = new BlockPamFruitingLog("pamMaple", "maple"); //pamMaple = new BlockPamFruit("maple").setBlockName("pamMaple");
/* 603 */     GameRegistry.registerBlock(pamMaple, "pamMaple");
/* 604 */     pammapleSapling = new BlockPamSapling().setBlockName("pammapleSapling");
/* 605 */     GameRegistry.registerBlock(pammapleSapling, "pammapleSapling");
/*     */     
/* 607 */     pamMango = new BlockPamFruit("mango").setBlockName("pamMango");
/* 608 */     GameRegistry.registerBlock(pamMango, "pamMango");
/* 609 */     pammangoSapling = new BlockPamSapling().setBlockName("pammangoSapling");
/* 610 */     GameRegistry.registerBlock(pammangoSapling, "pammangoSapling");
/*     */     
/* 612 */     pamNutmeg = new BlockPamFruit("nutmeg").setBlockName("pamNutmeg");
/* 613 */     GameRegistry.registerBlock(pamNutmeg, "pamNutmeg");
/* 614 */     pamnutmegSapling = new BlockPamSapling().setBlockName("pamnutmegSapling");
/* 615 */     GameRegistry.registerBlock(pamnutmegSapling, "pamnutmegSapling");
/*     */     
/* 617 */     pamOlive = new BlockPamFruit("olive").setBlockName("pamOlive");
/* 618 */     GameRegistry.registerBlock(pamOlive, "pamOlive");
/* 619 */     pamoliveSapling = new BlockPamSapling().setBlockName("pamoliveSapling");
/* 620 */     GameRegistry.registerBlock(pamoliveSapling, "pamoliveSapling");
/*     */     
/* 622 */     pamOrange = new BlockPamFruit("orange").setBlockName("pamOrange");
/* 623 */     GameRegistry.registerBlock(pamOrange, "pamOrange");
/* 624 */     pamorangeSapling = new BlockPamSapling().setBlockName("pamorangeSapling");
/* 625 */     GameRegistry.registerBlock(pamorangeSapling, "pamorangeSapling");
/*     */     
/* 627 */     pamPapaya = new BlockPamFruit("papaya").setBlockName("pamPapaya");
/* 628 */     GameRegistry.registerBlock(pamPapaya, "pamPapaya");
/* 629 */     pampapayaSapling = new BlockPamSapling().setBlockName("pampapayaSapling");
/* 630 */     GameRegistry.registerBlock(pampapayaSapling, "pampapayaSapling");
/*     */     
/* 632 */     pamPaperbark = new BlockPamFruitingLog("pamPaperbark", "paperbark"); //pamPaperbark = new BlockPamFruit("paperbark").setBlockName("pamPaperbark");
/* 633 */     GameRegistry.registerBlock(pamPaperbark, "pamPaperbark");
	((BlockPamFruitingLog)pamPaperbark).fruit = Items.paper;
/* 634 */     pampaperbarkSapling = new BlockPamSapling().setBlockName("pampaperbarkSapling");
/* 635 */     GameRegistry.registerBlock(pampaperbarkSapling, "pampaperbarkSapling");
/*     */     
/* 637 */     pamPeach = new BlockPamFruit("peach").setBlockName("pamPeach");
/* 638 */     GameRegistry.registerBlock(pamPeach, "pamPeach");
/* 639 */     pampeachSapling = new BlockPamSapling().setBlockName("pampeachSapling");
/* 640 */     GameRegistry.registerBlock(pampeachSapling, "pampeachSapling");
/*     */     
/* 642 */     pamPear = new BlockPamFruit("pear").setBlockName("pamPear");
/* 643 */     GameRegistry.registerBlock(pamPear, "pamPear");
/* 644 */     pampearSapling = new BlockPamSapling().setBlockName("pampearSapling");
/* 645 */     GameRegistry.registerBlock(pampearSapling, "pampearSapling");
/*     */     
/* 647 */     pamPecan = new BlockPamFruit("pecan").setBlockName("pamPecan");
/* 648 */     GameRegistry.registerBlock(pamPecan, "pamPecan");
/* 649 */     pampecanSapling = new BlockPamSapling().setBlockName("pampecanSapling");
/* 650 */     GameRegistry.registerBlock(pampecanSapling, "pampecanSapling");
/*     */     
/* 652 */     pamPeppercorn = new BlockPamFruit("peppercorn").setBlockName("pamPeppercorn");
/* 653 */     GameRegistry.registerBlock(pamPeppercorn, "pamPeppercorn");
/* 654 */     pampeppercornSapling = new BlockPamSapling().setBlockName("pampeppercornSapling");
/* 655 */     GameRegistry.registerBlock(pampeppercornSapling, "pampeppercornSapling");
/*     */     
/* 657 */     pamPersimmon = new BlockPamFruit("persimmon").setBlockName("pamPersimmon");
/* 658 */     GameRegistry.registerBlock(pamPersimmon, "pamPersimmon");
/* 659 */     pampersimmonSapling = new BlockPamSapling().setBlockName("pampersimmonSapling");
/* 660 */     GameRegistry.registerBlock(pampersimmonSapling, "pampersimmonSapling");
/*     */     
/* 662 */     pamPistachio = new BlockPamFruit("pistachio").setBlockName("pamPistachio");
/* 663 */     GameRegistry.registerBlock(pamPistachio, "pamPistachio");
/* 664 */     pampistachioSapling = new BlockPamSapling().setBlockName("pampistachioSapling");
/* 665 */     GameRegistry.registerBlock(pampistachioSapling, "pampistachioSapling");
/*     */     
/* 667 */     pamPlum = new BlockPamFruit("plum").setBlockName("pamPlum");
/* 668 */     GameRegistry.registerBlock(pamPlum, "pamPlum");
/* 669 */     pamplumSapling = new BlockPamSapling().setBlockName("pamplumSapling");
/* 670 */     GameRegistry.registerBlock(pamplumSapling, "pamplumSapling");
/*     */     
/* 672 */     pamPomegranate = new BlockPamFruit("pomegranate").setBlockName("pamPomegranate");
/* 673 */     GameRegistry.registerBlock(pamPomegranate, "pamPomegranate");
/* 674 */     pampomegranateSapling = new BlockPamSapling().setBlockName("pampomegranateSapling");
/* 675 */     GameRegistry.registerBlock(pampomegranateSapling, "pampomegranateSapling");
/*     */     
/* 677 */     pamStarfruit = new BlockPamFruit("starfruit").setBlockName("pamStarfruit");
/* 678 */     GameRegistry.registerBlock(pamStarfruit, "pamStarfruit");
/* 679 */     pamstarfruitSapling = new BlockPamSapling().setBlockName("pamstarfruitSapling");
/* 680 */     GameRegistry.registerBlock(pamstarfruitSapling, "pamstarfruitSapling");
/*     */     
/* 682 */     pamVanillabean = new BlockPamFruit("vanillabean").setBlockName("pamVanillabean");
/* 683 */     GameRegistry.registerBlock(pamVanillabean, "pamVanillabean");
/* 684 */     pamvanillabeanSapling = new BlockPamSapling().setBlockName("pamvanillabeanSapling");
/* 685 */     GameRegistry.registerBlock(pamvanillabeanSapling, "pamvanillabeanSapling");
/*     */     
/* 687 */     pamWalnut = new BlockPamFruit("walnut").setBlockName("pamWalnut");
/* 688 */     GameRegistry.registerBlock(pamWalnut, "pamWalnut");
/* 689 */     pamwalnutSapling = new BlockPamSapling().setBlockName("pamwalnutSapling");
/* 690 */     GameRegistry.registerBlock(pamwalnutSapling, "pamwalnutSapling");
/*     */     
/* 692 */     pamGooseberry = new BlockPamFruit("gooseberry").setBlockName("pamGooseberry");
/* 693 */     GameRegistry.registerBlock(pamGooseberry, "pamGooseberry");
/* 694 */     pamgooseberrySapling = new BlockPamSapling().setBlockName("pamgooseberrySapling");
/* 695 */     GameRegistry.registerBlock(pamgooseberrySapling, "pamgooseberrySapling");
/*     */     
/* 697 */     pamblackberryCrop = new BlockPamCrop().setBlockTextureName("blackberry").setBlockName("pamblackberryCrop");
/* 698 */     GameRegistry.registerBlock(pamblackberryCrop, "pamblackberryCrop");
/* 699 */     pamblueberryCrop = new BlockPamCrop().setBlockTextureName("blueberry").setBlockName("pamblueberryCrop");
/* 700 */     GameRegistry.registerBlock(pamblueberryCrop, "pamblueberryCrop");
/* 701 */     pamcandleberryCrop = new BlockPamCrop().setBlockTextureName("candleberry").setBlockName("pamcandleberryCrop");
/* 702 */     GameRegistry.registerBlock(pamcandleberryCrop, "pamcandleberryCrop");
/* 703 */     pamraspberryCrop = new BlockPamCrop().setBlockTextureName("raspberry").setBlockName("pamraspberryCrop");
/* 704 */     GameRegistry.registerBlock(pamraspberryCrop, "pamraspberryCrop");
/* 705 */     pamstrawberryCrop = new BlockPamCrop().setBlockTextureName("strawberry").setBlockName("pamstrawberryCrop");
/* 706 */     GameRegistry.registerBlock(pamstrawberryCrop, "pamstrawberryCrop");
/* 707 */     pamcactusfruitCrop = new BlockPamCrop().setBlockTextureName("cactusfruit").setBlockName("pamcactusfruitCrop");
/* 708 */     GameRegistry.registerBlock(pamcactusfruitCrop, "pamcactusfruitCrop");
/* 709 */     pamasparagusCrop = new BlockPamCrop().setBlockTextureName("asparagus").setBlockName("pamasparagusCrop");
/* 710 */     GameRegistry.registerBlock(pamasparagusCrop, "pamasparagusCrop");
/* 711 */     pambarleyCrop = new BlockPamCrop().setBlockTextureName("barley").setBlockName("pambarleyCrop");
/* 712 */     GameRegistry.registerBlock(pambarleyCrop, "pambarleyCrop");
/* 713 */     pamoatsCrop = new BlockPamCrop().setBlockTextureName("oats").setBlockName("pamoatsCrop");
/* 714 */     GameRegistry.registerBlock(pamoatsCrop, "pamoatsCrop");
/* 715 */     pamryeCrop = new BlockPamCrop().setBlockTextureName("rye").setBlockName("pamryeCrop");
/* 716 */     GameRegistry.registerBlock(pamryeCrop, "pamryeCrop");
/* 717 */     pamcornCrop = new BlockPamCrop().setBlockTextureName("corn").setBlockName("pamcornCrop");
/* 718 */     GameRegistry.registerBlock(pamcornCrop, "pamcornCrop");
/* 719 */     pambambooshootCrop = new BlockPamCrop().setBlockTextureName("bambooshoot").setBlockName("pambambooshootCrop");
/* 720 */     GameRegistry.registerBlock(pambambooshootCrop, "pambambooshootCrop");
/* 721 */     pamcantaloupeCrop = new BlockPamCrop().setBlockTextureName("cantaloupe").setBlockName("pamcantaloupeCrop");
/* 722 */     GameRegistry.registerBlock(pamcantaloupeCrop, "pamcantaloupeCrop");
/* 723 */     pamcucumberCrop = new BlockPamCrop().setBlockTextureName("cucumber").setBlockName("pamcucumberCrop");
/* 724 */     GameRegistry.registerBlock(pamcucumberCrop, "pamcucumberCrop");
/* 725 */     pamwintersquashCrop = new BlockPamCrop().setBlockTextureName("wintersquash").setBlockName("pamwintersquashCrop");
/* 726 */     GameRegistry.registerBlock(pamwintersquashCrop, "pamwintersquashCrop");
/* 727 */     pamzucchiniCrop = new BlockPamCrop().setBlockTextureName("zucchini").setBlockName("pamzucchiniCrop");
/* 728 */     GameRegistry.registerBlock(pamzucchiniCrop, "pamzucchiniCrop");
/* 729 */     pambeetCrop = new BlockPamCrop().setBlockTextureName("beet").setBlockName("pambeetCrop");
/* 730 */     GameRegistry.registerBlock(pambeetCrop, "pambeetCrop");
/* 731 */     pamonionCrop = new BlockPamCrop().setBlockTextureName("onion").setBlockName("pamonionCrop");
/* 732 */     GameRegistry.registerBlock(pamonionCrop, "pamonionCrop");
/* 733 */     pamparsnipCrop = new BlockPamCrop().setBlockTextureName("parsnip").setBlockName("pamparsnipCrop");
/* 734 */     GameRegistry.registerBlock(pamparsnipCrop, "pamparsnipCrop");
/* 735 */     pampeanutCrop = new BlockPamCrop().setBlockTextureName("peanut").setBlockName("pampeanutCrop");
/* 736 */     GameRegistry.registerBlock(pampeanutCrop, "pampeanutCrop");
/* 737 */     pamradishCrop = new BlockPamCrop().setBlockTextureName("radish").setBlockName("pamradishCrop");
/* 738 */     GameRegistry.registerBlock(pamradishCrop, "pamradishCrop");
/* 739 */     pamrutabagaCrop = new BlockPamCrop().setBlockTextureName("rutabaga").setBlockName("pamrutabagaCrop");
/* 740 */     GameRegistry.registerBlock(pamrutabagaCrop, "pamrutabagaCrop");
/* 741 */     pamsweetpotatoCrop = new BlockPamCrop().setBlockTextureName("sweetpotato").setBlockName("pamsweetpotatoCrop");
/* 742 */     GameRegistry.registerBlock(pamsweetpotatoCrop, "pamsweetpotatoCrop");
/* 743 */     pamturnipCrop = new BlockPamCrop().setBlockTextureName("turnip").setBlockName("pamturnipCrop");
/* 744 */     GameRegistry.registerBlock(pamturnipCrop, "pamturnipCrop");
/* 745 */     pamrhubarbCrop = new BlockPamCrop().setBlockTextureName("rhubarb").setBlockName("pamrhubarbCrop");
/* 746 */     GameRegistry.registerBlock(pamrhubarbCrop, "pamrhubarbCrop");
/* 747 */     pamceleryCrop = new BlockPamCrop().setBlockTextureName("celery").setBlockName("pamceleryCrop");
/* 748 */     GameRegistry.registerBlock(pamceleryCrop, "pamceleryCrop");
/* 749 */     pamgarlicCrop = new BlockPamCrop().setBlockTextureName("garlic").setBlockName("pamgarlicCrop");
/* 750 */     GameRegistry.registerBlock(pamgarlicCrop, "pamgarlicCrop");
/* 751 */     pamgingerCrop = new BlockPamCrop().setBlockTextureName("ginger").setBlockName("pamgingerCrop");
/* 752 */     GameRegistry.registerBlock(pamgingerCrop, "pamgingerCrop");
/* 753 */     pamspiceleafCrop = new BlockPamCrop().setBlockTextureName("spiceleaf").setBlockName("pamspiceleafCrop");
/* 754 */     GameRegistry.registerBlock(pamspiceleafCrop, "pamspiceleafCrop");
/* 755 */     pamtealeafCrop = new BlockPamCrop().setBlockTextureName("tealeaf").setBlockName("pamtealeafCrop");
/* 756 */     GameRegistry.registerBlock(pamtealeafCrop, "pamtealeafCrop");
/* 757 */     pamcoffeebeanCrop = new BlockPamCrop().setBlockTextureName("coffeebean").setBlockName("pamcoffeebeanCrop");
/* 758 */     GameRegistry.registerBlock(pamcoffeebeanCrop, "pamcoffeebeanCrop");
/* 759 */     pammustardseedsCrop = new BlockPamCrop().setBlockTextureName("mustardseeds").setBlockName("pammustardseedsCrop");
/* 760 */     GameRegistry.registerBlock(pammustardseedsCrop, "pammustardseedsCrop");
/* 761 */     pambroccoliCrop = new BlockPamCrop().setBlockTextureName("broccoli").setBlockName("pambroccoliCrop");
/* 762 */     GameRegistry.registerBlock(pambroccoliCrop, "pambroccoliCrop");
/* 763 */     pamcauliflowerCrop = new BlockPamCrop().setBlockTextureName("cauliflower").setBlockName("pamcauliflowerCrop");
/* 764 */     GameRegistry.registerBlock(pamcauliflowerCrop, "pamcauliflowerCrop");
/* 765 */     pamleekCrop = new BlockPamCrop().setBlockTextureName("leek").setBlockName("pamleekCrop");
/* 766 */     GameRegistry.registerBlock(pamleekCrop, "pamleekCrop");
/* 767 */     pamlettuceCrop = new BlockPamCrop().setBlockTextureName("lettuce").setBlockName("pamlettuceCrop");
/* 768 */     GameRegistry.registerBlock(pamlettuceCrop, "pamlettuceCrop");
/* 769 */     pamscallionCrop = new BlockPamCrop().setBlockTextureName("scallion").setBlockName("pamscallionCrop");
/* 770 */     GameRegistry.registerBlock(pamscallionCrop, "pamscallionCrop");
/* 771 */     pamartichokeCrop = new BlockPamCrop().setBlockTextureName("artichoke").setBlockName("pamartichokeCrop");
/* 772 */     GameRegistry.registerBlock(pamartichokeCrop, "pamartichokeCrop");
/* 773 */     pambrusselsproutCrop = new BlockPamCrop().setBlockTextureName("brusselsprout").setBlockName("pambrusselsproutCrop");
/* 774 */     GameRegistry.registerBlock(pambrusselsproutCrop, "pambrusselsproutCrop");
/* 775 */     pamcabbageCrop = new BlockPamCrop().setBlockTextureName("cabbage").setBlockName("pamcabbageCrop");
/* 776 */     GameRegistry.registerBlock(pamcabbageCrop, "pamcabbageCrop");
/* 777 */     pamspinachCrop = new BlockPamCrop().setBlockTextureName("spinach").setBlockName("pamspinachCrop");
/* 778 */     GameRegistry.registerBlock(pamspinachCrop, "pamspinachCrop");
/* 779 */     pamwhitemushroomCrop = new BlockPamCrop().setBlockTextureName("whitemushroom").setBlockName("pamwhitemushroomCrop");
/* 780 */     GameRegistry.registerBlock(pamwhitemushroomCrop, "pamwhitemushroomCrop");
/* 781 */     pambeanCrop = new BlockPamCrop().setBlockTextureName("bean").setBlockName("pambeanCrop");
/* 782 */     GameRegistry.registerBlock(pambeanCrop, "pambeanCrop");
/* 783 */     pamsoybeanCrop = new BlockPamCrop().setBlockTextureName("soybean").setBlockName("pamsoybeanCrop");
/* 784 */     GameRegistry.registerBlock(pamsoybeanCrop, "pamsoybeanCrop");
/* 785 */     pambellpepperCrop = new BlockPamCrop().setBlockTextureName("bellpepper").setBlockName("pambellpepperCrop");
/* 786 */     GameRegistry.registerBlock(pambellpepperCrop, "pambellpepperCrop");
/* 787 */     pamchilipepperCrop = new BlockPamCrop().setBlockTextureName("chilipepper").setBlockName("pamchilipepperCrop");
/* 788 */     GameRegistry.registerBlock(pamchilipepperCrop, "pamchilipepperCrop");
/* 789 */     pameggplantCrop = new BlockPamCrop().setBlockTextureName("eggplant").setBlockName("pameggplantCrop");
/* 790 */     GameRegistry.registerBlock(pameggplantCrop, "pameggplantCrop");
/* 791 */     pamokraCrop = new BlockPamCrop().setBlockTextureName("okra").setBlockName("pamokraCrop");
/* 792 */     GameRegistry.registerBlock(pamokraCrop, "pamokraCrop");
/* 793 */     pampeasCrop = new BlockPamCrop().setBlockTextureName("peas").setBlockName("pampeasCrop");
/* 794 */     GameRegistry.registerBlock(pampeasCrop, "pampeasCrop");
/* 795 */     pamtomatoCrop = new BlockPamCrop().setBlockTextureName("tomato").setBlockName("pamtomatoCrop");
/* 796 */     GameRegistry.registerBlock(pamtomatoCrop, "pamtomatoCrop");
/* 797 */     pamcottonCrop = new BlockPamCrop().setBlockTextureName("cotton").setBlockName("pamcottonCrop");
/* 798 */     GameRegistry.registerBlock(pamcottonCrop, "pamcottonCrop");
/* 799 */     pampineappleCrop = new BlockPamCrop().setBlockTextureName("pineapple").setBlockName("pampineappleCrop");
/* 800 */     GameRegistry.registerBlock(pampineappleCrop, "pampineappleCrop");
/* 801 */     pamgrapeCrop = new BlockPamCrop().setBlockTextureName("grape").setBlockName("pamgrapeCrop");
/* 802 */     GameRegistry.registerBlock(pamgrapeCrop, "pamgrapeCrop");
/* 803 */     pamkiwiCrop = new BlockPamCrop().setBlockTextureName("kiwi").setBlockName("pamkiwiCrop");
/* 804 */     GameRegistry.registerBlock(pamkiwiCrop, "pamkiwiCrop");
/* 805 */     pamcranberryCrop = new BlockPamCrop().setBlockTextureName("cranberry").setBlockName("pamcranberryCrop");
/* 806 */     GameRegistry.registerBlock(pamcranberryCrop, "pamcranberryCrop");
/* 807 */     pamriceCrop = new BlockPamCrop().setBlockTextureName("rice").setBlockName("pamriceCrop");
/* 808 */     GameRegistry.registerBlock(pamriceCrop, "pamriceCrop");
/* 809 */     pamseaweedCrop = new BlockPamCrop().setBlockTextureName("seaweed").setBlockName("pamseaweedCrop");
/* 810 */     GameRegistry.registerBlock(pamseaweedCrop, "pamseaweedCrop");
/* 811 */     pamcurryleafCrop = new BlockPamCrop().setBlockTextureName("curryleaf").setBlockName("pamcurryleafCrop");
/* 812 */     GameRegistry.registerBlock(pamcurryleafCrop, "pamcurryleafCrop");
/* 813 */     pamsesameseedsCrop = new BlockPamCrop().setBlockTextureName("sesameseeds").setBlockName("pamsesameseedsCrop");
/* 814 */     GameRegistry.registerBlock(pamsesameseedsCrop, "pamsesameseedsCrop");
/* 815 */     pamwaterchestnutCrop = new BlockPamCrop().setBlockTextureName("waterchestnut").setBlockName("pamwaterchestnutCrop");
/* 816 */     GameRegistry.registerBlock(pamwaterchestnutCrop, "pamwaterchestnutCrop");
/*     */     
/* 818 */     pamcandleDeco1 = new BlockPamCandleDeco().setLightLevel(candlelightLevel).setBlockTextureName("harvestcraft:candle_0").setBlockName("pamcandleDeco1");
/* 819 */     GameRegistry.registerBlock(pamcandleDeco1, "pamcandleDeco1");
/* 820 */     pamcandleDeco2 = new BlockPamCandleDeco().setLightLevel(candlelightLevel).setBlockTextureName("harvestcraft:candle_1").setBlockName("pamcandleDeco2");
/* 821 */     GameRegistry.registerBlock(pamcandleDeco2, "pamcandleDeco2");
/* 822 */     pamcandleDeco3 = new BlockPamCandleDeco().setLightLevel(candlelightLevel).setBlockTextureName("harvestcraft:candle_2").setBlockName("pamcandleDeco3");
/* 823 */     GameRegistry.registerBlock(pamcandleDeco3, "pamcandleDeco3");
/* 824 */     pamcandleDeco4 = new BlockPamCandleDeco().setLightLevel(candlelightLevel).setBlockTextureName("harvestcraft:candle_3").setBlockName("pamcandleDeco4");
/* 825 */     GameRegistry.registerBlock(pamcandleDeco4, "pamcandleDeco4");
/* 826 */     pamcandleDeco5 = new BlockPamCandleDeco().setLightLevel(candlelightLevel).setBlockTextureName("harvestcraft:candle_4").setBlockName("pamcandleDeco5");
/* 827 */     GameRegistry.registerBlock(pamcandleDeco5, "pamcandleDeco5");
/* 828 */     pamcandleDeco6 = new BlockPamCandleDeco().setLightLevel(candlelightLevel).setBlockTextureName("harvestcraft:candle_5").setBlockName("pamcandleDeco6");
/* 829 */     GameRegistry.registerBlock(pamcandleDeco6, "pamcandleDeco6");
/* 830 */     pamcandleDeco7 = new BlockPamCandleDeco().setLightLevel(candlelightLevel).setBlockTextureName("harvestcraft:candle_6").setBlockName("pamcandleDeco7");
/* 831 */     GameRegistry.registerBlock(pamcandleDeco7, "pamcandleDeco7");
/* 832 */     pamcandleDeco8 = new BlockPamCandleDeco().setLightLevel(candlelightLevel).setBlockTextureName("harvestcraft:candle_7").setBlockName("pamcandleDeco8");
/* 833 */     GameRegistry.registerBlock(pamcandleDeco8, "pamcandleDeco8");
/* 834 */     pamcandleDeco9 = new BlockPamCandleDeco().setLightLevel(candlelightLevel).setBlockTextureName("harvestcraft:candle_8").setBlockName("pamcandleDeco9");
/* 835 */     GameRegistry.registerBlock(pamcandleDeco9, "pamcandleDeco9");
/* 836 */     pamcandleDeco10 = new BlockPamCandleDeco().setLightLevel(candlelightLevel).setBlockTextureName("harvestcraft:candle_9").setBlockName("pamcandleDeco10");
/* 837 */     GameRegistry.registerBlock(pamcandleDeco10, "pamcandleDeco10");
/* 838 */     pamcandleDeco11 = new BlockPamCandleDeco().setLightLevel(candlelightLevel).setBlockTextureName("harvestcraft:candle_10").setBlockName("pamcandleDeco11");
/* 839 */     GameRegistry.registerBlock(pamcandleDeco11, "pamcandleDeco11");
/* 840 */     pamcandleDeco12 = new BlockPamCandleDeco().setLightLevel(candlelightLevel).setBlockTextureName("harvestcraft:candle_11").setBlockName("pamcandleDeco12");
/* 841 */     GameRegistry.registerBlock(pamcandleDeco12, "pamcandleDeco12");
/* 842 */     pamcandleDeco13 = new BlockPamCandleDeco().setLightLevel(candlelightLevel).setBlockTextureName("harvestcraft:candle_12").setBlockName("pamcandleDeco13");
/* 843 */     GameRegistry.registerBlock(pamcandleDeco13, "pamcandleDeco13");
/* 844 */     pamcandleDeco14 = new BlockPamCandleDeco().setLightLevel(candlelightLevel).setBlockTextureName("harvestcraft:candle_13").setBlockName("pamcandleDeco14");
/* 845 */     GameRegistry.registerBlock(pamcandleDeco14, "pamcandleDeco14");
/* 846 */     pamcandleDeco15 = new BlockPamCandleDeco().setLightLevel(candlelightLevel).setBlockTextureName("harvestcraft:candle_14").setBlockName("pamcandleDeco15");
/* 847 */     GameRegistry.registerBlock(pamcandleDeco15, "pamcandleDeco15");
/* 848 */     pamcandleDeco16 = new BlockPamCandleDeco().setLightLevel(candlelightLevel).setBlockTextureName("harvestcraft:candle_15").setBlockName("pamcandleDeco16");
/* 849 */     GameRegistry.registerBlock(pamcandleDeco16, "pamcandleDeco16");
/*     */     
/* 851 */     pamcarrotCake = new BlockPamCake(4).setHardness(0.5F).setBlockTextureName("harvestcraft:pamcarrotcake").setBlockName("pamcarrotCake").setCreativeTab(harvestcraft.tabHarvestCraft3);
/* 852 */     GameRegistry.registerBlock(pamcarrotCake, "pamcarrotCake");
/* 853 */     pamcheeseCake = new BlockPamCake(5).setHardness(0.5F).setBlockTextureName("harvestcraft:pamcheesecake").setBlockName("pamcheeseCake").setCreativeTab(harvestcraft.tabHarvestCraft3);
/* 854 */     GameRegistry.registerBlock(pamcheeseCake, "pamcheeseCake");
/* 855 */     pamcherrycheeseCake = new BlockPamCake(6).setHardness(0.5F).setBlockTextureName("harvestcraft:pamcherrycheesecake").setBlockName("pamcherrycheeseCake").setCreativeTab(harvestcraft.tabHarvestCraft3);
/* 856 */     GameRegistry.registerBlock(pamcherrycheeseCake, "pamcherrycheeseCake");
/* 857 */     pampineappleupsidedownCake = new BlockPamCake(5).setHardness(0.5F).setBlockTextureName("harvestcraft:pampineappleupsidedowncake").setBlockName("pampineappleupsidedownCake").setCreativeTab(harvestcraft.tabHarvestCraft3);
/* 858 */     GameRegistry.registerBlock(pampineappleupsidedownCake, "pampineappleupsidedownCake");
/* 859 */     pamchocolatesprinkleCake = new BlockPamCake(4).setHardness(0.5F).setBlockTextureName("harvestcraft:pamchocolatesprinklecake").setBlockName("pamchocolatesprinkleCake").setCreativeTab(harvestcraft.tabHarvestCraft3);
/* 860 */     GameRegistry.registerBlock(pamchocolatesprinkleCake, "pamchocolatesprinkleCake");
/* 861 */     pamredvelvetCake = new BlockPamCake(4).setHardness(0.5F).setBlockTextureName("harvestcraft:pamredvelvetcake").setBlockName("pamredvelvetCake").setCreativeTab(harvestcraft.tabHarvestCraft3);
/* 862 */     GameRegistry.registerBlock(pamredvelvetCake, "pamredvelvetCake");
/* 863 */     pamlamingtonCake = new BlockPamCake(3).setHardness(0.5F).setBlockTextureName("harvestcraft:pamlamingtoncake").setBlockName("pamlamingtonCake").setCreativeTab(harvestcraft.tabHarvestCraft3);
/* 864 */     GameRegistry.registerBlock(pamlamingtonCake, "pamlamingtonCake");
/* 865 */     pampavlovaCake = new BlockPamCake(5).setHardness(0.5F).setBlockTextureName("harvestcraft:pampavlovacake").setBlockName("pampavlovaCake").setCreativeTab(harvestcraft.tabHarvestCraft3);
/* 866 */     GameRegistry.registerBlock(pampavlovaCake, "pampavlovaCake");
/* 867 */     pamholidayCake = new BlockPamCake(5).setHardness(0.5F).setBlockTextureName("harvestcraft:pamholidaycake").setBlockName("pamholidayCake").setCreativeTab(harvestcraft.tabHarvestCraft3);
/* 868 */     GameRegistry.registerBlock(pamholidayCake, "pamholidayCake");
/* 869 */     pampumpkincheeseCake = new BlockPamCake(6).setHardness(0.5F).setBlockTextureName("harvestcraft:pampumpkincheesecake").setBlockName("pampumpkincheeseCake").setCreativeTab(harvestcraft.tabHarvestCraft3);
/* 870 */     GameRegistry.registerBlock(pampumpkincheeseCake, "pampumpkincheeseCake");
/*     */     
/*     */ 
/*     */ 
/* 874 */     PamTemperateSaplings = new Block[] { pamappleSapling, pamavocadoSapling, pamcherrySapling, pamchestnutSapling, pamnutmegSapling, pampearSapling, pamplumSapling, pamwalnutSapling, pamgooseberrySapling };
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 880 */     PamWarmSaplings = new Block[] { pamalmondSapling, pamapricotSapling, pambananaSapling, pamcashewSapling, pamcoconutSapling, pamdateSapling, pamdragonfruitSapling, pamdurianSapling, pamfigSapling, pamgrapefruitSapling, pamlemonSapling, pamlimeSapling, pammangoSapling, pamoliveSapling, pamorangeSapling, pampapayaSapling, pampeachSapling, pampecanSapling, pampeppercornSapling, pampersimmonSapling, pampistachioSapling, pampomegranateSapling, pamstarfruitSapling, pamvanillabeanSapling };
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 889 */     PamLogSaplings = new Block[] { pamcinnamonSapling, pammapleSapling, pampaperbarkSapling };
/*     */   }
/*     */ }


/* Location:              C:\Users\Modding\Desktop\Pam's HarvestCraft 1.7.10k.deobf.jar!\com\pam\harvestcraft\BlockRegistry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */