// SPDX-License-Identifier: MIT

pragma solidity >=0.7.0 <0.9.0;

import '@thesolidchain/pancake-swap-periphery/contracts/interfaces/IPancakeRouter02.sol';

contract TestTask {

    address private pancakeswap = 0x9Ac64Cc6e4415144C455BD8E4837Fea55603e5c3;

    address[] private BTC2BUSD = new address[](2);
    address[] private BNB2BUSD = new address[](2);
    address[] private ETH2BUSD = new address[](2);

    constructor() {
        BTC2BUSD.push(0x7130d2A12B9BCbFAe4f2634d864A1Ee1Ce3Ead9c);
        BTC2BUSD.push(0xe9e7CEA3DedcA5984780Bafc599bD69ADd087D56);

        BNB2BUSD.push(0x7130d2A12B9BCbFAe4f2634d864A1Ee1Ce3Ead9c);
        BNB2BUSD.push(0xbb4CdB9CBd36B01bD1cBaEBF2De08d9173bc095c);

        ETH2BUSD.push(0x7130d2A12B9BCbFAe4f2634d864A1Ee1Ce3Ead9c);
        ETH2BUSD.push(0x2170Ed0880ac9A755fd29B2688956BD959F933F8);
    }

    function getBTC() external view returns (uint) {
        return IPancakeRouter02(pancakeswap).getAmountsOut(1, BTC2BUSD)[1];
    }

    function getBNB() external view returns (uint) {
        return IPancakeRouter02(pancakeswap).getAmountsOut(1, BNB2BUSD)[1];
    }

    function getETH() external view returns (uint) {
        return IPancakeRouter02(pancakeswap).getAmountsOut(1, ETH2BUSD)[1];
    }

}