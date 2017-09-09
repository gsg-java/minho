<div class="container">
    <h2 class="text-center">Portfolio</h2>
    <hr class="star-primary">
    <div class="row">
        <#list portfolioList as portfolio>
            <div class="col-sm-4 portfolio-item">
                <a class="portfolio-link" href="#portfolioModal${portfolio?counter}" data-toggle="modal">
                    <div class="caption">
                        <div class="caption-content">
                            <i class="fa fa-search-plus fa-3x"></i>
                        </div>
                    </div>
                    <img class="img-fluid" src="${portfolio.image}" alt="">
                </a>
            </div>
        </#list>
    </div>
</div>




