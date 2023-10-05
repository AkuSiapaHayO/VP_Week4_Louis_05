package com.example.week4_louis_05.data

import com.example.week4_louis_05.model.Explore
import com.example.week4_louis_05.model.Feed
import com.example.week4_louis_05.model.Story
import com.example.week4_louis_05.model.Suggestion
import com.example.week4_louis_05.R

class DataSource {
    public fun loadFeed(): List<Feed>{
        return listOf<Feed>(
            Feed("john_doe", R.drawable.profile_1, R.drawable.content_1, true, false, 50, "Caption 1. This is a long and detailed caption that spans multiple paragraphs. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac libero at purus scelerisque ultrices. Integer malesuada a justo eu facilisis. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nam vel nunc nec metus interdum efficituR. Nulla facilisi. Nulla rhoncus est et neque facilisis, vel venenatis quam blandit. Sed viverra justo at mi vestibulum eleifend. Vestibulum ut felis ut tortor tincidunt vehicula at id lacus. Donec feugiat dolor in metus congue, id vestibulum nulla posuere. Fusce a quam purus. Vivamus egestas et nisi in bibendum. Praesent id hendrerit ex. Nullam vel tortor nec neque pharetra congue.", "2023-10-01"),
            Feed("jane_smith", R.drawable.profile_2, R.drawable.content_2, false, true, 10000, "Caption 2. Another long caption to demonstrate multiline text. Duis vehicula, felis id cursus sollicitudin, ipsum arcu interdum libero, vel posuere lectus orci et odio. Sed tristique felis id vehicula laoreet. Suspendisse potenti. Nullam vitae aliquet elit. Etiam in lacinia est. Fusce eget iaculis arcu. Phasellus dictum viverra ex, ac dictum neque pellentesque sit amet. Nullam scelerisque ut velit et sollicitudin. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec vel neque eu leo rhoncus cursus. Sed at sapien ex. Praesent suscipit odio eget libero bibendum, id blandit justo sollicitudin. Cras euismod enim in nulla fringilla, quis dapibus est condimentum. Integer tincidunt nisl nec metus convallis, non bibendum libero elementum.", "2022-06-15"),
            Feed("alex123", R.drawable.profile_3, R.drawable.content_3, true, true, 5000, "Caption 3. A lengthy caption with multiple paragraphs. Vivamus convallis justo odio, et finibus metus laoreet ac. Proin volutpat, quam eget vehicula tincidunt, arcu tortor sollicitudin elit, nec placerat odio libero a libero. Phasellus id odio ac odio tempus lacinia. Donec congue nec nisi in tempoR. Vestibulum quis sapien eget libero cursus vehicula. Fusce vestibulum rhoncus mi, id euismod justo laoreet et. Curabitur iaculis, purus in viverra consectetur, elit justo gravida urna, vel congue felis libero non elit. Cras a semper nisl. Aenean tristique tortor a scelerisque. Vivamus eget semper lorem. Duis lacinia libero et sollicitudin. In hac habitasse platea dictumst.", "2020-12-20"),
            Feed("emily_green", R.drawable.profile_4, R.drawable.content_4, false, true, 750, "Caption 4. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac libero at purus scelerisque ultrices. Integer malesuada a justo eu facilisis. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nam vel nunc nec metus interdum efficituR. Nulla facilisi. Nulla rhoncus est et neque facilisis, vel venenatis quam blandit. Sed viverra justo at mi vestibulum eleifend. Vestibulum ut felis ut tortor tincidunt vehicula at id lacus. Donec feugiat dolor in metus congue, id vestibulum nulla posuere. Fusce a quam purus. Vivamus egestas et nisi in bibendum. Praesent id hendrerit ex. Nullam vel tortor nec neque pharetra congue.", "2018-11-03"),
            Feed("sam_wilson", R.drawable.profile_5, R.drawable.content_5, true, false, 2000, "Caption 5. Another long caption to demonstrate multiline text. Duis vehicula, felis id cursus sollicitudin, ipsum arcu interdum libero, vel posuere lectus orci et odio. Sed tristique felis id vehicula laoreet. Suspendisse potenti. Nullam vitae aliquet elit. Etiam in lacinia est. Fusce eget iaculis arcu. Phasellus dictum viverra ex, ac dictum neque pellentesque sit amet. Nullam scelerisque ut velit et sollicitudin. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec vel neque eu leo rhoncus cursus. Sed at sapien ex. Praesent suscipit odio eget libero bibendum, id blandit justo sollicitudin. Cras euismod enim in nulla fringilla, quis dapibus est condimentum. Integer tincidunt nisl nec metus convallis, non bibendum libero elementum.", "2022-08-22"),
            Feed("lisa_martin", R.drawable.profile_6, R.drawable.content_6, false, false, 3000, "Caption 6. A lengthy caption with multiple paragraphs. Vivamus convallis justo odio, et finibus metus laoreet ac. Proin volutpat, quam eget vehicula tincidunt, arcu tortor sollicitudin elit, nec placerat odio libero a libero. Phasellus id odio ac odio tempus lacinia. Donec congue nec nisi in tempoR. Vestibulum quis sapien eget libero cursus vehicula. Fusce vestibulum rhoncus mi, id euismod justo laoreet et. Curabitur iaculis, purus in viverra consectetur, elit justo gravida urna, vel congue felis libero non elit. Cras a semper nisl. Aenean tristique tortor a scelerisque. Vivamus eget semper lorem. Duis lacinia libero et sollicitudin. In hac habitasse platea dictumst.", "2016-02-14"),
            Feed("mike_brown", R.drawable.profile_7, R.drawable.content_7, true, true, 1500, "Caption 7. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac libero at purus scelerisque ultrices. Integer malesuada a justo eu facilisis. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nam vel nunc nec metus interdum efficituR. Nulla facilisi. Nulla rhoncus est et neque facilisis, vel venenatis quam blandit. Sed viverra justo at mi vestibulum eleifend. Vestibulum ut felis ut tortor tincidunt vehicula at id lacus. Donec feugiat dolor in metus congue, id vestibulum nulla posuere. Fusce a quam purus. Vivamus egestas et nisi in bibendum. Praesent id hendrerit ex. Nullam vel tortor nec neque pharetra congue.", "2005-05-10"),
            Feed("sara_jones", R.drawable.profile_8, R.drawable.content_8, false, false, 8000, "Caption 8. Another long caption to demonstrate multiline text. Duis vehicula, felis id cursus sollicitudin, ipsum arcu interdum libero, vel posuere lectus orci et odio. Sed tristique felis id vehicula laoreet. Suspendisse potenti. Nullam vitae aliquet elit. Etiam in lacinia est. Fusce eget iaculis arcu. Phasellus dictum viverra ex, ac dictum neque pellentesque sit amet. Nullam scelerisque ut velit et sollicitudin. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec vel neque eu leo rhoncus cursus. Sed at sapien ex. Praesent suscipit odio eget libero bibendum, id blandit justo sollicitudin. Cras euismod enim in nulla fringilla, quis dapibus est condimentum. Integer tincidunt nisl nec metus convallis, non bibendum libero elementum.", "2006-09-28"),
            Feed("chris_taylor", R.drawable.profile_9, R.drawable.content_9, true, true, 2500, "Caption 9. A lengthy caption with multiple paragraphs. Vivamus convallis justo odio, et finibus metus laoreet ac. Proin volutpat, quam eget vehicula tincidunt, arcu tortor sollicitudin elit, nec placerat odio libero a libero. Phasellus id odio ac odio tempus lacinia. Donec congue nec nisi in tempoR. Vestibulum quis sapien eget libero cursus vehicula. Fusce vestibulum rhoncus mi, id euismod justo laoreet et. Curabitur iaculis, purus in viverra consectetur, elit justo gravida urna, vel congue felis libero non elit. Cras a semper nisl. Aenean tristique tortor a scelerisque. Vivamus eget semper lorem. Duis lacinia libero et sollicitudin. In hac habitasse platea dictumst.", "2001-01-12"),
            Feed("olivia_walker", R.drawable.profile_10, R.drawable.content_10, false, false, 4500, "Caption 10. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac libero at purus scelerisque ultrices. Integer malesuada a justo eu facilisis. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nam vel nunc nec metus interdum efficituR. Nulla facilisi. Nulla rhoncus est et neque facilisis, vel venenatis quam blandit. Sed viverra justo at mi vestibulum eleifend. Vestibulum ut felis ut tortor tincidunt vehicula at id lacus. Donec feugiat dolor in metus congue, id vestibulum nulla posuere. Fusce a quam purus. Vivamus egestas et nisi in bibendum. Praesent id hendrerit ex. Nullam vel tortor nec neque pharetra congue.", "2017-12-05"),
            Feed("megan_white", R.drawable.profile_11, R.drawable.content_11, true, true, 1800, "Caption 11. Another long caption to demonstrate multiline text. Duis vehicula, felis id cursus sollicitudin, ipsum arcu interdum libero, vel posuere lectus orci et odio. Sed tristique felis id vehicula laoreet. Suspendisse potenti. Nullam vitae aliquet elit. Etiam in lacinia est. Fusce eget iaculis arcu. Phasellus dictum viverra ex, ac dictum neque pellentesque sit amet. Nullam scelerisque ut velit et sollicitudin. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec vel neque eu leo rhoncus cursus. Sed at sapien ex. Praesent suscipit odio eget libero bibendum, id blandit justo sollicitudin. Cras euismod enim in nulla fringilla, quis dapibus est condimentum. Integer tincidunt nisl nec metus convallis, non bibendum libero elementum.", "2013-06-17"),
            Feed("david_anderson", R.drawable.profile_12, R.drawable.content_12, false, true, 6000, "Caption 12. A lengthy caption with multiple paragraphs. Vivamus convallis justo odio, et finibus metus laoreet ac. Proin volutpat, quam eget vehicula tincidunt, arcu tortor sollicitudin elit, nec placerat odio libero a libero. Phasellus id odio ac odio tempus lacinia. Donec congue nec nisi in tempoR. Vestibulum quis sapien eget libero cursus vehicula. Fusce vestibulum rhoncus mi, id euismod justo laoreet et. Curabitur iaculis, purus in viverra consectetur, elit justo gravida urna, vel congue felis libero non elit. Cras a semper nisl. Aenean tristique tortor a scelerisque. Vivamus eget semper lorem. Duis lacinia libero et sollicitudin. In hac habitasse platea dictumst.", "2008-03-24"),
            Feed("natalie_clark", R.drawable.profile_13, R.drawable.content_13, true, true, 3500, "Caption 13. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac libero at purus scelerisque ultrices. Integer malesuada a justo eu facilisis. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nam vel nunc nec metus interdum efficituR. Nulla facilisi. Nulla rhoncus est et neque facilisis, vel venenatis quam blandit. Sed viverra justo at mi vestibulum eleifend. Vestibulum ut felis ut tortor tincidunt vehicula at id lacus. Donec feugiat dolor in metus congue, id vestibulum nulla posuere. Fusce a quam purus. Vivamus egestas et nisi in bibendum. Praesent id hendrerit ex. Nullam vel tortor nec neque pharetra congue.", "2014-10-08"),
            Feed("kevin_harris", R.drawable.profile_14, R.drawable.content_14, false, false, 4200, "Caption 14. Another long caption to demonstrate multiline text. Duis vehicula, felis id cursus sollicitudin, ipsum arcu interdum libero, vel posuere lectus orci et odio. Sed tristique felis id vehicula laoreet. Suspendisse potenti. Nullam vitae aliquet elit. Etiam in lacinia est. Fusce eget iaculis arcu. Phasellus dictum viverra ex, ac dictum neque pellentesque sit amet. Nullam scelerisque ut velit et sollicitudin. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec vel neque eu leo rhoncus cursus. Sed at sapien ex. Praesent suscipit odio eget libero bibendum, id blandit justo sollicitudin. Cras euismod enim in nulla fringilla, quis dapibus est condimentum. Integer tincidunt nisl nec metus convallis, non bibendum libero elementum.", "2022-02-01"),
            Feed("anna_moore", R.drawable.profile_15, R.drawable.content_15, true, false, 300, "Caption 15. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac libero at purus scelerisque ultrices. Integer malesuada a justo eu facilisis. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nam vel nunc nec metus interdum efficituR. Nulla facilisi. Nulla rhoncus est et neque facilisis, vel venenatis quam blandit. Sed viverra justo at mi vestibulum eleifend. Vestibulum ut felis ut tortor tincidunt vehicula at id lacus. Donec feugiat dolor in metus congue, id vestibulum nulla posuere. Fusce a quam purus. Vivamus egestas et nisi in bibendum. Praesent id hendrerit ex. Nullam vel tortor nec neque pharetra congue.", "2023-09-11"),
            Feed("peter_jackson", R.drawable.profile_16, R.drawable.content_16, false, true, 5600, "Caption 16. A lengthy caption with multiple paragraphs. Vivamus convallis justo odio, et finibus metus laoreet ac. Proin volutpat, quam eget vehicula tincidunt, arcu tortor sollicitudin elit, nec placerat odio libero a libero. Phasellus id odio ac odio tempus lacinia. Donec congue nec nisi in tempoR. Vestibulum quis sapien eget libero cursus vehicula. Fusce vestibulum rhoncus mi, id euismod justo laoreet et. Curabitur iaculis, purus in viverra consectetur, elit justo gravida urna, vel congue felis libero non elit. Cras a semper nisl. Aenean tristique tortor a scelerisque. Vivamus eget semper lorem. Duis lacinia libero et sollicitudin. In hac habitasse platea dictumst.", "2023-04-30"),
            Feed("oliver_miller", R.drawable.profile_17, R.drawable.content_17, true, false, 7800, "Caption 17. Another long caption to demonstrate multiline text. Duis vehicula, felis id cursus sollicitudin, ipsum arcu interdum libero, vel posuere lectus orci et odio. Sed tristique felis id vehicula laoreet. Suspendisse potenti. Nullam vitae aliquet elit. Etiam in lacinia est. Fusce eget iaculis arcu. Phasellus dictum viverra ex, ac dictum neque pellentesque sit amet. Nullam scelerisque ut velit et sollicitudin. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec vel neque eu leo rhoncus cursus. Sed at sapien ex. Praesent suscipit odio eget libero bibendum, id blandit justo sollicitudin. Cras euismod enim in nulla fringilla, quis dapibus est condimentum. Integer tincidunt nisl nec metus convallis, non bibendum libero elementum.", "2022-03-12"),
            Feed("mia_davis", R.drawable.profile_18, R.drawable.content_18, false, true, 9200, "Caption 18. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac libero at purus scelerisque ultrices. Integer malesuada a justo eu facilisis. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nam vel nunc nec metus interdum efficituR. Nulla facilisi. Nulla rhoncus est et neque facilisis, vel venenatis quam blandit. Sed viverra justo at mi vestibulum eleifend. Vestibulum ut felis ut tortor tincidunt vehicula at id lacus. Donec feugiat dolor in metus congue, id vestibulum nulla posuere. Fusce a quam purus. Vivamus egestas et nisi in bibendum. Praesent id hendrerit ex. Nullam vel tortor nec neque pharetra congue.", "2020-11-20")
        )
    }

