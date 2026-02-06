package com.ktdsuniversity.edu.fp.basic.stream.advanced;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import com.ktdsuniversity.edu.fp.basic.stream.advanced.util.ArrayUtil;
import com.ktdsuniversity.edu.fp.basic.stream.advanced.util.StringUtil;

public class City {
	private int id; // 0
	private String name; // 1
	private int stateId; // 2
	private String stateCode;// 3
	private String stateName;//4
	private int countryId;//5
	private String countryCode;//6
	private String countryName;//7
	private String latitude;//8
	private String longitude;//9
	private String _native; //10 자바에서 사용하는 시스템예약어
	private String type;//11
	private int level;//12
	private int parentId;//13
	private int population;//14
	private String timezone;//15
	private String wikiDataId;//16
	
	public static List<City> loadCityData(){
		String path = "C:\\Users\\User\\Downloads\\java-stream-countries-states-cities-database-master\\java-stream-countries-states-cities-database-master\\csv\\cities.csv";
			try{
				return Files.lines(new File(path).toPath())
						.skip(1)//Stream<String>
						.parallel() //병렬 처리로 시작
						.map(City::new)//Stream<City>
						.toList();//List<City>
			}
		catch(IOException e){
			return null;
		}
	}
	
	public City(String cityLineString) {
		//CSV: Comma Separate Value
		String[] values = cityLineString.split(",");
		
		this.id = StringUtil.toInt(ArrayUtil.getValue(values, 0));
		this.name = ArrayUtil.getValue(values, 1);
		this.stateId = StringUtil.toInt(ArrayUtil.getValue(values, 2));
		this.stateCode = ArrayUtil.getValue(values, 3);
		this.stateName = ArrayUtil.getValue(values, 4);
		this.countryId = StringUtil.toInt(ArrayUtil.getValue(values, 5));
		this.countryCode = ArrayUtil.getValue(values, 6);
		this.countryName = ArrayUtil.getValue(values, 7);
		this.latitude = ArrayUtil.getValue(values, 8);
		this.longitude = ArrayUtil.getValue(values, 9);
		this._native = ArrayUtil.getValue(values, 10);
		this.type = ArrayUtil.getValue(values, 11);
		this.level = StringUtil.toInt(ArrayUtil.getValue(values, 12));
		this.parentId = StringUtil.toInt(ArrayUtil.getValue(values, 13));
		this.population = StringUtil.toInt(ArrayUtil.getValue(values, 14));
		this.timezone = ArrayUtil.getValue(values, 15);
		this.wikiDataId = ArrayUtil.getValue(values, 16);
		
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String get_native() {
		return _native;
	}
	public void set_native(String _native) {
		this._native = _native;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public String getWikiDataId() {
		return wikiDataId;
	}
	public void setWikiDataId(String wikiDataId) {
		this.wikiDataId = wikiDataId;
	}
}
