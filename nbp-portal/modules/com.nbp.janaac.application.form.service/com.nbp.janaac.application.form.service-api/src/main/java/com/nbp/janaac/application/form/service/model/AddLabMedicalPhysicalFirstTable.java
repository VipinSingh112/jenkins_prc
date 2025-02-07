/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_janaac_add_medi_phy_first&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabMedicalPhysicalFirst
 * @generated
 */
public class AddLabMedicalPhysicalFirstTable
	extends BaseTable<AddLabMedicalPhysicalFirstTable> {

	public static final AddLabMedicalPhysicalFirstTable INSTANCE =
		new AddLabMedicalPhysicalFirstTable();

	public final Column<AddLabMedicalPhysicalFirstTable, Long>
		addLabMedicalPhysicalFirstId = createColumn(
			"addLabMedicalPhysicalFirstId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AddLabMedicalPhysicalFirstTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalPhysicalFirstTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalPhysicalFirstTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalPhysicalFirstTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalPhysicalFirstTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalPhysicalFirstTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalPhysicalFirstTable, String> inventoryNum =
		createColumn(
			"inventoryNum", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalPhysicalFirstTable, String> item =
		createColumn("item", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalPhysicalFirstTable, String> manufacturer =
		createColumn(
			"manufacturer", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalPhysicalFirstTable, String> modelNum =
		createColumn(
			"modelNum", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalPhysicalFirstTable, String>
		calibrationInterval = createColumn(
			"calibrationInterval", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalPhysicalFirstTable, String> calibratedBy =
		createColumn(
			"calibratedBy", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalPhysicalFirstTable, Long>
		janaacApplicationId = createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalPhysicalFirstTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AddLabMedicalPhysicalFirstTable() {
		super(
			"nbp_janaac_add_medi_phy_first",
			AddLabMedicalPhysicalFirstTable::new);
	}

}