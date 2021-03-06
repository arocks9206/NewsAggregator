package jackalexmark.newsaggregator.components;

import jackalexmark.newsaggregator.models.Publisher;
import jackalexmark.newsaggregator.models.Source;
import jackalexmark.newsaggregator.models.Story;
import jackalexmark.newsaggregator.repository.PublisherRepository;
import jackalexmark.newsaggregator.repository.SourceRepository;
import jackalexmark.newsaggregator.repository.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PublisherRepository publisherRepository;

    @Autowired
    StoryRepository storyRepository;

    @Autowired
    SourceRepository sourceRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        Story story1 = new Story("Australia hacked by state actor");
        storyRepository.save(story1);

        Publisher bbc = new Publisher("BBC");
        publisherRepository.save(bbc);

        Source story1Source1 = new Source("Australia cyber attacks: PM Morrison warns of 'sophisticated' state hack",
                "https://ichef.bbci.co.uk/news/660/cpsprodpb/1538F/production/_112972968_hi062005465.jpg",
                "https://www.bbc.co.uk/news/world-australia-46096768", story1, 100, bbc);
        sourceRepository.save(story1Source1);


        Publisher guardian = new Publisher("The Guardian");
        publisherRepository.save(guardian);

        Source story1Source2 = new Source("Cyber-attack Australia: sophisticated attacks from ‘state-based actor’, PM says",
                "https://ichef.bbci.co.uk/news/660/cpsprodpb/1538F/production/_112972968_hi062005465.jpg",
                "https://www.theguardian.com/australia-news/2020/jun/19/australia-cyber-attack-attacks-hack-state-based-actor-says-australian-prime-minister-scott-morrison",
                story1, 80 , guardian);
        sourceRepository.save(story1Source2);

        Publisher independent = new Publisher("Independent");
        publisherRepository.save(independent);

        Source story1Source3 = new Source("China seen as key suspect in Australia cyber-attack",
                "https://static.independent.co.uk/s3fs-public/thumbnails/image/2020/06/19/11/scott-morrison.jpg?w968",
                "https://www.independent.co.uk/news/world/australasia/china-cyber-attacks-australia-a9575021.html",
                story1, 95, independent);
        sourceRepository.save(story1Source3);

        Publisher mirror = new Publisher("Mirror");
        publisherRepository.save(mirror);

        Source story1Source4 = new Source("Australia under huge 'sophisticated' cyber attack - all levels of government targeted",
                "https://i2-prod.mirror.co.uk/incoming/article22217329.ece/ALTERNATES/s615b/0_SCOTT-MORRISON-CYBER-ATTACK-PRESSER.jpg",
                "https://www.mirror.co.uk/news/world-news/breaking-australia-under-huge-sophisticated-22217272",
                story1, 112, mirror);
        sourceRepository.save(story1Source4);

        Story story2 = new Story("Trump comeback rally a flop");
        storyRepository.save(story2);

        Source story2Source1 = new Source("Donald Trump: Re-election campaign denies low turnout manipulation claim",
                "https://ichef.bbci.co.uk/news/624/cpsprodpb/147EE/production/_113005938_062059137.jpg",
                "https://www.bbc.co.uk/news/world-us-canada-53129524",
                story2, 100, bbc);
        sourceRepository.save(story2Source1);

        Source story2Source2 = new Source("Trump plans border visit and speech in aftermath of Tulsa rally flop – as it happened",
                "https://i.guim.co.uk/img/media/7dc609e837e1863f947fabd868b4ac94ac2f168d/0_136_4071_2443/master/4071.jpg?width=620&quality=85&auto=format&fit=max&s=e6c219aaae4d0336ff3dd659de45dce0",
                "https://www.theguardian.com/us-news/live/2020/jun/21/donald-trump-tulsa-rally-latest-updates-berman-bolton-protests-coronavirus-live",
                story2, 48, guardian);
        sourceRepository.save(story2Source2);

        Source story2Source3 = new Source("Trump campaign boasted that one million registered to attend his Tulsa rally. Only 6,200 turned up",
                "https://static.independent.co.uk/s3fs-public/thumbnails/image/2020/06/21/00/donald-trump-rally-tulsa-oklahoma.jpg?width=700&height=430&fit=bounds&format=pjpg&auto=webp&quality=70&crop=16:9,offset-y0.5",
                "https://www.independent.co.uk/news/world/americas/us-politics/trump-tulsa-rally-crowd-size-turnout-election-speech-oklahoma-coronavirus-tiktok-a9577986.html",
                story2, 112, independent);
        sourceRepository.save(story2Source3);

        Source story2Source4 = new Source("Donald Trump duped by K-pop teens and TikTok fans in Tulsa rally humiliation",
                "https://i2-prod.mirror.co.uk/incoming/article22228828.ece/ALTERNATES/s615b/0_JS213925586.jpg",
                "https://www.mirror.co.uk/news/us-news/donald-trump-duped-k-pop-22230072",
                story2, 150, mirror);
        sourceRepository.save(story2Source4);

