/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.services.application.form.service.model.OsiServicesGeneralBenefitOfCreditorsinfo;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for OsiServicesGeneralBenefitOfCreditorsinfo. This utility wraps
 * <code>com.nbp.osi.services.application.form.service.service.impl.OsiServicesGeneralBenefitOfCreditorsinfoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesGeneralBenefitOfCreditorsinfoLocalService
 * @generated
 */
public class OsiServicesGeneralBenefitOfCreditorsinfoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.services.application.form.service.service.impl.OsiServicesGeneralBenefitOfCreditorsinfoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the osi services general benefit of creditorsinfo to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesGeneralBenefitOfCreditorsinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesGeneralBenefitOfCreditorsinfo the osi services general benefit of creditorsinfo
	 * @return the osi services general benefit of creditorsinfo that was added
	 */
	public static OsiServicesGeneralBenefitOfCreditorsinfo
		addOsiServicesGeneralBenefitOfCreditorsinfo(
			OsiServicesGeneralBenefitOfCreditorsinfo
				osiServicesGeneralBenefitOfCreditorsinfo) {

		return getService().addOsiServicesGeneralBenefitOfCreditorsinfo(
			osiServicesGeneralBenefitOfCreditorsinfo);
	}

	/**
	 * Creates a new osi services general benefit of creditorsinfo with the primary key. Does not add the osi services general benefit of creditorsinfo to the database.
	 *
	 * @param osiBOCInsoId the primary key for the new osi services general benefit of creditorsinfo
	 * @return the new osi services general benefit of creditorsinfo
	 */
	public static OsiServicesGeneralBenefitOfCreditorsinfo
		createOsiServicesGeneralBenefitOfCreditorsinfo(long osiBOCInsoId) {

		return getService().createOsiServicesGeneralBenefitOfCreditorsinfo(
			osiBOCInsoId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the osi services general benefit of creditorsinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesGeneralBenefitOfCreditorsinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiBOCInsoId the primary key of the osi services general benefit of creditorsinfo
	 * @return the osi services general benefit of creditorsinfo that was removed
	 * @throws PortalException if a osi services general benefit of creditorsinfo with the primary key could not be found
	 */
	public static OsiServicesGeneralBenefitOfCreditorsinfo
			deleteOsiServicesGeneralBenefitOfCreditorsinfo(long osiBOCInsoId)
		throws PortalException {

		return getService().deleteOsiServicesGeneralBenefitOfCreditorsinfo(
			osiBOCInsoId);
	}

	/**
	 * Deletes the osi services general benefit of creditorsinfo from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesGeneralBenefitOfCreditorsinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesGeneralBenefitOfCreditorsinfo the osi services general benefit of creditorsinfo
	 * @return the osi services general benefit of creditorsinfo that was removed
	 */
	public static OsiServicesGeneralBenefitOfCreditorsinfo
		deleteOsiServicesGeneralBenefitOfCreditorsinfo(
			OsiServicesGeneralBenefitOfCreditorsinfo
				osiServicesGeneralBenefitOfCreditorsinfo) {

		return getService().deleteOsiServicesGeneralBenefitOfCreditorsinfo(
			osiServicesGeneralBenefitOfCreditorsinfo);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesGeneralBenefitOfCreditorsinfoModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesGeneralBenefitOfCreditorsinfoModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static OsiServicesGeneralBenefitOfCreditorsinfo
		fetchOsiServicesGeneralBenefitOfCreditorsinfo(long osiBOCInsoId) {

		return getService().fetchOsiServicesGeneralBenefitOfCreditorsinfo(
			osiBOCInsoId);
	}

	/**
	 * Returns the osi services general benefit of creditorsinfo matching the UUID and group.
	 *
	 * @param uuid the osi services general benefit of creditorsinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services general benefit of creditorsinfo, or <code>null</code> if a matching osi services general benefit of creditorsinfo could not be found
	 */
	public static OsiServicesGeneralBenefitOfCreditorsinfo
		fetchOsiServicesGeneralBenefitOfCreditorsinfoByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().
			fetchOsiServicesGeneralBenefitOfCreditorsinfoByUuidAndGroupId(
				uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * Returns the osi services general benefit of creditorsinfo with the primary key.
	 *
	 * @param osiBOCInsoId the primary key of the osi services general benefit of creditorsinfo
	 * @return the osi services general benefit of creditorsinfo
	 * @throws PortalException if a osi services general benefit of creditorsinfo with the primary key could not be found
	 */
	public static OsiServicesGeneralBenefitOfCreditorsinfo
			getOsiServicesGeneralBenefitOfCreditorsinfo(long osiBOCInsoId)
		throws PortalException {

		return getService().getOsiServicesGeneralBenefitOfCreditorsinfo(
			osiBOCInsoId);
	}

	public static OsiServicesGeneralBenefitOfCreditorsinfo
			getOsiServicesGeneralBenefitOfCreditorsinfoById(
				long osiServicesApplicationId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException {

		return getService().getOsiServicesGeneralBenefitOfCreditorsinfoById(
			osiServicesApplicationId);
	}

	/**
	 * Returns the osi services general benefit of creditorsinfo matching the UUID and group.
	 *
	 * @param uuid the osi services general benefit of creditorsinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services general benefit of creditorsinfo
	 * @throws PortalException if a matching osi services general benefit of creditorsinfo could not be found
	 */
	public static OsiServicesGeneralBenefitOfCreditorsinfo
			getOsiServicesGeneralBenefitOfCreditorsinfoByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().
			getOsiServicesGeneralBenefitOfCreditorsinfoByUuidAndGroupId(
				uuid, groupId);
	}

	/**
	 * Returns a range of all the osi services general benefit of creditorsinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesGeneralBenefitOfCreditorsinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services general benefit of creditorsinfos
	 * @param end the upper bound of the range of osi services general benefit of creditorsinfos (not inclusive)
	 * @return the range of osi services general benefit of creditorsinfos
	 */
	public static List<OsiServicesGeneralBenefitOfCreditorsinfo>
		getOsiServicesGeneralBenefitOfCreditorsinfos(int start, int end) {

		return getService().getOsiServicesGeneralBenefitOfCreditorsinfos(
			start, end);
	}

	/**
	 * Returns all the osi services general benefit of creditorsinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services general benefit of creditorsinfos
	 * @param companyId the primary key of the company
	 * @return the matching osi services general benefit of creditorsinfos, or an empty list if no matches were found
	 */
	public static List<OsiServicesGeneralBenefitOfCreditorsinfo>
		getOsiServicesGeneralBenefitOfCreditorsinfosByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().
			getOsiServicesGeneralBenefitOfCreditorsinfosByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of osi services general benefit of creditorsinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services general benefit of creditorsinfos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of osi services general benefit of creditorsinfos
	 * @param end the upper bound of the range of osi services general benefit of creditorsinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching osi services general benefit of creditorsinfos, or an empty list if no matches were found
	 */
	public static List<OsiServicesGeneralBenefitOfCreditorsinfo>
		getOsiServicesGeneralBenefitOfCreditorsinfosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<OsiServicesGeneralBenefitOfCreditorsinfo>
				orderByComparator) {

		return getService().
			getOsiServicesGeneralBenefitOfCreditorsinfosByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of osi services general benefit of creditorsinfos.
	 *
	 * @return the number of osi services general benefit of creditorsinfos
	 */
	public static int getOsiServicesGeneralBenefitOfCreditorsinfosCount() {
		return getService().getOsiServicesGeneralBenefitOfCreditorsinfosCount();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the osi services general benefit of creditorsinfo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesGeneralBenefitOfCreditorsinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesGeneralBenefitOfCreditorsinfo the osi services general benefit of creditorsinfo
	 * @return the osi services general benefit of creditorsinfo that was updated
	 */
	public static OsiServicesGeneralBenefitOfCreditorsinfo
		updateOsiServicesGeneralBenefitOfCreditorsinfo(
			OsiServicesGeneralBenefitOfCreditorsinfo
				osiServicesGeneralBenefitOfCreditorsinfo) {

		return getService().updateOsiServicesGeneralBenefitOfCreditorsinfo(
			osiServicesGeneralBenefitOfCreditorsinfo);
	}

	public static OsiServicesGeneralBenefitOfCreditorsinfoLocalService
		getService() {

		return _serviceSnapshot.get();
	}

	private static final Snapshot
		<OsiServicesGeneralBenefitOfCreditorsinfoLocalService>
			_serviceSnapshot = new Snapshot<>(
				OsiServicesGeneralBenefitOfCreditorsinfoLocalServiceUtil.class,
				OsiServicesGeneralBenefitOfCreditorsinfoLocalService.class);

}