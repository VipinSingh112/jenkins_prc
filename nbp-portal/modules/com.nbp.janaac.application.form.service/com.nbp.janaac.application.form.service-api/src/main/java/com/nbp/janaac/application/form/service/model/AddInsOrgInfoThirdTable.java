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
 * The table class for the &quot;nbp_janaac_add_ins_org_third&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AddInsOrgInfoThird
 * @generated
 */
public class AddInsOrgInfoThirdTable
	extends BaseTable<AddInsOrgInfoThirdTable> {

	public static final AddInsOrgInfoThirdTable INSTANCE =
		new AddInsOrgInfoThirdTable();

	public final Column<AddInsOrgInfoThirdTable, Long> AddInsOrgInfoThirdId =
		createColumn(
			"AddInsOrgInfoThirdId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AddInsOrgInfoThirdTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddInsOrgInfoThirdTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddInsOrgInfoThirdTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddInsOrgInfoThirdTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddInsOrgInfoThirdTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddInsOrgInfoThirdTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddInsOrgInfoThirdTable, String> inspectionActivity =
		createColumn(
			"inspectionActivity", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddInsOrgInfoThirdTable, String> fieldOfInspection =
		createColumn(
			"fieldOfInspection", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddInsOrgInfoThirdTable, String> typeOfInspection =
		createColumn(
			"typeOfInspection", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddInsOrgInfoThirdTable, String> method = createColumn(
		"method", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddInsOrgInfoThirdTable, String> eqipment =
		createColumn(
			"eqipment", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddInsOrgInfoThirdTable, String> limitsOfCapabilities =
		createColumn(
			"limitsOfCapabilities", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddInsOrgInfoThirdTable, Long> janaacApplicationId =
		createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<AddInsOrgInfoThirdTable, String> counter = createColumn(
		"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AddInsOrgInfoThirdTable() {
		super("nbp_janaac_add_ins_org_third", AddInsOrgInfoThirdTable::new);
	}

}