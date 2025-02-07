/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_osi_services_trus_in_qual&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeIndividualQualificationinfo
 * @generated
 */
public class OsiServicesTrusteeIndividualQualificationinfoTable
	extends BaseTable<OsiServicesTrusteeIndividualQualificationinfoTable> {

	public static final OsiServicesTrusteeIndividualQualificationinfoTable
		INSTANCE = new OsiServicesTrusteeIndividualQualificationinfoTable();

	public final Column
		<OsiServicesTrusteeIndividualQualificationinfoTable, String> uuid =
			createColumn(
				"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column
		<OsiServicesTrusteeIndividualQualificationinfoTable, Long>
			osQualificationId = createColumn(
				"osQualificationId", Long.class, Types.BIGINT,
				Column.FLAG_PRIMARY);
	public final Column
		<OsiServicesTrusteeIndividualQualificationinfoTable, Long> groupId =
			createColumn(
				"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column
		<OsiServicesTrusteeIndividualQualificationinfoTable, Long> companyId =
			createColumn(
				"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column
		<OsiServicesTrusteeIndividualQualificationinfoTable, Long> userId =
			createColumn(
				"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column
		<OsiServicesTrusteeIndividualQualificationinfoTable, String> userName =
			createColumn(
				"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column
		<OsiServicesTrusteeIndividualQualificationinfoTable, Date> createDate =
			createColumn(
				"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column
		<OsiServicesTrusteeIndividualQualificationinfoTable, Date>
			modifiedDate = createColumn(
				"modifiedDate", Date.class, Types.TIMESTAMP,
				Column.FLAG_DEFAULT);
	public final Column
		<OsiServicesTrusteeIndividualQualificationinfoTable, String> orgMember =
			createColumn(
				"orgMember", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column
		<OsiServicesTrusteeIndividualQualificationinfoTable, Long>
			osiServicesApplicationId = createColumn(
				"osiServicesApplicationId", Long.class, Types.BIGINT,
				Column.FLAG_DEFAULT);

	private OsiServicesTrusteeIndividualQualificationinfoTable() {
		super(
			"nbp_osi_services_trus_in_qual",
			OsiServicesTrusteeIndividualQualificationinfoTable::new);
	}

}