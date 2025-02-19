<template>
    <div>
        <Number label="UserId" v-model="value.userId" :editMode="editMode"/>
        <String label="이름" v-model="value.name" :editMode="editMode"/>
        <Date label="생년월일" v-model="value.birth" :editMode="editMode"/>
        <String label="전화번호" v-model="value.tel" :editMode="editMode"/>
        <String label="관심분야" v-model="value.interest" :editMode="editMode"/>
        <Date label="가능시간" v-model="value.time" :editMode="editMode"/>
        <Email offline label="이메일" v-model="value.email" :editMode="editMode" @change="change"/>
        <Photo offline label="프로필사진" v-model="value.profileImg" :editMode="editMode" @change="change"/>
        <Address offline label="지역정보" v-model="value.location" :editMode="editMode" @change="change"/>

        <v-divider class="border-opacity-100 my-divider"></v-divider>
        <v-layout row justify-end>
            <v-btn
                width="64px"
                color="primary"
                @click="save"
            >
                저장
            </v-btn>
        </v-layout>
    </div>
</template>


<script>

import BaseEntity from './base-ui/BaseEntity.vue'

export default {
    name: 'VolunteerInfo',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "volunteerInfos"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>