    public fun loadStory(): List<Story>{
        return listOf<Story>(
            Story("john_doe", R.drawable.profile_1, true, false),
            Story("jane_smith", R.drawable.profile_2, false, true),
            Story("alice_johnson", R.drawable.profile_3, true, true),
            Story("david_williams", R.drawable.profile_4, false, false),
            Story("emily_brown", R.drawable.profile_5, true, false),
            Story("michael_davis", R.drawable.profile_6, false, true),
            Story("susan_jackson", R.drawable.profile_7, true, true),
            Story("robert_jones", R.drawable.profile_8, false, false),
            Story("lisa_anderson", R.drawable.profile_9, true, false),
            Story("william_taylor", R.drawable.profile_10, false, true),
            Story("elizabeth_martin", R.drawable.profile_11, true, true),
            Story("james_johnson", R.drawable.profile_12, false, false),
            Story("natalie_rodriguez", R.drawable.profile_13, true, false),
            Story("peter_white", R.drawable.profile_14, false, true),
            Story("olivia_lee", R.drawable.profile_15, true, true),
            Story("thomas_wilson", R.drawable.profile_16, false, false),
            Story("grace_martin", R.drawable.profile_17, true, false),
            Story("jacob_hernandez", R.drawable.profile_18, false, true)
        )
    }

