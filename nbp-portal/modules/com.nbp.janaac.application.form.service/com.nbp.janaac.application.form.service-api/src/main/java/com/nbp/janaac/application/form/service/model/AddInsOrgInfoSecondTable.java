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
 * The table class for the &quot;nbp_janaac_add_ins_org_sec&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AddInsOrgInfoSecond
 * @generated
 */
public class AddInsOrgInfoSecondTable
	extends BaseTable<AddInsOrgInfoSecondTable> {

	public static final AddInsOrgInfoSecondTable INSTANCE =
		new AddInsOrgInfoSecondTable();

	public final Column<AddInsOrgInfoSecondTable, Long> addInsOrgInfoSecondId =
		createColumn(
			"addInsOrgInfoSecondId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AddInsOrgInfoSecondTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddInsOrgInfoSecondTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddInsOrgInfoSecondTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddInsOrgInfoSecondTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddInsOrgInfoSecondTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddInsOrgInfoSecondTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddInsOrgInfoSecondTable, String> nameOfStaff =
		createColumn(
			"nameOfStaff", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddInsOrgInfoSecondTable, String> jobTitle =
		createColumn(
			"jobTitle", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddInsOrgInfoSecondTable, String>
		majorResponsibilities = createColumn(
			"majorResponsibilities", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddInsOrgInfoSecondTable, String> indexInspector =
		createColumn(
			"indexInspector", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddInsOrgInfoSecondTable, Long> janaacApplicationId =
		createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<AddInsOrgInfoSecondTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AddInsOrgInfoSecondTable() {
		super("nbp_janaac_add_ins_org_sec", AddInsOrgInfoSecondTable::new);
	}

}