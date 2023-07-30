package com.basic.single_table_strategy.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.basic.singleTable.entity.FourWheeler;
import com.basic.singleTable.entity.TwoWheeler;
import com.basic.singleTable.entity.Vehicle;

public class TestSingleTableStrategy {

	public static void main(String[] args) {
		
		Vehicle v = new Vehicle("Car");
		
		TwoWheeler tw = new TwoWheeler();
		tw.setName("Yamah");
		tw.setSteeringTwoWheeler("Yamah Handle");
		tw.setstand("Single Side");
		
		FourWheeler fw =new FourWheeler();
		fw.setName("Suzuki");
		fw.setsteeringFourWheelerr("Suzuki Sport steering");
		fw.setViper("Bosch");
		
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction txn = session.beginTransaction();
		
		session.save(v);
		session.save(tw);
		session.save(fw);	 

		txn.commit();
		
		System.out.println("Data saved to DB successfulluy..!!");
		session.close();
		
		
	}

}