    public fun loadSuggestion(): List<Suggestion>{
        return listOf<Suggestion>(
            Suggestion("lisa_anderson", R.drawable.profile_9, true, false),
            Suggestion("jane_smith", R.drawable.profile_2, false, true),
            Suggestion("elizabeth_martin", R.drawable.profile_11, true, true),
            Suggestion("olivia_lee", R.drawable.profile_15, true, true),
            Suggestion("david_williams", R.drawable.profile_4, false, false),
            Suggestion("emily_brown", R.drawable.profile_5, true, false),
            Suggestion("susan_jackson", R.drawable.profile_7, true, true),
            Suggestion("grace_martin", R.drawable.profile_17, true, false),
            Suggestion("robert_jones", R.drawable.profile_8, false, false),
            Suggestion("william_taylor", R.drawable.profile_10, false, true),
            Suggestion("natalie_rodriguez", R.drawable.profile_13, true, false),
            Suggestion("john_doe", R.drawable.profile_1, true, false),
            Suggestion("james_johnson", R.drawable.profile_12, false, false),
            Suggestion("alice_johnson", R.drawable.profile_3, true, true),
            Suggestion("peter_white", R.drawable.profile_14, false, true),
            Suggestion("thomas_wilson", R.drawable.profile_16, false, false),
            Suggestion("michael_davis", R.drawable.profile_6, false, true),
            Suggestion("jacob_hernandez", R.drawable.profile_18, false, true)
        )
    }