//        //////

        Story story3 = new Story("Treatment approved for fight against coronavirus");
        storyRepository.save(story3);

        Source story3Source1 = new Source("Coronavirus: What is dexamethasone and how does it work?",
                "https://ichef.bbci.co.uk/news/660/cpsprodpb/15383/production/_112951968_f37c9cd2-8b71-4628-b509-ab5e1f9367c2.jpg",
                "https://www.bbc.co.uk/news/health-53077879",
                story3, 88, bbc);
        sourceRepository.save(story3Source1);


        Source story3Source2 = new Source("Dexamethasone may be part of the Covid-19 puzzle, but it's no magic bullet",
                "https://i.guim.co.uk/img/media/cdc05c9780abdd366a0753ccfbb7b389cdcf33c7/0_199_3500_2100/master/3500.jpg?width=605&quality=45&auto=format&fit=max&dpr=2&s=0b9724dc9d135ee855b6aff2b8b1cc53",
                "https://www.theguardian.com/world/commentisfree/2020/jun/17/dexamethasone-may-be-part-of-the-covid-19-puzzle-but-its-no-magic-bullet",
                story3, 155, guardian);
        sourceRepository.save(story3Source2);

        Source story3Source3 = new Source("DEXAMETHASONE: WHAT IS THE NEW LIFE-SAVING CORONAVIRUS DRUG?",
                "https://static.independent.co.uk/s3fs-public/thumbnails/image/2020/06/16/13/pri152002542.jpg?w230",
                "https://www.independent.co.uk/life-style/health-and-families/health-news/dexamethasone-coronavirus-treatment-drug-side-effects-dose-covid-19-a9568831.html",
                story3, 97, independent);
        sourceRepository.save(story3Source3);

        Source story3source4 = new Source("What is dexamethasone? Everything you need to know about breakthrough coronavirus drug",
                "https://i2-prod.mirror.co.uk/science/article22200880.ece/ALTERNATES/s810/0_JS213652782.jpg",
                "https://www.mirror.co.uk/science/what-dexamethasone-everything-you-need-22200997",
                story3, 94, mirror);
        sourceRepository.save(story3source4);

//        ///////

        Story story4 = new Story("Reading park stabbings");
        storyRepository.save(story4);

        Source story4Source1 = new Source("Reading park stabbings: What we know so far",
                "https://ichef.bbci.co.uk/news/660/cpsprodpb/0AD3/production/_113017720_670b24dc-7217-4382-a875-0dd796860cb4.jpg",
                "https://www.bbc.co.uk/news/uk-53124359", story4, 181, bbc);
        sourceRepository.save(story4Source1);

        Source story4Source2 = new Source("Reading terror attack: US-born man named as one of victims",
                "https://i.guim.co.uk/img/media/1442cae13ab166f4d9c71d9190ac12c5e3eb5d77/0_335_1267_759/master/1267.jpg?width=605&quality=45&auto=format&fit=max&dpr=2&s=c18fc4c3eb2ed74b56013459afddf87f",
                "https://www.theguardian.com/uk-news/2020/jun/22/reading-terror-attack-us-born-man-named-one-victims",
                story4, 121, guardian);
        sourceRepository.save(story4Source2);

        Source story4Source3 = new Source("'Our family are heartbroken': Second Reading terror attack victim named as American living in UK",
                "https://static.independent.co.uk/s3fs-public/thumbnails/image/2020/06/21/15/2020-06-21T133126Z-1770401207-RC2PDH962K0M-RTRMADP-3-BRITAIN-SECURITY-0.JPG?width=1368&height=912&fit=bounds&format=pjpg&auto=webp&quality=70",
                "https://www.independent.co.uk/news/uk/crime/reading-terror-attack-victim-joe-ritchie-bennett-terrorism-latest-a9578546.html",
                story4, 140, independent);
        sourceRepository.save(story4Source3);


        Source story4Source4 = new Source("Second victim of Reading terror attack named as American who was 'brilliant and loving'",
                "https://i2-prod.mirror.co.uk/incoming/article22231346.ece/ALTERNATES/s615b/0_Joe-Ritchie-Bennett.jpg",
                "https://www.mirror.co.uk/news/uk-news/breaking-second-victim-reading-terror-22231243",
                story4, 144, mirror);
        sourceRepository.save(story4Source4);

        Story story5 = new Story("F1 launches equality and diversity task force");
        storyRepository.save(story5);

        Source story5Source1 = new Source("F1 launches equality and diversity task force",
                "https://ichef.bbci.co.uk/onesport/cps/800/cpsprodpb/7063/production/_113017782_hi061758207.jpg",
                "https://www.bbc.co.uk/sport/formula1/53134827",
                story5, 68, bbc);
        sourceRepository.save(story5Source1);

        Source story5Source2 = new Source("Lewis Hamilton to set up commission to increase diversity in motor sport",
                "https://i.guim.co.uk/img/media/135dea132c6de183cc123f913b6f6ae197e73b3f/0_283_5184_3111/master/5184.jpg?width=605&quality=45&auto=format&fit=max&dpr=2&s=9e9a0d3347e0e5a3289994d6daa0d42f",
                "https://www.theguardian.com/sport/2020/jun/21/lewis-hamilton-commission-increase-diversity-in-motor-sport-formula-one",
                story5, 100, guardian);
        sourceRepository.save(story5Source2);

        Source story5Source3 = new Source("Lewis Hamilton launches commission to increase black representation in motorsport in effort to trigger change",
                "https://static.independent.co.uk/s3fs-public/thumbnails/image/2020/06/06/09/gettyimages-1211900965.jpg?w230",
                "https://www.independent.co.uk/sport/motor-racing/formula1/f1-lewis-hamilton-racism-black-lives-matter-launch-commission-a9577736.html",
                story5, 121, independent);
        sourceRepository.save(story5Source3);

    }
}
