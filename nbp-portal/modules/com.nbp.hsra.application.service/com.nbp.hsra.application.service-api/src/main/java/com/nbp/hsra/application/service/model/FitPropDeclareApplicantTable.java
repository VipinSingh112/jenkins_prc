/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_hsra_fitprop_declare&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FitPropDeclareApplicant
 * @generated
 */
public class FitPropDeclareApplicantTable
	extends BaseTable<FitPropDeclareApplicantTable> {

	public static final FitPropDeclareApplicantTable INSTANCE =
		new FitPropDeclareApplicantTable();

	public final Column<FitPropDeclareApplicantTable, Long>
		fitPropDeclareApplicantId = createColumn(
			"fitPropDeclareApplicantId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FitPropDeclareApplicantTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FitPropDeclareApplicantTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FitPropDeclareApplicantTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FitPropDeclareApplicantTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FitPropDeclareApplicantTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FitPropDeclareApplicantTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FitPropDeclareApplicantTable, String> nameApplicant =
		createColumn(
			"nameApplicant", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FitPropDeclareApplicantTable, Date> dateApplicant =
		createColumn(
			"dateApplicant", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FitPropDeclareApplicantTable, Long> hsraApplicationId =
		createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private FitPropDeclareApplicantTable() {
		super("nbp_hsra_fitprop_declare", FitPropDeclareApplicantTable::new);
	}

}