    public fun loadExplore(): List<Explore>{
        return listOf<Explore>(
            Explore(R.drawable.content_1),
            Explore(R.drawable.content_2),
            Explore(R.drawable.content_3),
            Explore(R.drawable.content_4),
            Explore(R.drawable.content_5),
            Explore(R.drawable.content_6),
            Explore(R.drawable.content_7),
            Explore(R.drawable.content_8),
            Explore(R.drawable.content_9),
            Explore(R.drawable.content_10),
            Explore(R.drawable.content_11),
            Explore(R.drawable.content_12),
            Explore(R.drawable.content_13),
            Explore(R.drawable.content_14),
            Explore(R.drawable.content_15),
            Explore(R.drawable.content_16),
            Explore(R.drawable.content_17),
            Explore(R.drawable.content_18),
            Explore(R.drawable.content_19),
            Explore(R.drawable.content_20),
            Explore(R.drawable.content_21),
            Explore(R.drawable.content_22),
            Explore(R.drawable.content_23),
            Explore(R.drawable.content_24),
            Explore(R.drawable.content_25),
            Explore(R.drawable.content_26),
            Explore(R.drawable.content_27),
            Explore(R.drawable.content_28),
            Explore(R.drawable.content_29),
            Explore(R.drawable.content_30),
            Explore(R.drawable.content_31),
            Explore(R.drawable.content_32),
            Explore(R.drawable.content_33),
            Explore(R.drawable.content_34),
            Explore(R.drawable.content_35),
            Explore(R.drawable.content_36),
            Explore(R.drawable.content_37),
            Explore(R.drawable.content_38),
            Explore(R.drawable.content_39),
            Explore(R.drawable.content_40),
            Explore(R.drawable.content_41),
            Explore(R.drawable.content_42),
            Explore(R.drawable.content_43),
            Explore(R.drawable.content_44),
            Explore(R.drawable.content_45),
            Explore(R.drawable.content_46),
            Explore(R.drawable.content_47),
            Explore(R.drawable.content_48),
            Explore(R.drawable.content_49),
            Explore(R.drawable.content_50),
            Explore(R.drawable.content_51),
            Explore(R.drawable.content_52),
            Explore(R.drawable.content_53),
            Explore(R.drawable.content_54),
            Explore(R.drawable.content_55),
            Explore(R.drawable.content_56),
            Explore(R.drawable.content_57),
            Explore(R.drawable.content_58),
            Explore(R.drawable.content_59),
            Explore(R.drawable.content_60),
            Explore(R.drawable.content_61),
            Explore(R.drawable.content_62),
            Explore(R.drawable.content_63),
            Explore(R.drawable.content_64),
            Explore(R.drawable.content_65),
            Explore(R.drawable.content_66),
            Explore(R.drawable.content_67),
            Explore(R.drawable.content_68),
            Explore(R.drawable.content_69),
            Explore(R.drawable.content_70),
            Explore(R.drawable.content_71),
            Explore(R.drawable.content_72),
            Explore(R.drawable.content_73),
            Explore(R.drawable.content_74),
            Explore(R.drawable.content_75),
            Explore(R.drawable.content_76),
            Explore(R.drawable.content_77),
            Explore(R.drawable.content_78),
            Explore(R.drawable.content_79),
            Explore(R.drawable.content_80)
        )
    }
}