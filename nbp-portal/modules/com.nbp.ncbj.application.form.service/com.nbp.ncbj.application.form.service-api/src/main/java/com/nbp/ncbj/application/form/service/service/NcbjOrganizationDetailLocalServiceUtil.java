/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.application.form.service.model.NcbjOrganizationDetail;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for NcbjOrganizationDetail. This utility wraps
 * <code>com.nbp.ncbj.application.form.service.service.impl.NcbjOrganizationDetailLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjOrganizationDetailLocalService
 * @generated
 */
public class NcbjOrganizationDetailLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.ncbj.application.form.service.service.impl.NcbjOrganizationDetailLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the ncbj organization detail to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjOrganizationDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjOrganizationDetail the ncbj organization detail
	 * @return the ncbj organization detail that was added
	 */
	public static NcbjOrganizationDetail addNcbjOrganizationDetail(
		NcbjOrganizationDetail ncbjOrganizationDetail) {

		return getService().addNcbjOrganizationDetail(ncbjOrganizationDetail);
	}

	/**
	 * Creates a new ncbj organization detail with the primary key. Does not add the ncbj organization detail to the database.
	 *
	 * @param ncbjOrganizationDetailId the primary key for the new ncbj organization detail
	 * @return the new ncbj organization detail
	 */
	public static NcbjOrganizationDetail createNcbjOrganizationDetail(
		long ncbjOrganizationDetailId) {

		return getService().createNcbjOrganizationDetail(
			ncbjOrganizationDetailId);
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
	 * Deletes the ncbj organization detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjOrganizationDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjOrganizationDetailId the primary key of the ncbj organization detail
	 * @return the ncbj organization detail that was removed
	 * @throws PortalException if a ncbj organization detail with the primary key could not be found
	 */
	public static NcbjOrganizationDetail deleteNcbjOrganizationDetail(
			long ncbjOrganizationDetailId)
		throws PortalException {

		return getService().deleteNcbjOrganizationDetail(
			ncbjOrganizationDetailId);
	}

	/**
	 * Deletes the ncbj organization detail from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjOrganizationDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjOrganizationDetail the ncbj organization detail
	 * @return the ncbj organization detail that was removed
	 */
	public static NcbjOrganizationDetail deleteNcbjOrganizationDetail(
		NcbjOrganizationDetail ncbjOrganizationDetail) {

		return getService().deleteNcbjOrganizationDetail(
			ncbjOrganizationDetail);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjOrganizationDetailModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjOrganizationDetailModelImpl</code>.
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

	public static NcbjOrganizationDetail fetchNcbjOrganizationDetail(
		long ncbjOrganizationDetailId) {

		return getService().fetchNcbjOrganizationDetail(
			ncbjOrganizationDetailId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static NcbjOrganizationDetail getNCBJ_ByAppId(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjOrganizationDetailException {

		return getService().getNCBJ_ByAppId(ncbjApplicationId);
	}

	public static NcbjOrganizationDetail getNCBJById(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjOrganizationDetailException {

		return getService().getNCBJById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj organization detail with the primary key.
	 *
	 * @param ncbjOrganizationDetailId the primary key of the ncbj organization detail
	 * @return the ncbj organization detail
	 * @throws PortalException if a ncbj organization detail with the primary key could not be found
	 */
	public static NcbjOrganizationDetail getNcbjOrganizationDetail(
			long ncbjOrganizationDetailId)
		throws PortalException {

		return getService().getNcbjOrganizationDetail(ncbjOrganizationDetailId);
	}

	/**
	 * Returns a range of all the ncbj organization details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjOrganizationDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj organization details
	 * @param end the upper bound of the range of ncbj organization details (not inclusive)
	 * @return the range of ncbj organization details
	 */
	public static List<NcbjOrganizationDetail> getNcbjOrganizationDetails(
		int start, int end) {

		return getService().getNcbjOrganizationDetails(start, end);
	}

	/**
	 * Returns the number of ncbj organization details.
	 *
	 * @return the number of ncbj organization details
	 */
	public static int getNcbjOrganizationDetailsCount() {
		return getService().getNcbjOrganizationDetailsCount();
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
	 * Updates the ncbj organization detail in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjOrganizationDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjOrganizationDetail the ncbj organization detail
	 * @return the ncbj organization detail that was updated
	 */
	public static NcbjOrganizationDetail updateNcbjOrganizationDetail(
		NcbjOrganizationDetail ncbjOrganizationDetail) {

		return getService().updateNcbjOrganizationDetail(
			ncbjOrganizationDetail);
	}

	public static NcbjOrganizationDetailLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<NcbjOrganizationDetailLocalService>
		_serviceSnapshot = new Snapshot<>(
			NcbjOrganizationDetailLocalServiceUtil.class,
			NcbjOrganizationDetailLocalService.class);

}