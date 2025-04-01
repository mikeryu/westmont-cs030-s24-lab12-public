/**
 * Westmont College Spring 2025
 * CS 030 Lab 12, Task 1
 *
 * @author Assistant Professor Mike Ryu mryu@westmont.edu
 */

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicHashSetTest {

  private static final int[] nums = {
      15, 66, 39, 20, 95,
      13, 8, 87, 78, 86,
      24, 50, 60, 10, 85,
      71, 75, 26, 39, 67,
      34, 87, 78, 41, 68,
      39, 75, 97, 95, 45,
      17, 91, 61, 9, 65,
      50, 96, 28, 16, 57,
      40, 18, 3, 61, 37,
      14, 35, 43, 96, 43,
      76, 69, 30, 47, 10,
      35, 4, 100, 53, 63,
      7, 59, 61, 22, 7,
      69, 66, 81, 88, 9,
      81, 81, 4, 80, 51,
      12, 40, 66, 14, 34,
      38, 37, 82, 44, 31,
      25, 34, 53, 14, 46,
      33, 24, 14, 57, 33,
      19, 17, 2, 56, 54
  };
  private static BasicHashSet set0;
  private static BasicHashSet set1;
  private static BasicHashSet set2;
  private static BasicHashSet set3;

  @BeforeAll
  static void setUp() {

    set0 = new BasicHashSet();
    set1 = new BasicHashSet();
    set2 = new BasicHashSet();
    set3 = new BasicHashSet();

    for (int i = 0; i < 10; i++) set1.add(i);
    for (int i = 0; i < 1000; i++) set2.add(i);
    for (int num : nums) set3.add(num);
  }

  @Test
  void addSimple() {
    BasicHashSet hs = new BasicHashSet();
    hs.add(1);
    assertEquals(1, hs.size());
    assertTrue(hs.contains(1));
  }

  @Test
  void contains_set0() {
    assertFalse(set0.contains(0));
    assertFalse(set0.contains(1));
    assertFalse(set0.contains(3));
    assertFalse(set0.contains(5));
  }

  @Test
  void contains_set1() {
    for (int i = 0; i < 10; i++) {
      assertTrue(set1.contains(i));
    }
  }

  @Test
  void contains_set2() {
    for (int i = 0; i < 1000; i++) {
      assertTrue(set2.contains(i));
    }
  }

  @Test
  void contains_set3() {
    for (int num : nums) {
      assertTrue(set3.contains(num));
    }
  }

  @Test
  void toStr_set0() {
    assertEquals("""
        B[0] - null
        B[1] - null
        B[2] - null
        B[3] - null
        B[4] - null
        B[5] - null
        B[6] - null
        B[7] - null
        B[8] - null
        B[9] - null
        """, set0.toString());
  }

  @Test
  void toStr_set1() {
    assertEquals("""
        B[0] - 0 - null
        B[1] - 1 - null
        B[2] - 2 - null
        B[3] - 3 - null
        B[4] - 4 - null
        B[5] - 5 - null
        B[6] - 6 - null
        B[7] - 7 - null
        B[8] - 8 - null
        B[9] - 9 - null
        B[10] - null
        B[11] - null
        B[12] - null
        B[13] - null
        B[14] - null
        B[15] - null
        B[16] - null
        B[17] - null
        B[18] - null
        B[19] - null
        """, set1.toString());
  }

  @Test
  void toStr_set2() {
    assertEquals("""
        B[0] - 0 - null
        B[1] - 1 - null
        B[2] - 2 - null
        B[3] - 3 - null
        B[4] - 4 - null
        B[5] - 5 - null
        B[6] - 6 - null
        B[7] - 7 - null
        B[8] - 8 - null
        B[9] - 9 - null
        B[10] - 10 - null
        B[11] - 11 - null
        B[12] - 12 - null
        B[13] - 13 - null
        B[14] - 14 - null
        B[15] - 15 - null
        B[16] - 16 - null
        B[17] - 17 - null
        B[18] - 18 - null
        B[19] - 19 - null
        B[20] - 20 - null
        B[21] - 21 - null
        B[22] - 22 - null
        B[23] - 23 - null
        B[24] - 24 - null
        B[25] - 25 - null
        B[26] - 26 - null
        B[27] - 27 - null
        B[28] - 28 - null
        B[29] - 29 - null
        B[30] - 30 - null
        B[31] - 31 - null
        B[32] - 32 - null
        B[33] - 33 - null
        B[34] - 34 - null
        B[35] - 35 - null
        B[36] - 36 - null
        B[37] - 37 - null
        B[38] - 38 - null
        B[39] - 39 - null
        B[40] - 40 - null
        B[41] - 41 - null
        B[42] - 42 - null
        B[43] - 43 - null
        B[44] - 44 - null
        B[45] - 45 - null
        B[46] - 46 - null
        B[47] - 47 - null
        B[48] - 48 - null
        B[49] - 49 - null
        B[50] - 50 - null
        B[51] - 51 - null
        B[52] - 52 - null
        B[53] - 53 - null
        B[54] - 54 - null
        B[55] - 55 - null
        B[56] - 56 - null
        B[57] - 57 - null
        B[58] - 58 - null
        B[59] - 59 - null
        B[60] - 60 - null
        B[61] - 61 - null
        B[62] - 62 - null
        B[63] - 63 - null
        B[64] - 64 - null
        B[65] - 65 - null
        B[66] - 66 - null
        B[67] - 67 - null
        B[68] - 68 - null
        B[69] - 69 - null
        B[70] - 70 - null
        B[71] - 71 - null
        B[72] - 72 - null
        B[73] - 73 - null
        B[74] - 74 - null
        B[75] - 75 - null
        B[76] - 76 - null
        B[77] - 77 - null
        B[78] - 78 - null
        B[79] - 79 - null
        B[80] - 80 - null
        B[81] - 81 - null
        B[82] - 82 - null
        B[83] - 83 - null
        B[84] - 84 - null
        B[85] - 85 - null
        B[86] - 86 - null
        B[87] - 87 - null
        B[88] - 88 - null
        B[89] - 89 - null
        B[90] - 90 - null
        B[91] - 91 - null
        B[92] - 92 - null
        B[93] - 93 - null
        B[94] - 94 - null
        B[95] - 95 - null
        B[96] - 96 - null
        B[97] - 97 - null
        B[98] - 98 - null
        B[99] - 99 - null
        B[100] - 100 - null
        B[101] - 101 - null
        B[102] - 102 - null
        B[103] - 103 - null
        B[104] - 104 - null
        B[105] - 105 - null
        B[106] - 106 - null
        B[107] - 107 - null
        B[108] - 108 - null
        B[109] - 109 - null
        B[110] - 110 - null
        B[111] - 111 - null
        B[112] - 112 - null
        B[113] - 113 - null
        B[114] - 114 - null
        B[115] - 115 - null
        B[116] - 116 - null
        B[117] - 117 - null
        B[118] - 118 - null
        B[119] - 119 - null
        B[120] - 120 - null
        B[121] - 121 - null
        B[122] - 122 - null
        B[123] - 123 - null
        B[124] - 124 - null
        B[125] - 125 - null
        B[126] - 126 - null
        B[127] - 127 - null
        B[128] - 128 - null
        B[129] - 129 - null
        B[130] - 130 - null
        B[131] - 131 - null
        B[132] - 132 - null
        B[133] - 133 - null
        B[134] - 134 - null
        B[135] - 135 - null
        B[136] - 136 - null
        B[137] - 137 - null
        B[138] - 138 - null
        B[139] - 139 - null
        B[140] - 140 - null
        B[141] - 141 - null
        B[142] - 142 - null
        B[143] - 143 - null
        B[144] - 144 - null
        B[145] - 145 - null
        B[146] - 146 - null
        B[147] - 147 - null
        B[148] - 148 - null
        B[149] - 149 - null
        B[150] - 150 - null
        B[151] - 151 - null
        B[152] - 152 - null
        B[153] - 153 - null
        B[154] - 154 - null
        B[155] - 155 - null
        B[156] - 156 - null
        B[157] - 157 - null
        B[158] - 158 - null
        B[159] - 159 - null
        B[160] - 160 - null
        B[161] - 161 - null
        B[162] - 162 - null
        B[163] - 163 - null
        B[164] - 164 - null
        B[165] - 165 - null
        B[166] - 166 - null
        B[167] - 167 - null
        B[168] - 168 - null
        B[169] - 169 - null
        B[170] - 170 - null
        B[171] - 171 - null
        B[172] - 172 - null
        B[173] - 173 - null
        B[174] - 174 - null
        B[175] - 175 - null
        B[176] - 176 - null
        B[177] - 177 - null
        B[178] - 178 - null
        B[179] - 179 - null
        B[180] - 180 - null
        B[181] - 181 - null
        B[182] - 182 - null
        B[183] - 183 - null
        B[184] - 184 - null
        B[185] - 185 - null
        B[186] - 186 - null
        B[187] - 187 - null
        B[188] - 188 - null
        B[189] - 189 - null
        B[190] - 190 - null
        B[191] - 191 - null
        B[192] - 192 - null
        B[193] - 193 - null
        B[194] - 194 - null
        B[195] - 195 - null
        B[196] - 196 - null
        B[197] - 197 - null
        B[198] - 198 - null
        B[199] - 199 - null
        B[200] - 200 - null
        B[201] - 201 - null
        B[202] - 202 - null
        B[203] - 203 - null
        B[204] - 204 - null
        B[205] - 205 - null
        B[206] - 206 - null
        B[207] - 207 - null
        B[208] - 208 - null
        B[209] - 209 - null
        B[210] - 210 - null
        B[211] - 211 - null
        B[212] - 212 - null
        B[213] - 213 - null
        B[214] - 214 - null
        B[215] - 215 - null
        B[216] - 216 - null
        B[217] - 217 - null
        B[218] - 218 - null
        B[219] - 219 - null
        B[220] - 220 - null
        B[221] - 221 - null
        B[222] - 222 - null
        B[223] - 223 - null
        B[224] - 224 - null
        B[225] - 225 - null
        B[226] - 226 - null
        B[227] - 227 - null
        B[228] - 228 - null
        B[229] - 229 - null
        B[230] - 230 - null
        B[231] - 231 - null
        B[232] - 232 - null
        B[233] - 233 - null
        B[234] - 234 - null
        B[235] - 235 - null
        B[236] - 236 - null
        B[237] - 237 - null
        B[238] - 238 - null
        B[239] - 239 - null
        B[240] - 240 - null
        B[241] - 241 - null
        B[242] - 242 - null
        B[243] - 243 - null
        B[244] - 244 - null
        B[245] - 245 - null
        B[246] - 246 - null
        B[247] - 247 - null
        B[248] - 248 - null
        B[249] - 249 - null
        B[250] - 250 - null
        B[251] - 251 - null
        B[252] - 252 - null
        B[253] - 253 - null
        B[254] - 254 - null
        B[255] - 255 - null
        B[256] - 256 - null
        B[257] - 257 - null
        B[258] - 258 - null
        B[259] - 259 - null
        B[260] - 260 - null
        B[261] - 261 - null
        B[262] - 262 - null
        B[263] - 263 - null
        B[264] - 264 - null
        B[265] - 265 - null
        B[266] - 266 - null
        B[267] - 267 - null
        B[268] - 268 - null
        B[269] - 269 - null
        B[270] - 270 - null
        B[271] - 271 - null
        B[272] - 272 - null
        B[273] - 273 - null
        B[274] - 274 - null
        B[275] - 275 - null
        B[276] - 276 - null
        B[277] - 277 - null
        B[278] - 278 - null
        B[279] - 279 - null
        B[280] - 280 - null
        B[281] - 281 - null
        B[282] - 282 - null
        B[283] - 283 - null
        B[284] - 284 - null
        B[285] - 285 - null
        B[286] - 286 - null
        B[287] - 287 - null
        B[288] - 288 - null
        B[289] - 289 - null
        B[290] - 290 - null
        B[291] - 291 - null
        B[292] - 292 - null
        B[293] - 293 - null
        B[294] - 294 - null
        B[295] - 295 - null
        B[296] - 296 - null
        B[297] - 297 - null
        B[298] - 298 - null
        B[299] - 299 - null
        B[300] - 300 - null
        B[301] - 301 - null
        B[302] - 302 - null
        B[303] - 303 - null
        B[304] - 304 - null
        B[305] - 305 - null
        B[306] - 306 - null
        B[307] - 307 - null
        B[308] - 308 - null
        B[309] - 309 - null
        B[310] - 310 - null
        B[311] - 311 - null
        B[312] - 312 - null
        B[313] - 313 - null
        B[314] - 314 - null
        B[315] - 315 - null
        B[316] - 316 - null
        B[317] - 317 - null
        B[318] - 318 - null
        B[319] - 319 - null
        B[320] - 320 - null
        B[321] - 321 - null
        B[322] - 322 - null
        B[323] - 323 - null
        B[324] - 324 - null
        B[325] - 325 - null
        B[326] - 326 - null
        B[327] - 327 - null
        B[328] - 328 - null
        B[329] - 329 - null
        B[330] - 330 - null
        B[331] - 331 - null
        B[332] - 332 - null
        B[333] - 333 - null
        B[334] - 334 - null
        B[335] - 335 - null
        B[336] - 336 - null
        B[337] - 337 - null
        B[338] - 338 - null
        B[339] - 339 - null
        B[340] - 340 - null
        B[341] - 341 - null
        B[342] - 342 - null
        B[343] - 343 - null
        B[344] - 344 - null
        B[345] - 345 - null
        B[346] - 346 - null
        B[347] - 347 - null
        B[348] - 348 - null
        B[349] - 349 - null
        B[350] - 350 - null
        B[351] - 351 - null
        B[352] - 352 - null
        B[353] - 353 - null
        B[354] - 354 - null
        B[355] - 355 - null
        B[356] - 356 - null
        B[357] - 357 - null
        B[358] - 358 - null
        B[359] - 359 - null
        B[360] - 360 - null
        B[361] - 361 - null
        B[362] - 362 - null
        B[363] - 363 - null
        B[364] - 364 - null
        B[365] - 365 - null
        B[366] - 366 - null
        B[367] - 367 - null
        B[368] - 368 - null
        B[369] - 369 - null
        B[370] - 370 - null
        B[371] - 371 - null
        B[372] - 372 - null
        B[373] - 373 - null
        B[374] - 374 - null
        B[375] - 375 - null
        B[376] - 376 - null
        B[377] - 377 - null
        B[378] - 378 - null
        B[379] - 379 - null
        B[380] - 380 - null
        B[381] - 381 - null
        B[382] - 382 - null
        B[383] - 383 - null
        B[384] - 384 - null
        B[385] - 385 - null
        B[386] - 386 - null
        B[387] - 387 - null
        B[388] - 388 - null
        B[389] - 389 - null
        B[390] - 390 - null
        B[391] - 391 - null
        B[392] - 392 - null
        B[393] - 393 - null
        B[394] - 394 - null
        B[395] - 395 - null
        B[396] - 396 - null
        B[397] - 397 - null
        B[398] - 398 - null
        B[399] - 399 - null
        B[400] - 400 - null
        B[401] - 401 - null
        B[402] - 402 - null
        B[403] - 403 - null
        B[404] - 404 - null
        B[405] - 405 - null
        B[406] - 406 - null
        B[407] - 407 - null
        B[408] - 408 - null
        B[409] - 409 - null
        B[410] - 410 - null
        B[411] - 411 - null
        B[412] - 412 - null
        B[413] - 413 - null
        B[414] - 414 - null
        B[415] - 415 - null
        B[416] - 416 - null
        B[417] - 417 - null
        B[418] - 418 - null
        B[419] - 419 - null
        B[420] - 420 - null
        B[421] - 421 - null
        B[422] - 422 - null
        B[423] - 423 - null
        B[424] - 424 - null
        B[425] - 425 - null
        B[426] - 426 - null
        B[427] - 427 - null
        B[428] - 428 - null
        B[429] - 429 - null
        B[430] - 430 - null
        B[431] - 431 - null
        B[432] - 432 - null
        B[433] - 433 - null
        B[434] - 434 - null
        B[435] - 435 - null
        B[436] - 436 - null
        B[437] - 437 - null
        B[438] - 438 - null
        B[439] - 439 - null
        B[440] - 440 - null
        B[441] - 441 - null
        B[442] - 442 - null
        B[443] - 443 - null
        B[444] - 444 - null
        B[445] - 445 - null
        B[446] - 446 - null
        B[447] - 447 - null
        B[448] - 448 - null
        B[449] - 449 - null
        B[450] - 450 - null
        B[451] - 451 - null
        B[452] - 452 - null
        B[453] - 453 - null
        B[454] - 454 - null
        B[455] - 455 - null
        B[456] - 456 - null
        B[457] - 457 - null
        B[458] - 458 - null
        B[459] - 459 - null
        B[460] - 460 - null
        B[461] - 461 - null
        B[462] - 462 - null
        B[463] - 463 - null
        B[464] - 464 - null
        B[465] - 465 - null
        B[466] - 466 - null
        B[467] - 467 - null
        B[468] - 468 - null
        B[469] - 469 - null
        B[470] - 470 - null
        B[471] - 471 - null
        B[472] - 472 - null
        B[473] - 473 - null
        B[474] - 474 - null
        B[475] - 475 - null
        B[476] - 476 - null
        B[477] - 477 - null
        B[478] - 478 - null
        B[479] - 479 - null
        B[480] - 480 - null
        B[481] - 481 - null
        B[482] - 482 - null
        B[483] - 483 - null
        B[484] - 484 - null
        B[485] - 485 - null
        B[486] - 486 - null
        B[487] - 487 - null
        B[488] - 488 - null
        B[489] - 489 - null
        B[490] - 490 - null
        B[491] - 491 - null
        B[492] - 492 - null
        B[493] - 493 - null
        B[494] - 494 - null
        B[495] - 495 - null
        B[496] - 496 - null
        B[497] - 497 - null
        B[498] - 498 - null
        B[499] - 499 - null
        B[500] - 500 - null
        B[501] - 501 - null
        B[502] - 502 - null
        B[503] - 503 - null
        B[504] - 504 - null
        B[505] - 505 - null
        B[506] - 506 - null
        B[507] - 507 - null
        B[508] - 508 - null
        B[509] - 509 - null
        B[510] - 510 - null
        B[511] - 511 - null
        B[512] - 512 - null
        B[513] - 513 - null
        B[514] - 514 - null
        B[515] - 515 - null
        B[516] - 516 - null
        B[517] - 517 - null
        B[518] - 518 - null
        B[519] - 519 - null
        B[520] - 520 - null
        B[521] - 521 - null
        B[522] - 522 - null
        B[523] - 523 - null
        B[524] - 524 - null
        B[525] - 525 - null
        B[526] - 526 - null
        B[527] - 527 - null
        B[528] - 528 - null
        B[529] - 529 - null
        B[530] - 530 - null
        B[531] - 531 - null
        B[532] - 532 - null
        B[533] - 533 - null
        B[534] - 534 - null
        B[535] - 535 - null
        B[536] - 536 - null
        B[537] - 537 - null
        B[538] - 538 - null
        B[539] - 539 - null
        B[540] - 540 - null
        B[541] - 541 - null
        B[542] - 542 - null
        B[543] - 543 - null
        B[544] - 544 - null
        B[545] - 545 - null
        B[546] - 546 - null
        B[547] - 547 - null
        B[548] - 548 - null
        B[549] - 549 - null
        B[550] - 550 - null
        B[551] - 551 - null
        B[552] - 552 - null
        B[553] - 553 - null
        B[554] - 554 - null
        B[555] - 555 - null
        B[556] - 556 - null
        B[557] - 557 - null
        B[558] - 558 - null
        B[559] - 559 - null
        B[560] - 560 - null
        B[561] - 561 - null
        B[562] - 562 - null
        B[563] - 563 - null
        B[564] - 564 - null
        B[565] - 565 - null
        B[566] - 566 - null
        B[567] - 567 - null
        B[568] - 568 - null
        B[569] - 569 - null
        B[570] - 570 - null
        B[571] - 571 - null
        B[572] - 572 - null
        B[573] - 573 - null
        B[574] - 574 - null
        B[575] - 575 - null
        B[576] - 576 - null
        B[577] - 577 - null
        B[578] - 578 - null
        B[579] - 579 - null
        B[580] - 580 - null
        B[581] - 581 - null
        B[582] - 582 - null
        B[583] - 583 - null
        B[584] - 584 - null
        B[585] - 585 - null
        B[586] - 586 - null
        B[587] - 587 - null
        B[588] - 588 - null
        B[589] - 589 - null
        B[590] - 590 - null
        B[591] - 591 - null
        B[592] - 592 - null
        B[593] - 593 - null
        B[594] - 594 - null
        B[595] - 595 - null
        B[596] - 596 - null
        B[597] - 597 - null
        B[598] - 598 - null
        B[599] - 599 - null
        B[600] - 600 - null
        B[601] - 601 - null
        B[602] - 602 - null
        B[603] - 603 - null
        B[604] - 604 - null
        B[605] - 605 - null
        B[606] - 606 - null
        B[607] - 607 - null
        B[608] - 608 - null
        B[609] - 609 - null
        B[610] - 610 - null
        B[611] - 611 - null
        B[612] - 612 - null
        B[613] - 613 - null
        B[614] - 614 - null
        B[615] - 615 - null
        B[616] - 616 - null
        B[617] - 617 - null
        B[618] - 618 - null
        B[619] - 619 - null
        B[620] - 620 - null
        B[621] - 621 - null
        B[622] - 622 - null
        B[623] - 623 - null
        B[624] - 624 - null
        B[625] - 625 - null
        B[626] - 626 - null
        B[627] - 627 - null
        B[628] - 628 - null
        B[629] - 629 - null
        B[630] - 630 - null
        B[631] - 631 - null
        B[632] - 632 - null
        B[633] - 633 - null
        B[634] - 634 - null
        B[635] - 635 - null
        B[636] - 636 - null
        B[637] - 637 - null
        B[638] - 638 - null
        B[639] - 639 - null
        B[640] - 640 - null
        B[641] - 641 - null
        B[642] - 642 - null
        B[643] - 643 - null
        B[644] - 644 - null
        B[645] - 645 - null
        B[646] - 646 - null
        B[647] - 647 - null
        B[648] - 648 - null
        B[649] - 649 - null
        B[650] - 650 - null
        B[651] - 651 - null
        B[652] - 652 - null
        B[653] - 653 - null
        B[654] - 654 - null
        B[655] - 655 - null
        B[656] - 656 - null
        B[657] - 657 - null
        B[658] - 658 - null
        B[659] - 659 - null
        B[660] - 660 - null
        B[661] - 661 - null
        B[662] - 662 - null
        B[663] - 663 - null
        B[664] - 664 - null
        B[665] - 665 - null
        B[666] - 666 - null
        B[667] - 667 - null
        B[668] - 668 - null
        B[669] - 669 - null
        B[670] - 670 - null
        B[671] - 671 - null
        B[672] - 672 - null
        B[673] - 673 - null
        B[674] - 674 - null
        B[675] - 675 - null
        B[676] - 676 - null
        B[677] - 677 - null
        B[678] - 678 - null
        B[679] - 679 - null
        B[680] - 680 - null
        B[681] - 681 - null
        B[682] - 682 - null
        B[683] - 683 - null
        B[684] - 684 - null
        B[685] - 685 - null
        B[686] - 686 - null
        B[687] - 687 - null
        B[688] - 688 - null
        B[689] - 689 - null
        B[690] - 690 - null
        B[691] - 691 - null
        B[692] - 692 - null
        B[693] - 693 - null
        B[694] - 694 - null
        B[695] - 695 - null
        B[696] - 696 - null
        B[697] - 697 - null
        B[698] - 698 - null
        B[699] - 699 - null
        B[700] - 700 - null
        B[701] - 701 - null
        B[702] - 702 - null
        B[703] - 703 - null
        B[704] - 704 - null
        B[705] - 705 - null
        B[706] - 706 - null
        B[707] - 707 - null
        B[708] - 708 - null
        B[709] - 709 - null
        B[710] - 710 - null
        B[711] - 711 - null
        B[712] - 712 - null
        B[713] - 713 - null
        B[714] - 714 - null
        B[715] - 715 - null
        B[716] - 716 - null
        B[717] - 717 - null
        B[718] - 718 - null
        B[719] - 719 - null
        B[720] - 720 - null
        B[721] - 721 - null
        B[722] - 722 - null
        B[723] - 723 - null
        B[724] - 724 - null
        B[725] - 725 - null
        B[726] - 726 - null
        B[727] - 727 - null
        B[728] - 728 - null
        B[729] - 729 - null
        B[730] - 730 - null
        B[731] - 731 - null
        B[732] - 732 - null
        B[733] - 733 - null
        B[734] - 734 - null
        B[735] - 735 - null
        B[736] - 736 - null
        B[737] - 737 - null
        B[738] - 738 - null
        B[739] - 739 - null
        B[740] - 740 - null
        B[741] - 741 - null
        B[742] - 742 - null
        B[743] - 743 - null
        B[744] - 744 - null
        B[745] - 745 - null
        B[746] - 746 - null
        B[747] - 747 - null
        B[748] - 748 - null
        B[749] - 749 - null
        B[750] - 750 - null
        B[751] - 751 - null
        B[752] - 752 - null
        B[753] - 753 - null
        B[754] - 754 - null
        B[755] - 755 - null
        B[756] - 756 - null
        B[757] - 757 - null
        B[758] - 758 - null
        B[759] - 759 - null
        B[760] - 760 - null
        B[761] - 761 - null
        B[762] - 762 - null
        B[763] - 763 - null
        B[764] - 764 - null
        B[765] - 765 - null
        B[766] - 766 - null
        B[767] - 767 - null
        B[768] - 768 - null
        B[769] - 769 - null
        B[770] - 770 - null
        B[771] - 771 - null
        B[772] - 772 - null
        B[773] - 773 - null
        B[774] - 774 - null
        B[775] - 775 - null
        B[776] - 776 - null
        B[777] - 777 - null
        B[778] - 778 - null
        B[779] - 779 - null
        B[780] - 780 - null
        B[781] - 781 - null
        B[782] - 782 - null
        B[783] - 783 - null
        B[784] - 784 - null
        B[785] - 785 - null
        B[786] - 786 - null
        B[787] - 787 - null
        B[788] - 788 - null
        B[789] - 789 - null
        B[790] - 790 - null
        B[791] - 791 - null
        B[792] - 792 - null
        B[793] - 793 - null
        B[794] - 794 - null
        B[795] - 795 - null
        B[796] - 796 - null
        B[797] - 797 - null
        B[798] - 798 - null
        B[799] - 799 - null
        B[800] - 800 - null
        B[801] - 801 - null
        B[802] - 802 - null
        B[803] - 803 - null
        B[804] - 804 - null
        B[805] - 805 - null
        B[806] - 806 - null
        B[807] - 807 - null
        B[808] - 808 - null
        B[809] - 809 - null
        B[810] - 810 - null
        B[811] - 811 - null
        B[812] - 812 - null
        B[813] - 813 - null
        B[814] - 814 - null
        B[815] - 815 - null
        B[816] - 816 - null
        B[817] - 817 - null
        B[818] - 818 - null
        B[819] - 819 - null
        B[820] - 820 - null
        B[821] - 821 - null
        B[822] - 822 - null
        B[823] - 823 - null
        B[824] - 824 - null
        B[825] - 825 - null
        B[826] - 826 - null
        B[827] - 827 - null
        B[828] - 828 - null
        B[829] - 829 - null
        B[830] - 830 - null
        B[831] - 831 - null
        B[832] - 832 - null
        B[833] - 833 - null
        B[834] - 834 - null
        B[835] - 835 - null
        B[836] - 836 - null
        B[837] - 837 - null
        B[838] - 838 - null
        B[839] - 839 - null
        B[840] - 840 - null
        B[841] - 841 - null
        B[842] - 842 - null
        B[843] - 843 - null
        B[844] - 844 - null
        B[845] - 845 - null
        B[846] - 846 - null
        B[847] - 847 - null
        B[848] - 848 - null
        B[849] - 849 - null
        B[850] - 850 - null
        B[851] - 851 - null
        B[852] - 852 - null
        B[853] - 853 - null
        B[854] - 854 - null
        B[855] - 855 - null
        B[856] - 856 - null
        B[857] - 857 - null
        B[858] - 858 - null
        B[859] - 859 - null
        B[860] - 860 - null
        B[861] - 861 - null
        B[862] - 862 - null
        B[863] - 863 - null
        B[864] - 864 - null
        B[865] - 865 - null
        B[866] - 866 - null
        B[867] - 867 - null
        B[868] - 868 - null
        B[869] - 869 - null
        B[870] - 870 - null
        B[871] - 871 - null
        B[872] - 872 - null
        B[873] - 873 - null
        B[874] - 874 - null
        B[875] - 875 - null
        B[876] - 876 - null
        B[877] - 877 - null
        B[878] - 878 - null
        B[879] - 879 - null
        B[880] - 880 - null
        B[881] - 881 - null
        B[882] - 882 - null
        B[883] - 883 - null
        B[884] - 884 - null
        B[885] - 885 - null
        B[886] - 886 - null
        B[887] - 887 - null
        B[888] - 888 - null
        B[889] - 889 - null
        B[890] - 890 - null
        B[891] - 891 - null
        B[892] - 892 - null
        B[893] - 893 - null
        B[894] - 894 - null
        B[895] - 895 - null
        B[896] - 896 - null
        B[897] - 897 - null
        B[898] - 898 - null
        B[899] - 899 - null
        B[900] - 900 - null
        B[901] - 901 - null
        B[902] - 902 - null
        B[903] - 903 - null
        B[904] - 904 - null
        B[905] - 905 - null
        B[906] - 906 - null
        B[907] - 907 - null
        B[908] - 908 - null
        B[909] - 909 - null
        B[910] - 910 - null
        B[911] - 911 - null
        B[912] - 912 - null
        B[913] - 913 - null
        B[914] - 914 - null
        B[915] - 915 - null
        B[916] - 916 - null
        B[917] - 917 - null
        B[918] - 918 - null
        B[919] - 919 - null
        B[920] - 920 - null
        B[921] - 921 - null
        B[922] - 922 - null
        B[923] - 923 - null
        B[924] - 924 - null
        B[925] - 925 - null
        B[926] - 926 - null
        B[927] - 927 - null
        B[928] - 928 - null
        B[929] - 929 - null
        B[930] - 930 - null
        B[931] - 931 - null
        B[932] - 932 - null
        B[933] - 933 - null
        B[934] - 934 - null
        B[935] - 935 - null
        B[936] - 936 - null
        B[937] - 937 - null
        B[938] - 938 - null
        B[939] - 939 - null
        B[940] - 940 - null
        B[941] - 941 - null
        B[942] - 942 - null
        B[943] - 943 - null
        B[944] - 944 - null
        B[945] - 945 - null
        B[946] - 946 - null
        B[947] - 947 - null
        B[948] - 948 - null
        B[949] - 949 - null
        B[950] - 950 - null
        B[951] - 951 - null
        B[952] - 952 - null
        B[953] - 953 - null
        B[954] - 954 - null
        B[955] - 955 - null
        B[956] - 956 - null
        B[957] - 957 - null
        B[958] - 958 - null
        B[959] - 959 - null
        B[960] - 960 - null
        B[961] - 961 - null
        B[962] - 962 - null
        B[963] - 963 - null
        B[964] - 964 - null
        B[965] - 965 - null
        B[966] - 966 - null
        B[967] - 967 - null
        B[968] - 968 - null
        B[969] - 969 - null
        B[970] - 970 - null
        B[971] - 971 - null
        B[972] - 972 - null
        B[973] - 973 - null
        B[974] - 974 - null
        B[975] - 975 - null
        B[976] - 976 - null
        B[977] - 977 - null
        B[978] - 978 - null
        B[979] - 979 - null
        B[980] - 980 - null
        B[981] - 981 - null
        B[982] - 982 - null
        B[983] - 983 - null
        B[984] - 984 - null
        B[985] - 985 - null
        B[986] - 986 - null
        B[987] - 987 - null
        B[988] - 988 - null
        B[989] - 989 - null
        B[990] - 990 - null
        B[991] - 991 - null
        B[992] - 992 - null
        B[993] - 993 - null
        B[994] - 994 - null
        B[995] - 995 - null
        B[996] - 996 - null
        B[997] - 997 - null
        B[998] - 998 - null
        B[999] - 999 - null
        B[1000] - null
        B[1001] - null
        B[1002] - null
        B[1003] - null
        B[1004] - null
        B[1005] - null
        B[1006] - null
        B[1007] - null
        B[1008] - null
        B[1009] - null
        B[1010] - null
        B[1011] - null
        B[1012] - null
        B[1013] - null
        B[1014] - null
        B[1015] - null
        B[1016] - null
        B[1017] - null
        B[1018] - null
        B[1019] - null
        B[1020] - null
        B[1021] - null
        B[1022] - null
        B[1023] - null
        B[1024] - null
        B[1025] - null
        B[1026] - null
        B[1027] - null
        B[1028] - null
        B[1029] - null
        B[1030] - null
        B[1031] - null
        B[1032] - null
        B[1033] - null
        B[1034] - null
        B[1035] - null
        B[1036] - null
        B[1037] - null
        B[1038] - null
        B[1039] - null
        B[1040] - null
        B[1041] - null
        B[1042] - null
        B[1043] - null
        B[1044] - null
        B[1045] - null
        B[1046] - null
        B[1047] - null
        B[1048] - null
        B[1049] - null
        B[1050] - null
        B[1051] - null
        B[1052] - null
        B[1053] - null
        B[1054] - null
        B[1055] - null
        B[1056] - null
        B[1057] - null
        B[1058] - null
        B[1059] - null
        B[1060] - null
        B[1061] - null
        B[1062] - null
        B[1063] - null
        B[1064] - null
        B[1065] - null
        B[1066] - null
        B[1067] - null
        B[1068] - null
        B[1069] - null
        B[1070] - null
        B[1071] - null
        B[1072] - null
        B[1073] - null
        B[1074] - null
        B[1075] - null
        B[1076] - null
        B[1077] - null
        B[1078] - null
        B[1079] - null
        B[1080] - null
        B[1081] - null
        B[1082] - null
        B[1083] - null
        B[1084] - null
        B[1085] - null
        B[1086] - null
        B[1087] - null
        B[1088] - null
        B[1089] - null
        B[1090] - null
        B[1091] - null
        B[1092] - null
        B[1093] - null
        B[1094] - null
        B[1095] - null
        B[1096] - null
        B[1097] - null
        B[1098] - null
        B[1099] - null
        B[1100] - null
        B[1101] - null
        B[1102] - null
        B[1103] - null
        B[1104] - null
        B[1105] - null
        B[1106] - null
        B[1107] - null
        B[1108] - null
        B[1109] - null
        B[1110] - null
        B[1111] - null
        B[1112] - null
        B[1113] - null
        B[1114] - null
        B[1115] - null
        B[1116] - null
        B[1117] - null
        B[1118] - null
        B[1119] - null
        B[1120] - null
        B[1121] - null
        B[1122] - null
        B[1123] - null
        B[1124] - null
        B[1125] - null
        B[1126] - null
        B[1127] - null
        B[1128] - null
        B[1129] - null
        B[1130] - null
        B[1131] - null
        B[1132] - null
        B[1133] - null
        B[1134] - null
        B[1135] - null
        B[1136] - null
        B[1137] - null
        B[1138] - null
        B[1139] - null
        B[1140] - null
        B[1141] - null
        B[1142] - null
        B[1143] - null
        B[1144] - null
        B[1145] - null
        B[1146] - null
        B[1147] - null
        B[1148] - null
        B[1149] - null
        B[1150] - null
        B[1151] - null
        B[1152] - null
        B[1153] - null
        B[1154] - null
        B[1155] - null
        B[1156] - null
        B[1157] - null
        B[1158] - null
        B[1159] - null
        B[1160] - null
        B[1161] - null
        B[1162] - null
        B[1163] - null
        B[1164] - null
        B[1165] - null
        B[1166] - null
        B[1167] - null
        B[1168] - null
        B[1169] - null
        B[1170] - null
        B[1171] - null
        B[1172] - null
        B[1173] - null
        B[1174] - null
        B[1175] - null
        B[1176] - null
        B[1177] - null
        B[1178] - null
        B[1179] - null
        B[1180] - null
        B[1181] - null
        B[1182] - null
        B[1183] - null
        B[1184] - null
        B[1185] - null
        B[1186] - null
        B[1187] - null
        B[1188] - null
        B[1189] - null
        B[1190] - null
        B[1191] - null
        B[1192] - null
        B[1193] - null
        B[1194] - null
        B[1195] - null
        B[1196] - null
        B[1197] - null
        B[1198] - null
        B[1199] - null
        B[1200] - null
        B[1201] - null
        B[1202] - null
        B[1203] - null
        B[1204] - null
        B[1205] - null
        B[1206] - null
        B[1207] - null
        B[1208] - null
        B[1209] - null
        B[1210] - null
        B[1211] - null
        B[1212] - null
        B[1213] - null
        B[1214] - null
        B[1215] - null
        B[1216] - null
        B[1217] - null
        B[1218] - null
        B[1219] - null
        B[1220] - null
        B[1221] - null
        B[1222] - null
        B[1223] - null
        B[1224] - null
        B[1225] - null
        B[1226] - null
        B[1227] - null
        B[1228] - null
        B[1229] - null
        B[1230] - null
        B[1231] - null
        B[1232] - null
        B[1233] - null
        B[1234] - null
        B[1235] - null
        B[1236] - null
        B[1237] - null
        B[1238] - null
        B[1239] - null
        B[1240] - null
        B[1241] - null
        B[1242] - null
        B[1243] - null
        B[1244] - null
        B[1245] - null
        B[1246] - null
        B[1247] - null
        B[1248] - null
        B[1249] - null
        B[1250] - null
        B[1251] - null
        B[1252] - null
        B[1253] - null
        B[1254] - null
        B[1255] - null
        B[1256] - null
        B[1257] - null
        B[1258] - null
        B[1259] - null
        B[1260] - null
        B[1261] - null
        B[1262] - null
        B[1263] - null
        B[1264] - null
        B[1265] - null
        B[1266] - null
        B[1267] - null
        B[1268] - null
        B[1269] - null
        B[1270] - null
        B[1271] - null
        B[1272] - null
        B[1273] - null
        B[1274] - null
        B[1275] - null
        B[1276] - null
        B[1277] - null
        B[1278] - null
        B[1279] - null
        B[1280] - null
        B[1281] - null
        B[1282] - null
        B[1283] - null
        B[1284] - null
        B[1285] - null
        B[1286] - null
        B[1287] - null
        B[1288] - null
        B[1289] - null
        B[1290] - null
        B[1291] - null
        B[1292] - null
        B[1293] - null
        B[1294] - null
        B[1295] - null
        B[1296] - null
        B[1297] - null
        B[1298] - null
        B[1299] - null
        B[1300] - null
        B[1301] - null
        B[1302] - null
        B[1303] - null
        B[1304] - null
        B[1305] - null
        B[1306] - null
        B[1307] - null
        B[1308] - null
        B[1309] - null
        B[1310] - null
        B[1311] - null
        B[1312] - null
        B[1313] - null
        B[1314] - null
        B[1315] - null
        B[1316] - null
        B[1317] - null
        B[1318] - null
        B[1319] - null
        B[1320] - null
        B[1321] - null
        B[1322] - null
        B[1323] - null
        B[1324] - null
        B[1325] - null
        B[1326] - null
        B[1327] - null
        B[1328] - null
        B[1329] - null
        B[1330] - null
        B[1331] - null
        B[1332] - null
        B[1333] - null
        B[1334] - null
        B[1335] - null
        B[1336] - null
        B[1337] - null
        B[1338] - null
        B[1339] - null
        B[1340] - null
        B[1341] - null
        B[1342] - null
        B[1343] - null
        B[1344] - null
        B[1345] - null
        B[1346] - null
        B[1347] - null
        B[1348] - null
        B[1349] - null
        B[1350] - null
        B[1351] - null
        B[1352] - null
        B[1353] - null
        B[1354] - null
        B[1355] - null
        B[1356] - null
        B[1357] - null
        B[1358] - null
        B[1359] - null
        B[1360] - null
        B[1361] - null
        B[1362] - null
        B[1363] - null
        B[1364] - null
        B[1365] - null
        B[1366] - null
        B[1367] - null
        B[1368] - null
        B[1369] - null
        B[1370] - null
        B[1371] - null
        B[1372] - null
        B[1373] - null
        B[1374] - null
        B[1375] - null
        B[1376] - null
        B[1377] - null
        B[1378] - null
        B[1379] - null
        B[1380] - null
        B[1381] - null
        B[1382] - null
        B[1383] - null
        B[1384] - null
        B[1385] - null
        B[1386] - null
        B[1387] - null
        B[1388] - null
        B[1389] - null
        B[1390] - null
        B[1391] - null
        B[1392] - null
        B[1393] - null
        B[1394] - null
        B[1395] - null
        B[1396] - null
        B[1397] - null
        B[1398] - null
        B[1399] - null
        B[1400] - null
        B[1401] - null
        B[1402] - null
        B[1403] - null
        B[1404] - null
        B[1405] - null
        B[1406] - null
        B[1407] - null
        B[1408] - null
        B[1409] - null
        B[1410] - null
        B[1411] - null
        B[1412] - null
        B[1413] - null
        B[1414] - null
        B[1415] - null
        B[1416] - null
        B[1417] - null
        B[1418] - null
        B[1419] - null
        B[1420] - null
        B[1421] - null
        B[1422] - null
        B[1423] - null
        B[1424] - null
        B[1425] - null
        B[1426] - null
        B[1427] - null
        B[1428] - null
        B[1429] - null
        B[1430] - null
        B[1431] - null
        B[1432] - null
        B[1433] - null
        B[1434] - null
        B[1435] - null
        B[1436] - null
        B[1437] - null
        B[1438] - null
        B[1439] - null
        B[1440] - null
        B[1441] - null
        B[1442] - null
        B[1443] - null
        B[1444] - null
        B[1445] - null
        B[1446] - null
        B[1447] - null
        B[1448] - null
        B[1449] - null
        B[1450] - null
        B[1451] - null
        B[1452] - null
        B[1453] - null
        B[1454] - null
        B[1455] - null
        B[1456] - null
        B[1457] - null
        B[1458] - null
        B[1459] - null
        B[1460] - null
        B[1461] - null
        B[1462] - null
        B[1463] - null
        B[1464] - null
        B[1465] - null
        B[1466] - null
        B[1467] - null
        B[1468] - null
        B[1469] - null
        B[1470] - null
        B[1471] - null
        B[1472] - null
        B[1473] - null
        B[1474] - null
        B[1475] - null
        B[1476] - null
        B[1477] - null
        B[1478] - null
        B[1479] - null
        B[1480] - null
        B[1481] - null
        B[1482] - null
        B[1483] - null
        B[1484] - null
        B[1485] - null
        B[1486] - null
        B[1487] - null
        B[1488] - null
        B[1489] - null
        B[1490] - null
        B[1491] - null
        B[1492] - null
        B[1493] - null
        B[1494] - null
        B[1495] - null
        B[1496] - null
        B[1497] - null
        B[1498] - null
        B[1499] - null
        B[1500] - null
        B[1501] - null
        B[1502] - null
        B[1503] - null
        B[1504] - null
        B[1505] - null
        B[1506] - null
        B[1507] - null
        B[1508] - null
        B[1509] - null
        B[1510] - null
        B[1511] - null
        B[1512] - null
        B[1513] - null
        B[1514] - null
        B[1515] - null
        B[1516] - null
        B[1517] - null
        B[1518] - null
        B[1519] - null
        B[1520] - null
        B[1521] - null
        B[1522] - null
        B[1523] - null
        B[1524] - null
        B[1525] - null
        B[1526] - null
        B[1527] - null
        B[1528] - null
        B[1529] - null
        B[1530] - null
        B[1531] - null
        B[1532] - null
        B[1533] - null
        B[1534] - null
        B[1535] - null
        B[1536] - null
        B[1537] - null
        B[1538] - null
        B[1539] - null
        B[1540] - null
        B[1541] - null
        B[1542] - null
        B[1543] - null
        B[1544] - null
        B[1545] - null
        B[1546] - null
        B[1547] - null
        B[1548] - null
        B[1549] - null
        B[1550] - null
        B[1551] - null
        B[1552] - null
        B[1553] - null
        B[1554] - null
        B[1555] - null
        B[1556] - null
        B[1557] - null
        B[1558] - null
        B[1559] - null
        B[1560] - null
        B[1561] - null
        B[1562] - null
        B[1563] - null
        B[1564] - null
        B[1565] - null
        B[1566] - null
        B[1567] - null
        B[1568] - null
        B[1569] - null
        B[1570] - null
        B[1571] - null
        B[1572] - null
        B[1573] - null
        B[1574] - null
        B[1575] - null
        B[1576] - null
        B[1577] - null
        B[1578] - null
        B[1579] - null
        B[1580] - null
        B[1581] - null
        B[1582] - null
        B[1583] - null
        B[1584] - null
        B[1585] - null
        B[1586] - null
        B[1587] - null
        B[1588] - null
        B[1589] - null
        B[1590] - null
        B[1591] - null
        B[1592] - null
        B[1593] - null
        B[1594] - null
        B[1595] - null
        B[1596] - null
        B[1597] - null
        B[1598] - null
        B[1599] - null
        B[1600] - null
        B[1601] - null
        B[1602] - null
        B[1603] - null
        B[1604] - null
        B[1605] - null
        B[1606] - null
        B[1607] - null
        B[1608] - null
        B[1609] - null
        B[1610] - null
        B[1611] - null
        B[1612] - null
        B[1613] - null
        B[1614] - null
        B[1615] - null
        B[1616] - null
        B[1617] - null
        B[1618] - null
        B[1619] - null
        B[1620] - null
        B[1621] - null
        B[1622] - null
        B[1623] - null
        B[1624] - null
        B[1625] - null
        B[1626] - null
        B[1627] - null
        B[1628] - null
        B[1629] - null
        B[1630] - null
        B[1631] - null
        B[1632] - null
        B[1633] - null
        B[1634] - null
        B[1635] - null
        B[1636] - null
        B[1637] - null
        B[1638] - null
        B[1639] - null
        B[1640] - null
        B[1641] - null
        B[1642] - null
        B[1643] - null
        B[1644] - null
        B[1645] - null
        B[1646] - null
        B[1647] - null
        B[1648] - null
        B[1649] - null
        B[1650] - null
        B[1651] - null
        B[1652] - null
        B[1653] - null
        B[1654] - null
        B[1655] - null
        B[1656] - null
        B[1657] - null
        B[1658] - null
        B[1659] - null
        B[1660] - null
        B[1661] - null
        B[1662] - null
        B[1663] - null
        B[1664] - null
        B[1665] - null
        B[1666] - null
        B[1667] - null
        B[1668] - null
        B[1669] - null
        B[1670] - null
        B[1671] - null
        B[1672] - null
        B[1673] - null
        B[1674] - null
        B[1675] - null
        B[1676] - null
        B[1677] - null
        B[1678] - null
        B[1679] - null
        B[1680] - null
        B[1681] - null
        B[1682] - null
        B[1683] - null
        B[1684] - null
        B[1685] - null
        B[1686] - null
        B[1687] - null
        B[1688] - null
        B[1689] - null
        B[1690] - null
        B[1691] - null
        B[1692] - null
        B[1693] - null
        B[1694] - null
        B[1695] - null
        B[1696] - null
        B[1697] - null
        B[1698] - null
        B[1699] - null
        B[1700] - null
        B[1701] - null
        B[1702] - null
        B[1703] - null
        B[1704] - null
        B[1705] - null
        B[1706] - null
        B[1707] - null
        B[1708] - null
        B[1709] - null
        B[1710] - null
        B[1711] - null
        B[1712] - null
        B[1713] - null
        B[1714] - null
        B[1715] - null
        B[1716] - null
        B[1717] - null
        B[1718] - null
        B[1719] - null
        B[1720] - null
        B[1721] - null
        B[1722] - null
        B[1723] - null
        B[1724] - null
        B[1725] - null
        B[1726] - null
        B[1727] - null
        B[1728] - null
        B[1729] - null
        B[1730] - null
        B[1731] - null
        B[1732] - null
        B[1733] - null
        B[1734] - null
        B[1735] - null
        B[1736] - null
        B[1737] - null
        B[1738] - null
        B[1739] - null
        B[1740] - null
        B[1741] - null
        B[1742] - null
        B[1743] - null
        B[1744] - null
        B[1745] - null
        B[1746] - null
        B[1747] - null
        B[1748] - null
        B[1749] - null
        B[1750] - null
        B[1751] - null
        B[1752] - null
        B[1753] - null
        B[1754] - null
        B[1755] - null
        B[1756] - null
        B[1757] - null
        B[1758] - null
        B[1759] - null
        B[1760] - null
        B[1761] - null
        B[1762] - null
        B[1763] - null
        B[1764] - null
        B[1765] - null
        B[1766] - null
        B[1767] - null
        B[1768] - null
        B[1769] - null
        B[1770] - null
        B[1771] - null
        B[1772] - null
        B[1773] - null
        B[1774] - null
        B[1775] - null
        B[1776] - null
        B[1777] - null
        B[1778] - null
        B[1779] - null
        B[1780] - null
        B[1781] - null
        B[1782] - null
        B[1783] - null
        B[1784] - null
        B[1785] - null
        B[1786] - null
        B[1787] - null
        B[1788] - null
        B[1789] - null
        B[1790] - null
        B[1791] - null
        B[1792] - null
        B[1793] - null
        B[1794] - null
        B[1795] - null
        B[1796] - null
        B[1797] - null
        B[1798] - null
        B[1799] - null
        B[1800] - null
        B[1801] - null
        B[1802] - null
        B[1803] - null
        B[1804] - null
        B[1805] - null
        B[1806] - null
        B[1807] - null
        B[1808] - null
        B[1809] - null
        B[1810] - null
        B[1811] - null
        B[1812] - null
        B[1813] - null
        B[1814] - null
        B[1815] - null
        B[1816] - null
        B[1817] - null
        B[1818] - null
        B[1819] - null
        B[1820] - null
        B[1821] - null
        B[1822] - null
        B[1823] - null
        B[1824] - null
        B[1825] - null
        B[1826] - null
        B[1827] - null
        B[1828] - null
        B[1829] - null
        B[1830] - null
        B[1831] - null
        B[1832] - null
        B[1833] - null
        B[1834] - null
        B[1835] - null
        B[1836] - null
        B[1837] - null
        B[1838] - null
        B[1839] - null
        B[1840] - null
        B[1841] - null
        B[1842] - null
        B[1843] - null
        B[1844] - null
        B[1845] - null
        B[1846] - null
        B[1847] - null
        B[1848] - null
        B[1849] - null
        B[1850] - null
        B[1851] - null
        B[1852] - null
        B[1853] - null
        B[1854] - null
        B[1855] - null
        B[1856] - null
        B[1857] - null
        B[1858] - null
        B[1859] - null
        B[1860] - null
        B[1861] - null
        B[1862] - null
        B[1863] - null
        B[1864] - null
        B[1865] - null
        B[1866] - null
        B[1867] - null
        B[1868] - null
        B[1869] - null
        B[1870] - null
        B[1871] - null
        B[1872] - null
        B[1873] - null
        B[1874] - null
        B[1875] - null
        B[1876] - null
        B[1877] - null
        B[1878] - null
        B[1879] - null
        B[1880] - null
        B[1881] - null
        B[1882] - null
        B[1883] - null
        B[1884] - null
        B[1885] - null
        B[1886] - null
        B[1887] - null
        B[1888] - null
        B[1889] - null
        B[1890] - null
        B[1891] - null
        B[1892] - null
        B[1893] - null
        B[1894] - null
        B[1895] - null
        B[1896] - null
        B[1897] - null
        B[1898] - null
        B[1899] - null
        B[1900] - null
        B[1901] - null
        B[1902] - null
        B[1903] - null
        B[1904] - null
        B[1905] - null
        B[1906] - null
        B[1907] - null
        B[1908] - null
        B[1909] - null
        B[1910] - null
        B[1911] - null
        B[1912] - null
        B[1913] - null
        B[1914] - null
        B[1915] - null
        B[1916] - null
        B[1917] - null
        B[1918] - null
        B[1919] - null
        B[1920] - null
        B[1921] - null
        B[1922] - null
        B[1923] - null
        B[1924] - null
        B[1925] - null
        B[1926] - null
        B[1927] - null
        B[1928] - null
        B[1929] - null
        B[1930] - null
        B[1931] - null
        B[1932] - null
        B[1933] - null
        B[1934] - null
        B[1935] - null
        B[1936] - null
        B[1937] - null
        B[1938] - null
        B[1939] - null
        B[1940] - null
        B[1941] - null
        B[1942] - null
        B[1943] - null
        B[1944] - null
        B[1945] - null
        B[1946] - null
        B[1947] - null
        B[1948] - null
        B[1949] - null
        B[1950] - null
        B[1951] - null
        B[1952] - null
        B[1953] - null
        B[1954] - null
        B[1955] - null
        B[1956] - null
        B[1957] - null
        B[1958] - null
        B[1959] - null
        B[1960] - null
        B[1961] - null
        B[1962] - null
        B[1963] - null
        B[1964] - null
        B[1965] - null
        B[1966] - null
        B[1967] - null
        B[1968] - null
        B[1969] - null
        B[1970] - null
        B[1971] - null
        B[1972] - null
        B[1973] - null
        B[1974] - null
        B[1975] - null
        B[1976] - null
        B[1977] - null
        B[1978] - null
        B[1979] - null
        B[1980] - null
        B[1981] - null
        B[1982] - null
        B[1983] - null
        B[1984] - null
        B[1985] - null
        B[1986] - null
        B[1987] - null
        B[1988] - null
        B[1989] - null
        B[1990] - null
        B[1991] - null
        B[1992] - null
        B[1993] - null
        B[1994] - null
        B[1995] - null
        B[1996] - null
        B[1997] - null
        B[1998] - null
        B[1999] - null
        B[2000] - null
        B[2001] - null
        B[2002] - null
        B[2003] - null
        B[2004] - null
        B[2005] - null
        B[2006] - null
        B[2007] - null
        B[2008] - null
        B[2009] - null
        B[2010] - null
        B[2011] - null
        B[2012] - null
        B[2013] - null
        B[2014] - null
        B[2015] - null
        B[2016] - null
        B[2017] - null
        B[2018] - null
        B[2019] - null
        B[2020] - null
        B[2021] - null
        B[2022] - null
        B[2023] - null
        B[2024] - null
        B[2025] - null
        B[2026] - null
        B[2027] - null
        B[2028] - null
        B[2029] - null
        B[2030] - null
        B[2031] - null
        B[2032] - null
        B[2033] - null
        B[2034] - null
        B[2035] - null
        B[2036] - null
        B[2037] - null
        B[2038] - null
        B[2039] - null
        B[2040] - null
        B[2041] - null
        B[2042] - null
        B[2043] - null
        B[2044] - null
        B[2045] - null
        B[2046] - null
        B[2047] - null
        B[2048] - null
        B[2049] - null
        B[2050] - null
        B[2051] - null
        B[2052] - null
        B[2053] - null
        B[2054] - null
        B[2055] - null
        B[2056] - null
        B[2057] - null
        B[2058] - null
        B[2059] - null
        B[2060] - null
        B[2061] - null
        B[2062] - null
        B[2063] - null
        B[2064] - null
        B[2065] - null
        B[2066] - null
        B[2067] - null
        B[2068] - null
        B[2069] - null
        B[2070] - null
        B[2071] - null
        B[2072] - null
        B[2073] - null
        B[2074] - null
        B[2075] - null
        B[2076] - null
        B[2077] - null
        B[2078] - null
        B[2079] - null
        B[2080] - null
        B[2081] - null
        B[2082] - null
        B[2083] - null
        B[2084] - null
        B[2085] - null
        B[2086] - null
        B[2087] - null
        B[2088] - null
        B[2089] - null
        B[2090] - null
        B[2091] - null
        B[2092] - null
        B[2093] - null
        B[2094] - null
        B[2095] - null
        B[2096] - null
        B[2097] - null
        B[2098] - null
        B[2099] - null
        B[2100] - null
        B[2101] - null
        B[2102] - null
        B[2103] - null
        B[2104] - null
        B[2105] - null
        B[2106] - null
        B[2107] - null
        B[2108] - null
        B[2109] - null
        B[2110] - null
        B[2111] - null
        B[2112] - null
        B[2113] - null
        B[2114] - null
        B[2115] - null
        B[2116] - null
        B[2117] - null
        B[2118] - null
        B[2119] - null
        B[2120] - null
        B[2121] - null
        B[2122] - null
        B[2123] - null
        B[2124] - null
        B[2125] - null
        B[2126] - null
        B[2127] - null
        B[2128] - null
        B[2129] - null
        B[2130] - null
        B[2131] - null
        B[2132] - null
        B[2133] - null
        B[2134] - null
        B[2135] - null
        B[2136] - null
        B[2137] - null
        B[2138] - null
        B[2139] - null
        B[2140] - null
        B[2141] - null
        B[2142] - null
        B[2143] - null
        B[2144] - null
        B[2145] - null
        B[2146] - null
        B[2147] - null
        B[2148] - null
        B[2149] - null
        B[2150] - null
        B[2151] - null
        B[2152] - null
        B[2153] - null
        B[2154] - null
        B[2155] - null
        B[2156] - null
        B[2157] - null
        B[2158] - null
        B[2159] - null
        B[2160] - null
        B[2161] - null
        B[2162] - null
        B[2163] - null
        B[2164] - null
        B[2165] - null
        B[2166] - null
        B[2167] - null
        B[2168] - null
        B[2169] - null
        B[2170] - null
        B[2171] - null
        B[2172] - null
        B[2173] - null
        B[2174] - null
        B[2175] - null
        B[2176] - null
        B[2177] - null
        B[2178] - null
        B[2179] - null
        B[2180] - null
        B[2181] - null
        B[2182] - null
        B[2183] - null
        B[2184] - null
        B[2185] - null
        B[2186] - null
        B[2187] - null
        B[2188] - null
        B[2189] - null
        B[2190] - null
        B[2191] - null
        B[2192] - null
        B[2193] - null
        B[2194] - null
        B[2195] - null
        B[2196] - null
        B[2197] - null
        B[2198] - null
        B[2199] - null
        B[2200] - null
        B[2201] - null
        B[2202] - null
        B[2203] - null
        B[2204] - null
        B[2205] - null
        B[2206] - null
        B[2207] - null
        B[2208] - null
        B[2209] - null
        B[2210] - null
        B[2211] - null
        B[2212] - null
        B[2213] - null
        B[2214] - null
        B[2215] - null
        B[2216] - null
        B[2217] - null
        B[2218] - null
        B[2219] - null
        B[2220] - null
        B[2221] - null
        B[2222] - null
        B[2223] - null
        B[2224] - null
        B[2225] - null
        B[2226] - null
        B[2227] - null
        B[2228] - null
        B[2229] - null
        B[2230] - null
        B[2231] - null
        B[2232] - null
        B[2233] - null
        B[2234] - null
        B[2235] - null
        B[2236] - null
        B[2237] - null
        B[2238] - null
        B[2239] - null
        B[2240] - null
        B[2241] - null
        B[2242] - null
        B[2243] - null
        B[2244] - null
        B[2245] - null
        B[2246] - null
        B[2247] - null
        B[2248] - null
        B[2249] - null
        B[2250] - null
        B[2251] - null
        B[2252] - null
        B[2253] - null
        B[2254] - null
        B[2255] - null
        B[2256] - null
        B[2257] - null
        B[2258] - null
        B[2259] - null
        B[2260] - null
        B[2261] - null
        B[2262] - null
        B[2263] - null
        B[2264] - null
        B[2265] - null
        B[2266] - null
        B[2267] - null
        B[2268] - null
        B[2269] - null
        B[2270] - null
        B[2271] - null
        B[2272] - null
        B[2273] - null
        B[2274] - null
        B[2275] - null
        B[2276] - null
        B[2277] - null
        B[2278] - null
        B[2279] - null
        B[2280] - null
        B[2281] - null
        B[2282] - null
        B[2283] - null
        B[2284] - null
        B[2285] - null
        B[2286] - null
        B[2287] - null
        B[2288] - null
        B[2289] - null
        B[2290] - null
        B[2291] - null
        B[2292] - null
        B[2293] - null
        B[2294] - null
        B[2295] - null
        B[2296] - null
        B[2297] - null
        B[2298] - null
        B[2299] - null
        B[2300] - null
        B[2301] - null
        B[2302] - null
        B[2303] - null
        B[2304] - null
        B[2305] - null
        B[2306] - null
        B[2307] - null
        B[2308] - null
        B[2309] - null
        B[2310] - null
        B[2311] - null
        B[2312] - null
        B[2313] - null
        B[2314] - null
        B[2315] - null
        B[2316] - null
        B[2317] - null
        B[2318] - null
        B[2319] - null
        B[2320] - null
        B[2321] - null
        B[2322] - null
        B[2323] - null
        B[2324] - null
        B[2325] - null
        B[2326] - null
        B[2327] - null
        B[2328] - null
        B[2329] - null
        B[2330] - null
        B[2331] - null
        B[2332] - null
        B[2333] - null
        B[2334] - null
        B[2335] - null
        B[2336] - null
        B[2337] - null
        B[2338] - null
        B[2339] - null
        B[2340] - null
        B[2341] - null
        B[2342] - null
        B[2343] - null
        B[2344] - null
        B[2345] - null
        B[2346] - null
        B[2347] - null
        B[2348] - null
        B[2349] - null
        B[2350] - null
        B[2351] - null
        B[2352] - null
        B[2353] - null
        B[2354] - null
        B[2355] - null
        B[2356] - null
        B[2357] - null
        B[2358] - null
        B[2359] - null
        B[2360] - null
        B[2361] - null
        B[2362] - null
        B[2363] - null
        B[2364] - null
        B[2365] - null
        B[2366] - null
        B[2367] - null
        B[2368] - null
        B[2369] - null
        B[2370] - null
        B[2371] - null
        B[2372] - null
        B[2373] - null
        B[2374] - null
        B[2375] - null
        B[2376] - null
        B[2377] - null
        B[2378] - null
        B[2379] - null
        B[2380] - null
        B[2381] - null
        B[2382] - null
        B[2383] - null
        B[2384] - null
        B[2385] - null
        B[2386] - null
        B[2387] - null
        B[2388] - null
        B[2389] - null
        B[2390] - null
        B[2391] - null
        B[2392] - null
        B[2393] - null
        B[2394] - null
        B[2395] - null
        B[2396] - null
        B[2397] - null
        B[2398] - null
        B[2399] - null
        B[2400] - null
        B[2401] - null
        B[2402] - null
        B[2403] - null
        B[2404] - null
        B[2405] - null
        B[2406] - null
        B[2407] - null
        B[2408] - null
        B[2409] - null
        B[2410] - null
        B[2411] - null
        B[2412] - null
        B[2413] - null
        B[2414] - null
        B[2415] - null
        B[2416] - null
        B[2417] - null
        B[2418] - null
        B[2419] - null
        B[2420] - null
        B[2421] - null
        B[2422] - null
        B[2423] - null
        B[2424] - null
        B[2425] - null
        B[2426] - null
        B[2427] - null
        B[2428] - null
        B[2429] - null
        B[2430] - null
        B[2431] - null
        B[2432] - null
        B[2433] - null
        B[2434] - null
        B[2435] - null
        B[2436] - null
        B[2437] - null
        B[2438] - null
        B[2439] - null
        B[2440] - null
        B[2441] - null
        B[2442] - null
        B[2443] - null
        B[2444] - null
        B[2445] - null
        B[2446] - null
        B[2447] - null
        B[2448] - null
        B[2449] - null
        B[2450] - null
        B[2451] - null
        B[2452] - null
        B[2453] - null
        B[2454] - null
        B[2455] - null
        B[2456] - null
        B[2457] - null
        B[2458] - null
        B[2459] - null
        B[2460] - null
        B[2461] - null
        B[2462] - null
        B[2463] - null
        B[2464] - null
        B[2465] - null
        B[2466] - null
        B[2467] - null
        B[2468] - null
        B[2469] - null
        B[2470] - null
        B[2471] - null
        B[2472] - null
        B[2473] - null
        B[2474] - null
        B[2475] - null
        B[2476] - null
        B[2477] - null
        B[2478] - null
        B[2479] - null
        B[2480] - null
        B[2481] - null
        B[2482] - null
        B[2483] - null
        B[2484] - null
        B[2485] - null
        B[2486] - null
        B[2487] - null
        B[2488] - null
        B[2489] - null
        B[2490] - null
        B[2491] - null
        B[2492] - null
        B[2493] - null
        B[2494] - null
        B[2495] - null
        B[2496] - null
        B[2497] - null
        B[2498] - null
        B[2499] - null
        B[2500] - null
        B[2501] - null
        B[2502] - null
        B[2503] - null
        B[2504] - null
        B[2505] - null
        B[2506] - null
        B[2507] - null
        B[2508] - null
        B[2509] - null
        B[2510] - null
        B[2511] - null
        B[2512] - null
        B[2513] - null
        B[2514] - null
        B[2515] - null
        B[2516] - null
        B[2517] - null
        B[2518] - null
        B[2519] - null
        B[2520] - null
        B[2521] - null
        B[2522] - null
        B[2523] - null
        B[2524] - null
        B[2525] - null
        B[2526] - null
        B[2527] - null
        B[2528] - null
        B[2529] - null
        B[2530] - null
        B[2531] - null
        B[2532] - null
        B[2533] - null
        B[2534] - null
        B[2535] - null
        B[2536] - null
        B[2537] - null
        B[2538] - null
        B[2539] - null
        B[2540] - null
        B[2541] - null
        B[2542] - null
        B[2543] - null
        B[2544] - null
        B[2545] - null
        B[2546] - null
        B[2547] - null
        B[2548] - null
        B[2549] - null
        B[2550] - null
        B[2551] - null
        B[2552] - null
        B[2553] - null
        B[2554] - null
        B[2555] - null
        B[2556] - null
        B[2557] - null
        B[2558] - null
        B[2559] - null
        """, set2.toString());
  }

  @Test
  void toStr_set3() {
    assertEquals("""
        B[0] - null
        B[1] - null
        B[2] - 2 - null
        B[3] - 3 - null
        B[4] - 4 - null
        B[5] - null
        B[6] - null
        B[7] - 7 - null
        B[8] - 8 - null
        B[9] - 9 - null
        B[10] - 10 - null
        B[11] - null
        B[12] - 12 - null
        B[13] - 13 - null
        B[14] - 14 - null
        B[15] - 15 - null
        B[16] - 16 - null
        B[17] - 17 - null
        B[18] - 18 - null
        B[19] - 19 - null
        B[20] - 20 - null
        B[21] - null
        B[22] - 22 - null
        B[23] - null
        B[24] - 24 - null
        B[25] - 25 - null
        B[26] - 26 - null
        B[27] - null
        B[28] - 28 - null
        B[29] - null
        B[30] - 30 - null
        B[31] - 31 - null
        B[32] - null
        B[33] - 33 - null
        B[34] - 34 - null
        B[35] - 35 - null
        B[36] - null
        B[37] - 37 - null
        B[38] - 38 - null
        B[39] - 39 - null
        B[40] - 40 - null
        B[41] - 41 - null
        B[42] - null
        B[43] - 43 - null
        B[44] - 44 - null
        B[45] - 45 - null
        B[46] - 46 - null
        B[47] - 47 - null
        B[48] - null
        B[49] - null
        B[50] - 50 - null
        B[51] - 51 - null
        B[52] - null
        B[53] - 53 - null
        B[54] - 54 - null
        B[55] - null
        B[56] - 56 - null
        B[57] - 57 - null
        B[58] - null
        B[59] - 59 - null
        B[60] - 60 - null
        B[61] - 61 - null
        B[62] - null
        B[63] - 63 - null
        B[64] - null
        B[65] - 65 - null
        B[66] - 66 - null
        B[67] - 67 - null
        B[68] - 68 - null
        B[69] - 69 - null
        B[70] - null
        B[71] - 71 - null
        B[72] - null
        B[73] - null
        B[74] - null
        B[75] - 75 - null
        B[76] - 76 - null
        B[77] - null
        B[78] - 78 - null
        B[79] - null
        B[80] - 80 - null
        B[81] - 81 - null
        B[82] - 82 - null
        B[83] - null
        B[84] - null
        B[85] - 85 - null
        B[86] - 86 - null
        B[87] - 87 - null
        B[88] - 88 - null
        B[89] - null
        B[90] - null
        B[91] - 91 - null
        B[92] - null
        B[93] - null
        B[94] - null
        B[95] - 95 - null
        B[96] - 96 - null
        B[97] - 97 - null
        B[98] - null
        B[99] - null
        B[100] - 100 - null
        B[101] - null
        B[102] - null
        B[103] - null
        B[104] - null
        B[105] - null
        B[106] - null
        B[107] - null
        B[108] - null
        B[109] - null
        B[110] - null
        B[111] - null
        B[112] - null
        B[113] - null
        B[114] - null
        B[115] - null
        B[116] - null
        B[117] - null
        B[118] - null
        B[119] - null
        B[120] - null
        B[121] - null
        B[122] - null
        B[123] - null
        B[124] - null
        B[125] - null
        B[126] - null
        B[127] - null
        B[128] - null
        B[129] - null
        B[130] - null
        B[131] - null
        B[132] - null
        B[133] - null
        B[134] - null
        B[135] - null
        B[136] - null
        B[137] - null
        B[138] - null
        B[139] - null
        B[140] - null
        B[141] - null
        B[142] - null
        B[143] - null
        B[144] - null
        B[145] - null
        B[146] - null
        B[147] - null
        B[148] - null
        B[149] - null
        B[150] - null
        B[151] - null
        B[152] - null
        B[153] - null
        B[154] - null
        B[155] - null
        B[156] - null
        B[157] - null
        B[158] - null
        B[159] - null
        """, set3.toString());
  }
}