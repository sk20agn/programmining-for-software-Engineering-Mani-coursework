package com.HAMLET;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MemberTest {

    @Test
    void getId() {

        Member member = new Member();
        String id = "myId1";
        member.setId(id);

        assertTrue(id == member.getId());

    }

    @Test
    void setId() {
        Member member = new Member();
        String id = "myId1";
        member.setId(id);

        assertEquals(id,member.getId());
    }

    @Test
    void getFullName() {
        Member member = new Member();
        String name = "RANA";
        member.setFullName(name);

        assertTrue(name == member.getFullName());
    }

    @Test
    void setFullName() {
        Member member = new Member();
        String name = "R";
        member.setFullName(name);

        assertEquals(name,member.getFullName());
    }

    @Test
    void getAddress() {
        Member member = new Member();
        String address = "Norway";
        member.setAddress(address);
        assertTrue(address == member.getAddress());
    }

    @Test
    void setAddress() {
        Member member = new Member();
        String address = "Norway";
        member.setAddress(address);

        assertEquals(address,member.getAddress());
    }

    @Test
    void getTelephoneNumber() {
        Member member = new Member();
        String phone = "+92310000";
        member.setTelephoneNumber(phone);

        assertTrue(phone == member.getTelephoneNumber());

    }

    @Test
    void setTelephoneNumber() {
        Member member = new Member();
        String phone = "+92310000";
        member.setTelephoneNumber(phone);

        assertEquals(phone,member.getTelephoneNumber());
    }
}