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

import com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailGen;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for NcbjCompanyDetailGen. This utility wraps
 * <code>com.nbp.ncbj.application.form.service.service.impl.NcbjCompanyDetailGenLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjCompanyDetailGenLocalService
 * @generated
 */
public class NcbjCompanyDetailGenLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.ncbj.application.form.service.service.impl.NcbjCompanyDetailGenLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the ncbj company detail gen to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCompanyDetailGenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCompanyDetailGen the ncbj company detail gen
	 * @return the ncbj company detail gen that was added
	 */
	public static NcbjCompanyDetailGen addNcbjCompanyDetailGen(
		NcbjCompanyDetailGen ncbjCompanyDetailGen) {

		return getService().addNcbjCompanyDetailGen(ncbjCompanyDetailGen);
	}

	/**
	 * Creates a new ncbj company detail gen with the primary key. Does not add the ncbj company detail gen to the database.
	 *
	 * @param ncbjCompanyDetailGenId the primary key for the new ncbj company detail gen
	 * @return the new ncbj company detail gen
	 */
	public static NcbjCompanyDetailGen createNcbjCompanyDetailGen(
		long ncbjCompanyDetailGenId) {

		return getService().createNcbjCompanyDetailGen(ncbjCompanyDetailGenId);
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
	 * Deletes the ncbj company detail gen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCompanyDetailGenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCompanyDetailGenId the primary key of the ncbj company detail gen
	 * @return the ncbj company detail gen that was removed
	 * @throws PortalException if a ncbj company detail gen with the primary key could not be found
	 */
	public static NcbjCompanyDetailGen deleteNcbjCompanyDetailGen(
			long ncbjCompanyDetailGenId)
		throws PortalException {

		return getService().deleteNcbjCompanyDetailGen(ncbjCompanyDetailGenId);
	}

	/**
	 * Deletes the ncbj company detail gen from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCompanyDetailGenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCompanyDetailGen the ncbj company detail gen
	 * @return the ncbj company detail gen that was removed
	 */
	public static NcbjCompanyDetailGen deleteNcbjCompanyDetailGen(
		NcbjCompanyDetailGen ncbjCompanyDetailGen) {

		return getService().deleteNcbjCompanyDetailGen(ncbjCompanyDetailGen);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjCompanyDetailGenModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjCompanyDetailGenModelImpl</code>.
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

	public static NcbjCompanyDetailGen fetchNcbjCompanyDetailGen(
		long ncbjCompanyDetailGenId) {

		return getService().fetchNcbjCompanyDetailGen(ncbjCompanyDetailGenId);
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

	public static NcbjCompanyDetailGen getNCBJByAppId(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjCompanyDetailGenException {

		return getService().getNCBJByAppId(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj company detail gen with the primary key.
	 *
	 * @param ncbjCompanyDetailGenId the primary key of the ncbj company detail gen
	 * @return the ncbj company detail gen
	 * @throws PortalException if a ncbj company detail gen with the primary key could not be found
	 */
	public static NcbjCompanyDetailGen getNcbjCompanyDetailGen(
			long ncbjCompanyDetailGenId)
		throws PortalException {

		return getService().getNcbjCompanyDetailGen(ncbjCompanyDetailGenId);
	}

	/**
	 * Returns a range of all the ncbj company detail gens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjCompanyDetailGenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company detail gens
	 * @param end the upper bound of the range of ncbj company detail gens (not inclusive)
	 * @return the range of ncbj company detail gens
	 */
	public static List<NcbjCompanyDetailGen> getNcbjCompanyDetailGens(
		int start, int end) {

		return getService().getNcbjCompanyDetailGens(start, end);
	}

	/**
	 * Returns the number of ncbj company detail gens.
	 *
	 * @return the number of ncbj company detail gens
	 */
	public static int getNcbjCompanyDetailGensCount() {
		return getService().getNcbjCompanyDetailGensCount();
	}

	public static List<NcbjCompanyDetailGen> getNCBJListByAppId(
		long ncbjApplicationId) {

		return getService().getNCBJListByAppId(ncbjApplicationId);
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
	 * Updates the ncbj company detail gen in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCompanyDetailGenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCompanyDetailGen the ncbj company detail gen
	 * @return the ncbj company detail gen that was updated
	 */
	public static NcbjCompanyDetailGen updateNcbjCompanyDetailGen(
		NcbjCompanyDetailGen ncbjCompanyDetailGen) {

		return getService().updateNcbjCompanyDetailGen(ncbjCompanyDetailGen);
	}

	public static NcbjCompanyDetailGenLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<NcbjCompanyDetailGenLocalService>
		_serviceSnapshot = new Snapshot<>(
			NcbjCompanyDetailGenLocalServiceUtil.class,
			NcbjCompanyDetailGenLocalService.class);

}