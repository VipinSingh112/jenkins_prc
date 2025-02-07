/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.AccoNonHotelLicence;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AccoNonHotelLicence. This utility wraps
 * <code>com.nbp.jtb.application.form.service.service.impl.AccoNonHotelLicenceLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AccoNonHotelLicenceLocalService
 * @generated
 */
public class AccoNonHotelLicenceLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.jtb.application.form.service.service.impl.AccoNonHotelLicenceLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the acco non hotel licence to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoNonHotelLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoNonHotelLicence the acco non hotel licence
	 * @return the acco non hotel licence that was added
	 */
	public static AccoNonHotelLicence addAccoNonHotelLicence(
		AccoNonHotelLicence accoNonHotelLicence) {

		return getService().addAccoNonHotelLicence(accoNonHotelLicence);
	}

	/**
	 * Creates a new acco non hotel licence with the primary key. Does not add the acco non hotel licence to the database.
	 *
	 * @param accoNonHotelLicenceId the primary key for the new acco non hotel licence
	 * @return the new acco non hotel licence
	 */
	public static AccoNonHotelLicence createAccoNonHotelLicence(
		long accoNonHotelLicenceId) {

		return getService().createAccoNonHotelLicence(accoNonHotelLicenceId);
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
	 * Deletes the acco non hotel licence from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoNonHotelLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoNonHotelLicence the acco non hotel licence
	 * @return the acco non hotel licence that was removed
	 */
	public static AccoNonHotelLicence deleteAccoNonHotelLicence(
		AccoNonHotelLicence accoNonHotelLicence) {

		return getService().deleteAccoNonHotelLicence(accoNonHotelLicence);
	}

	/**
	 * Deletes the acco non hotel licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoNonHotelLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoNonHotelLicenceId the primary key of the acco non hotel licence
	 * @return the acco non hotel licence that was removed
	 * @throws PortalException if a acco non hotel licence with the primary key could not be found
	 */
	public static AccoNonHotelLicence deleteAccoNonHotelLicence(
			long accoNonHotelLicenceId)
		throws PortalException {

		return getService().deleteAccoNonHotelLicence(accoNonHotelLicenceId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoNonHotelLicenceModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoNonHotelLicenceModelImpl</code>.
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

	public static AccoNonHotelLicence fetchAccoNonHotelLicence(
		long accoNonHotelLicenceId) {

		return getService().fetchAccoNonHotelLicence(accoNonHotelLicenceId);
	}

	/**
	 * Returns the acco non hotel licence matching the UUID and group.
	 *
	 * @param uuid the acco non hotel licence's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acco non hotel licence, or <code>null</code> if a matching acco non hotel licence could not be found
	 */
	public static AccoNonHotelLicence fetchAccoNonHotelLicenceByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchAccoNonHotelLicenceByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns the acco non hotel licence with the primary key.
	 *
	 * @param accoNonHotelLicenceId the primary key of the acco non hotel licence
	 * @return the acco non hotel licence
	 * @throws PortalException if a acco non hotel licence with the primary key could not be found
	 */
	public static AccoNonHotelLicence getAccoNonHotelLicence(
			long accoNonHotelLicenceId)
		throws PortalException {

		return getService().getAccoNonHotelLicence(accoNonHotelLicenceId);
	}

	/**
	 * Returns the acco non hotel licence matching the UUID and group.
	 *
	 * @param uuid the acco non hotel licence's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acco non hotel licence
	 * @throws PortalException if a matching acco non hotel licence could not be found
	 */
	public static AccoNonHotelLicence getAccoNonHotelLicenceByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getAccoNonHotelLicenceByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the acco non hotel licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoNonHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco non hotel licences
	 * @param end the upper bound of the range of acco non hotel licences (not inclusive)
	 * @return the range of acco non hotel licences
	 */
	public static List<AccoNonHotelLicence> getAccoNonHotelLicences(
		int start, int end) {

		return getService().getAccoNonHotelLicences(start, end);
	}

	/**
	 * Returns all the acco non hotel licences matching the UUID and company.
	 *
	 * @param uuid the UUID of the acco non hotel licences
	 * @param companyId the primary key of the company
	 * @return the matching acco non hotel licences, or an empty list if no matches were found
	 */
	public static List<AccoNonHotelLicence>
		getAccoNonHotelLicencesByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getAccoNonHotelLicencesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of acco non hotel licences matching the UUID and company.
	 *
	 * @param uuid the UUID of the acco non hotel licences
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acco non hotel licences
	 * @param end the upper bound of the range of acco non hotel licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acco non hotel licences, or an empty list if no matches were found
	 */
	public static List<AccoNonHotelLicence>
		getAccoNonHotelLicencesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<AccoNonHotelLicence> orderByComparator) {

		return getService().getAccoNonHotelLicencesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acco non hotel licences.
	 *
	 * @return the number of acco non hotel licences
	 */
	public static int getAccoNonHotelLicencesCount() {
		return getService().getAccoNonHotelLicencesCount();
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

	public static AccoNonHotelLicence getJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoNonHotelLicenceException {

		return getService().getJTB_ByApplicationId(jtbApplicationId);
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
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the acco non hotel licence in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoNonHotelLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoNonHotelLicence the acco non hotel licence
	 * @return the acco non hotel licence that was updated
	 */
	public static AccoNonHotelLicence updateAccoNonHotelLicence(
		AccoNonHotelLicence accoNonHotelLicence) {

		return getService().updateAccoNonHotelLicence(accoNonHotelLicence);
	}

	public static AccoNonHotelLicenceLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AccoNonHotelLicenceLocalService>
		_serviceSnapshot = new Snapshot<>(
			AccoNonHotelLicenceLocalServiceUtil.class,
			AccoNonHotelLicenceLocalService.class);

}