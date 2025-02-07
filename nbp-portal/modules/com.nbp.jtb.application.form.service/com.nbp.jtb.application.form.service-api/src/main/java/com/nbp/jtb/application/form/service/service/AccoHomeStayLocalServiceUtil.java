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

import com.nbp.jtb.application.form.service.model.AccoHomeStay;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AccoHomeStay. This utility wraps
 * <code>com.nbp.jtb.application.form.service.service.impl.AccoHomeStayLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AccoHomeStayLocalService
 * @generated
 */
public class AccoHomeStayLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.jtb.application.form.service.service.impl.AccoHomeStayLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the acco home stay to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoHomeStayLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoHomeStay the acco home stay
	 * @return the acco home stay that was added
	 */
	public static AccoHomeStay addAccoHomeStay(AccoHomeStay accoHomeStay) {
		return getService().addAccoHomeStay(accoHomeStay);
	}

	/**
	 * Creates a new acco home stay with the primary key. Does not add the acco home stay to the database.
	 *
	 * @param accoHomeStayId the primary key for the new acco home stay
	 * @return the new acco home stay
	 */
	public static AccoHomeStay createAccoHomeStay(long accoHomeStayId) {
		return getService().createAccoHomeStay(accoHomeStayId);
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
	 * Deletes the acco home stay from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoHomeStayLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoHomeStay the acco home stay
	 * @return the acco home stay that was removed
	 */
	public static AccoHomeStay deleteAccoHomeStay(AccoHomeStay accoHomeStay) {
		return getService().deleteAccoHomeStay(accoHomeStay);
	}

	/**
	 * Deletes the acco home stay with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoHomeStayLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoHomeStayId the primary key of the acco home stay
	 * @return the acco home stay that was removed
	 * @throws PortalException if a acco home stay with the primary key could not be found
	 */
	public static AccoHomeStay deleteAccoHomeStay(long accoHomeStayId)
		throws PortalException {

		return getService().deleteAccoHomeStay(accoHomeStayId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoHomeStayModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoHomeStayModelImpl</code>.
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

	public static AccoHomeStay fetchAccoHomeStay(long accoHomeStayId) {
		return getService().fetchAccoHomeStay(accoHomeStayId);
	}

	/**
	 * Returns the acco home stay matching the UUID and group.
	 *
	 * @param uuid the acco home stay's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acco home stay, or <code>null</code> if a matching acco home stay could not be found
	 */
	public static AccoHomeStay fetchAccoHomeStayByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchAccoHomeStayByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns the acco home stay with the primary key.
	 *
	 * @param accoHomeStayId the primary key of the acco home stay
	 * @return the acco home stay
	 * @throws PortalException if a acco home stay with the primary key could not be found
	 */
	public static AccoHomeStay getAccoHomeStay(long accoHomeStayId)
		throws PortalException {

		return getService().getAccoHomeStay(accoHomeStayId);
	}

	/**
	 * Returns the acco home stay matching the UUID and group.
	 *
	 * @param uuid the acco home stay's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acco home stay
	 * @throws PortalException if a matching acco home stay could not be found
	 */
	public static AccoHomeStay getAccoHomeStayByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getAccoHomeStayByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the acco home stays.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoHomeStayModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco home stays
	 * @param end the upper bound of the range of acco home stays (not inclusive)
	 * @return the range of acco home stays
	 */
	public static List<AccoHomeStay> getAccoHomeStays(int start, int end) {
		return getService().getAccoHomeStays(start, end);
	}

	/**
	 * Returns all the acco home stays matching the UUID and company.
	 *
	 * @param uuid the UUID of the acco home stays
	 * @param companyId the primary key of the company
	 * @return the matching acco home stays, or an empty list if no matches were found
	 */
	public static List<AccoHomeStay> getAccoHomeStaysByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getAccoHomeStaysByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of acco home stays matching the UUID and company.
	 *
	 * @param uuid the UUID of the acco home stays
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acco home stays
	 * @param end the upper bound of the range of acco home stays (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acco home stays, or an empty list if no matches were found
	 */
	public static List<AccoHomeStay> getAccoHomeStaysByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccoHomeStay> orderByComparator) {

		return getService().getAccoHomeStaysByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acco home stays.
	 *
	 * @return the number of acco home stays
	 */
	public static int getAccoHomeStaysCount() {
		return getService().getAccoHomeStaysCount();
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

	public static AccoHomeStay getJTB_ByApplicationId(long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoHomeStayException {

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
	 * Updates the acco home stay in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoHomeStayLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoHomeStay the acco home stay
	 * @return the acco home stay that was updated
	 */
	public static AccoHomeStay updateAccoHomeStay(AccoHomeStay accoHomeStay) {
		return getService().updateAccoHomeStay(accoHomeStay);
	}

	public static AccoHomeStayLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AccoHomeStayLocalService> _serviceSnapshot =
		new Snapshot<>(
			AccoHomeStayLocalServiceUtil.class, AccoHomeStayLocalService.class);

}