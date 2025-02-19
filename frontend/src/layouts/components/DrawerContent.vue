<script setup>
import {
  VerticalNavLink,
  VerticalNavSectionTitle,
} from '@layouts'
</script>

<template>
    <ul>
        <VerticalNavSectionTitle :item="{ heading: '봉사자' }" />
        <VerticalNavLink
            :item="{
                title: '봉사자정보',
                to: '/volunteers/volunteerInfos',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: '매칭시스템' }" />
        <VerticalNavLink
            :item="{
                title: '매칭정보',
                to: '/매칭시스템/matchingInfos',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: '봉사활동' }" />
        <VerticalNavLink
            :item="{
                title: '봉사활동',
                to: '/volunteerings/volunteerings',
            }"
        />
        <VerticalNavLink
            :item="{
                title: '봉사활동신청내역확인',
                to: '/volunteerings/checkVolunteeringApplicationHistories',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: '수혜기관' }" />
        <VerticalNavLink
            :item="{
                title: '수혜기관정보',
                to: '/수혜기관/associationInfos',
            }"
        />
        <VerticalNavLink
            :item="{
                title: '봉사활동정보',
                to: '/수혜기관/봉사활동정보',
            }"
        />
        <VerticalNavLink
            :item="{
                title: '봉사활동일정조회',
                to: '/수혜기관/봉사활동일정조회',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: '커뮤니티' }" />
        <VerticalNavLink
            :item="{
                title: '커뮤니티',
                to: '/communities/communities',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: '마이페이지' }" />
        <VerticalNavLink
            :item="{
                title: '마이페이지',
                to: '/mypages/myPages',
            }"
        />
    </ul>
</template>
