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

import com.nbp.jtb.application.form.service.model.AccoNonHotelGenDec;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AccoNonHotelGenDec. This utility wraps
 * <code>com.nbp.jtb.application.form.service.service.impl.AccoNonHotelGenDecLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AccoNonHotelGenDecLocalService
 * @generated
 */
public class AccoNonHotelGenDecLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.jtb.application.form.service.service.impl.AccoNonHotelGenDecLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the acco non hotel gen dec to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoNonHotelGenDecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoNonHotelGenDec the acco non hotel gen dec
	 * @return the acco non hotel gen dec that was added
	 */
	public static AccoNonHotelGenDec addAccoNonHotelGenDec(
		AccoNonHotelGenDec accoNonHotelGenDec) {

		return getService().addAccoNonHotelGenDec(accoNonHotelGenDec);
	}

	/**
	 * Creates a new acco non hotel gen dec with the primary key. Does not add the acco non hotel gen dec to the database.
	 *
	 * @param accoNonHotelGenDecId the primary key for the new acco non hotel gen dec
	 * @return the new acco non hotel gen dec
	 */
	public static AccoNonHotelGenDec createAccoNonHotelGenDec(
		long accoNonHotelGenDecId) {

		return getService().createAccoNonHotelGenDec(accoNonHotelGenDecId);
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
	 * Deletes the acco non hotel gen dec from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoNonHotelGenDecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoNonHotelGenDec the acco non hotel gen dec
	 * @return the acco non hotel gen dec that was removed
	 */
	public static AccoNonHotelGenDec deleteAccoNonHotelGenDec(
		AccoNonHotelGenDec accoNonHotelGenDec) {

		return getService().deleteAccoNonHotelGenDec(accoNonHotelGenDec);
	}

	/**
	 * Deletes the acco non hotel gen dec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoNonHotelGenDecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoNonHotelGenDecId the primary key of the acco non hotel gen dec
	 * @return the acco non hotel gen dec that was removed
	 * @throws PortalException if a acco non hotel gen dec with the primary key could not be found
	 */
	public static AccoNonHotelGenDec deleteAccoNonHotelGenDec(
			long accoNonHotelGenDecId)
		throws PortalException {

		return getService().deleteAccoNonHotelGenDec(accoNonHotelGenDecId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoNonHotelGenDecModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoNonHotelGenDecModelImpl</code>.
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

	public static AccoNonHotelGenDec fetchAccoNonHotelGenDec(
		long accoNonHotelGenDecId) {

		return getService().fetchAccoNonHotelGenDec(accoNonHotelGenDecId);
	}

	/**
	 * Returns the acco non hotel gen dec matching the UUID and group.
	 *
	 * @param uuid the acco non hotel gen dec's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acco non hotel gen dec, or <code>null</code> if a matching acco non hotel gen dec could not be found
	 */
	public static AccoNonHotelGenDec fetchAccoNonHotelGenDecByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchAccoNonHotelGenDecByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns the acco non hotel gen dec with the primary key.
	 *
	 * @param accoNonHotelGenDecId the primary key of the acco non hotel gen dec
	 * @return the acco non hotel gen dec
	 * @throws PortalException if a acco non hotel gen dec with the primary key could not be found
	 */
	public static AccoNonHotelGenDec getAccoNonHotelGenDec(
			long accoNonHotelGenDecId)
		throws PortalException {

		return getService().getAccoNonHotelGenDec(accoNonHotelGenDecId);
	}

	/**
	 * Returns the acco non hotel gen dec matching the UUID and group.
	 *
	 * @param uuid the acco non hotel gen dec's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acco non hotel gen dec
	 * @throws PortalException if a matching acco non hotel gen dec could not be found
	 */
	public static AccoNonHotelGenDec getAccoNonHotelGenDecByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getAccoNonHotelGenDecByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the acco non hotel gen decs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoNonHotelGenDecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco non hotel gen decs
	 * @param end the upper bound of the range of acco non hotel gen decs (not inclusive)
	 * @return the range of acco non hotel gen decs
	 */
	public static List<AccoNonHotelGenDec> getAccoNonHotelGenDecs(
		int start, int end) {

		return getService().getAccoNonHotelGenDecs(start, end);
	}

	/**
	 * Returns all the acco non hotel gen decs matching the UUID and company.
	 *
	 * @param uuid the UUID of the acco non hotel gen decs
	 * @param companyId the primary key of the company
	 * @return the matching acco non hotel gen decs, or an empty list if no matches were found
	 */
	public static List<AccoNonHotelGenDec>
		getAccoNonHotelGenDecsByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getAccoNonHotelGenDecsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of acco non hotel gen decs matching the UUID and company.
	 *
	 * @param uuid the UUID of the acco non hotel gen decs
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acco non hotel gen decs
	 * @param end the upper bound of the range of acco non hotel gen decs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acco non hotel gen decs, or an empty list if no matches were found
	 */
	public static List<AccoNonHotelGenDec>
		getAccoNonHotelGenDecsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<AccoNonHotelGenDec> orderByComparator) {

		return getService().getAccoNonHotelGenDecsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acco non hotel gen decs.
	 *
	 * @return the number of acco non hotel gen decs
	 */
	public static int getAccoNonHotelGenDecsCount() {
		return getService().getAccoNonHotelGenDecsCount();
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

	public static AccoNonHotelGenDec getJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoNonHotelGenDecException {

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
	 * Updates the acco non hotel gen dec in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoNonHotelGenDecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoNonHotelGenDec the acco non hotel gen dec
	 * @return the acco non hotel gen dec that was updated
	 */
	public static AccoNonHotelGenDec updateAccoNonHotelGenDec(
		AccoNonHotelGenDec accoNonHotelGenDec) {

		return getService().updateAccoNonHotelGenDec(accoNonHotelGenDec);
	}

	public static AccoNonHotelGenDecLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AccoNonHotelGenDecLocalService>
		_serviceSnapshot = new Snapshot<>(
			AccoNonHotelGenDecLocalServiceUtil.class,
			AccoNonHotelGenDecLocalService.class);

}