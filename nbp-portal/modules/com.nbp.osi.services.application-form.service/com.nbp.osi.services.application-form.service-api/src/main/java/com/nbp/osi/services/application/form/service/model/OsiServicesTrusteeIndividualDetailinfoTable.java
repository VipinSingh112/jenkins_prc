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
 * The table class for the &quot;nbp_osi_services_trus_in_gen&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeIndividualDetailinfo
 * @generated
 */
public class OsiServicesTrusteeIndividualDetailinfoTable
	extends BaseTable<OsiServicesTrusteeIndividualDetailinfoTable> {

	public static final OsiServicesTrusteeIndividualDetailinfoTable INSTANCE =
		new OsiServicesTrusteeIndividualDetailinfoTable();

	public final Column<OsiServicesTrusteeIndividualDetailinfoTable, String>
		uuid = createColumn(
			"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeIndividualDetailinfoTable, Long>
		osTIId = createColumn(
			"osTIId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<OsiServicesTrusteeIndividualDetailinfoTable, Long>
		groupId = createColumn(
			"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeIndividualDetailinfoTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeIndividualDetailinfoTable, Long>
		userId = createColumn(
			"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeIndividualDetailinfoTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeIndividualDetailinfoTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeIndividualDetailinfoTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeIndividualDetailinfoTable, String>
		indiFamilyName = createColumn(
			"indiFamilyName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeIndividualDetailinfoTable, String>
		indiGivenName = createColumn(
			"indiGivenName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeIndividualDetailinfoTable, Date>
		indiDateOfBirth = createColumn(
			"indiDateOfBirth", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeIndividualDetailinfoTable, String>
		indiOtherLegalNames = createColumn(
			"indiOtherLegalNames", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeIndividualDetailinfoTable, String>
		indiBusinessAddress = createColumn(
			"indiBusinessAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeIndividualDetailinfoTable, String>
		indiBusinessTeleNo = createColumn(
			"indiBusinessTeleNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeIndividualDetailinfoTable, String>
		indiBusinessFaxNo = createColumn(
			"indiBusinessFaxNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeIndividualDetailinfoTable, String>
		indiBusinessEmail = createColumn(
			"indiBusinessEmail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeIndividualDetailinfoTable, String>
		indiHomeAddress = createColumn(
			"indiHomeAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeIndividualDetailinfoTable, String>
		indiHomeTeleNo = createColumn(
			"indiHomeTeleNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeIndividualDetailinfoTable, String>
		indiHomeFaxNo = createColumn(
			"indiHomeFaxNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeIndividualDetailinfoTable, String>
		indiHomeEmail = createColumn(
			"indiHomeEmail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeIndividualDetailinfoTable, String>
		indiCurrentEmployer = createColumn(
			"indiCurrentEmployer", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeIndividualDetailinfoTable, Date>
		indiDateOfEmployment = createColumn(
			"indiDateOfEmployment", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeIndividualDetailinfoTable, String>
		indiProfessionalOrg = createColumn(
			"indiProfessionalOrg", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeIndividualDetailinfoTable, Long>
		osiServicesApplicationId = createColumn(
			"osiServicesApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private OsiServicesTrusteeIndividualDetailinfoTable() {
		super(
			"nbp_osi_services_trus_in_gen",
			OsiServicesTrusteeIndividualDetailinfoTable::new);
	}

}