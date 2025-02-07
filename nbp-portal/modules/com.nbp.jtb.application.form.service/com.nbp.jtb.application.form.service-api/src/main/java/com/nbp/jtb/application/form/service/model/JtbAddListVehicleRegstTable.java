/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_jtb_list_value_regst&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see JtbAddListVehicleRegst
 * @generated
 */
public class JtbAddListVehicleRegstTable
	extends BaseTable<JtbAddListVehicleRegstTable> {

	public static final JtbAddListVehicleRegstTable INSTANCE =
		new JtbAddListVehicleRegstTable();

	public final Column<JtbAddListVehicleRegstTable, Long>
		jtbAddListVehicleRegstId = createColumn(
			"jtbAddListVehicleRegstId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<JtbAddListVehicleRegstTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JtbAddListVehicleRegstTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JtbAddListVehicleRegstTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JtbAddListVehicleRegstTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JtbAddListVehicleRegstTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JtbAddListVehicleRegstTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JtbAddListVehicleRegstTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JtbAddListVehicleRegstTable, String> vehicleRegstYear =
		createColumn(
			"vehicleRegstYear", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JtbAddListVehicleRegstTable, String> vehicleRegstModel =
		createColumn(
			"vehicleRegstModel", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JtbAddListVehicleRegstTable, String> vehicleRegstPlate =
		createColumn(
			"vehicleRegstPlate", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JtbAddListVehicleRegstTable, Date> vehicleRegstExpDate =
		createColumn(
			"vehicleRegstExpDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<JtbAddListVehicleRegstTable, Date>
		vehicleRegstFitnessDate = createColumn(
			"vehicleRegstFitnessDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<JtbAddListVehicleRegstTable, String>
		vehicleRegstChassis = createColumn(
			"vehicleRegstChassis", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JtbAddListVehicleRegstTable, String> vehicleRegstBased =
		createColumn(
			"vehicleRegstBased", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JtbAddListVehicleRegstTable, String>
		vehicleRegstInsuranceCom = createColumn(
			"vehicleRegstInsuranceCom", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JtbAddListVehicleRegstTable, String>
		vehicleRegstPolicyNum = createColumn(
			"vehicleRegstPolicyNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JtbAddListVehicleRegstTable, Date>
		vehicleRegstExpiryDate = createColumn(
			"vehicleRegstExpiryDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<JtbAddListVehicleRegstTable, String>
		vehicleRegstPlateNum = createColumn(
			"vehicleRegstPlateNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JtbAddListVehicleRegstTable, Long> jtbApplicationId =
		createColumn(
			"jtbApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private JtbAddListVehicleRegstTable() {
		super("nbp_jtb_list_value_regst", JtbAddListVehicleRegstTable::new);
	}

}