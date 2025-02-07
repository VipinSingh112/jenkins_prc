/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.quary.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_quarry_machines_equip_mi&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see MaterialInformationMachinesAndEquipent
 * @generated
 */
public class MaterialInformationMachinesAndEquipentTable
	extends BaseTable<MaterialInformationMachinesAndEquipentTable> {

	public static final MaterialInformationMachinesAndEquipentTable INSTANCE =
		new MaterialInformationMachinesAndEquipentTable();

	public final Column<MaterialInformationMachinesAndEquipentTable, String>
		uuid = createColumn(
			"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MaterialInformationMachinesAndEquipentTable, Long>
		miMachineId = createColumn(
			"miMachineId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<MaterialInformationMachinesAndEquipentTable, Long>
		groupId = createColumn(
			"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MaterialInformationMachinesAndEquipentTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MaterialInformationMachinesAndEquipentTable, Long>
		userId = createColumn(
			"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MaterialInformationMachinesAndEquipentTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MaterialInformationMachinesAndEquipentTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MaterialInformationMachinesAndEquipentTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MaterialInformationMachinesAndEquipentTable, String>
		manchineName = createColumn(
			"manchineName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MaterialInformationMachinesAndEquipentTable, String>
		isManchineNameChecked = createColumn(
			"isManchineNameChecked", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MaterialInformationMachinesAndEquipentTable, String>
		locatedOnProposedSite = createColumn(
			"locatedOnProposedSite", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MaterialInformationMachinesAndEquipentTable, String>
		quarryApplicationId = createColumn(
			"quarryApplicationId", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private MaterialInformationMachinesAndEquipentTable() {
		super(
			"nbp_quarry_machines_equip_mi",
			MaterialInformationMachinesAndEquipentTable::new);
	}

}