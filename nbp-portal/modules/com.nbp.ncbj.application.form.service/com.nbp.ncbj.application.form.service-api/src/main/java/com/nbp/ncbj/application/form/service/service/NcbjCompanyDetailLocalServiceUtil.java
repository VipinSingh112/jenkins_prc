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

import com.nbp.ncbj.application.form.service.model.NcbjCompanyDetail;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for NcbjCompanyDetail. This utility wraps
 * <code>com.nbp.ncbj.application.form.service.service.impl.NcbjCompanyDetailLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjCompanyDetailLocalService
 * @generated
 */
public class NcbjCompanyDetailLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.ncbj.application.form.service.service.impl.NcbjCompanyDetailLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the ncbj company detail to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCompanyDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCompanyDetail the ncbj company detail
	 * @return the ncbj company detail that was added
	 */
	public static NcbjCompanyDetail addNcbjCompanyDetail(
		NcbjCompanyDetail ncbjCompanyDetail) {

		return getService().addNcbjCompanyDetail(ncbjCompanyDetail);
	}

	/**
	 * Creates a new ncbj company detail with the primary key. Does not add the ncbj company detail to the database.
	 *
	 * @param ncbjCompanyDetailId the primary key for the new ncbj company detail
	 * @return the new ncbj company detail
	 */
	public static NcbjCompanyDetail createNcbjCompanyDetail(
		long ncbjCompanyDetailId) {

		return getService().createNcbjCompanyDetail(ncbjCompanyDetailId);
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
	 * Deletes the ncbj company detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCompanyDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCompanyDetailId the primary key of the ncbj company detail
	 * @return the ncbj company detail that was removed
	 * @throws PortalException if a ncbj company detail with the primary key could not be found
	 */
	public static NcbjCompanyDetail deleteNcbjCompanyDetail(
			long ncbjCompanyDetailId)
		throws PortalException {

		return getService().deleteNcbjCompanyDetail(ncbjCompanyDetailId);
	}

	/**
	 * Deletes the ncbj company detail from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCompanyDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCompanyDetail the ncbj company detail
	 * @return the ncbj company detail that was removed
	 */
	public static NcbjCompanyDetail deleteNcbjCompanyDetail(
		NcbjCompanyDetail ncbjCompanyDetail) {

		return getService().deleteNcbjCompanyDetail(ncbjCompanyDetail);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjCompanyDetailModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjCompanyDetailModelImpl</code>.
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

	public static NcbjCompanyDetail fetchNcbjCompanyDetail(
		long ncbjCompanyDetailId) {

		return getService().fetchNcbjCompanyDetail(ncbjCompanyDetailId);
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

	public static NcbjCompanyDetail getNCBJById(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjCompanyDetailException {

		return getService().getNCBJById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj company detail with the primary key.
	 *
	 * @param ncbjCompanyDetailId the primary key of the ncbj company detail
	 * @return the ncbj company detail
	 * @throws PortalException if a ncbj company detail with the primary key could not be found
	 */
	public static NcbjCompanyDetail getNcbjCompanyDetail(
			long ncbjCompanyDetailId)
		throws PortalException {

		return getService().getNcbjCompanyDetail(ncbjCompanyDetailId);
	}

	/**
	 * Returns a range of all the ncbj company details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjCompanyDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company details
	 * @param end the upper bound of the range of ncbj company details (not inclusive)
	 * @return the range of ncbj company details
	 */
	public static List<NcbjCompanyDetail> getNcbjCompanyDetails(
		int start, int end) {

		return getService().getNcbjCompanyDetails(start, end);
	}

	/**
	 * Returns the number of ncbj company details.
	 *
	 * @return the number of ncbj company details
	 */
	public static int getNcbjCompanyDetailsCount() {
		return getService().getNcbjCompanyDetailsCount();
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
	 * Updates the ncbj company detail in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCompanyDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCompanyDetail the ncbj company detail
	 * @return the ncbj company detail that was updated
	 */
	public static NcbjCompanyDetail updateNcbjCompanyDetail(
		NcbjCompanyDetail ncbjCompanyDetail) {

		return getService().updateNcbjCompanyDetail(ncbjCompanyDetail);
	}

	public static NcbjCompanyDetailLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<NcbjCompanyDetailLocalService>
		_serviceSnapshot = new Snapshot<>(
			NcbjCompanyDetailLocalServiceUtil.class,
			NcbjCompanyDetailLocalService.class);

}