package ru.kpfu.itis.shcherbanev

object CoinRepository {

    val coins: List<Coin> = listOf(
        Coin(
            id = 0,
            name = "Bitcoin",
            price = 62506,
            pictureUrl = "https://sneg.top/uploads/posts/2023-03/1678902343_sneg-top-p-bitkoini-na-belom-fone-vkontakte-52.png",
            information = "Bitcoin, introduced by the mysterious Satoshi Nakamoto in 2009, " +
                    "is the first and most well-known cryptocurrency. " +
                    "It has a market capitalization of \$1.24 trillion1."
        ),
        Coin(
            id = 1,
            name = "Ethereum",
            price = 3431,
            pictureUrl = "https://images.rawpixel.com/image_png_800/cHJpdmF0ZS9sci9pbWFnZXMvd2Vic2l0ZS8yMDIyLTA1L3JtNTMzLWljb24tMTA2LnBuZw.png",
            information = "Ethereum is a community-driven technology that powers the cryptocurrency " +
                    "Ether (ETH) and thousands of decentralized applications (dApps)."
        ),
        Coin(
            id = 2,
            name = "Bnb",
            price = 545,
            pictureUrl = "https://airnfts.s3.amazonaws.com/profile-images/20211127/0xCB4a3f31a1Bf18891128f37AB4Cd48cD01e6f0Ce_1638013267132.png",
            information = "BNB is a cryptocurrency that supports the Binance Chain ecosystem."
        ),
        Coin(
            id = 3,
            name = "Ripple",
            price = 3,
            pictureUrl = "https://cdn4.iconfinder.com/data/icons/cryptocoins/227/XRP-1024.png",
            information = "XRP is a cryptocurrency that powers the XRP Ledger, a blockchain technology designed for financial services"
        ),
        Coin(
            id = 4,
            name = "Solana",
            price = 119,
            pictureUrl = "https://user-images.githubusercontent.com/89864818/193443511-1a552e0f-199f-465d-a492-187aca0620bf.png",
            information = "Solana is a fast, scalable, and decentralized blockchain network"
        ),
        Coin(
            id = 5,
            name = "EOS",
            price = 25,
            pictureUrl = "https://cdn0.iconfinder.com/data/icons/blockchain-classic/256/EOS-1024.png",
            information = "EOS is an open-source blockchain platform known for its high performance, flexibility, security, and developer-friendly experience"
        ),
        Coin(
            id = 6,
            name = "Ada",
            price = 2,
            pictureUrl = "https://1.bp.blogspot.com/-v1BqX6tiDRY/YTdRHhgqoSI/AAAAAAAAF1k/9Vb_uTha6eYZCwW5ynDaHS7cMoXhaqLcwCLcBGAsYHQ/s1600/Logo%2BCardano%2BCoin.png",
            information = "Cardano is a decentralized third-generation proof-of-stake blockchain platform"
        )
    )

}