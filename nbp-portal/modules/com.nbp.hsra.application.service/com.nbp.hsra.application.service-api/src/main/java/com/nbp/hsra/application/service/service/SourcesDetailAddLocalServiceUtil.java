/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.SourcesDetailAdd;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for SourcesDetailAdd. This utility wraps
 * <code>com.nbp.hsra.application.service.service.impl.SourcesDetailAddLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SourcesDetailAddLocalService
 * @generated
 */
public class SourcesDetailAddLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.hsra.application.service.service.impl.SourcesDetailAddLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the sources detail add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SourcesDetailAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sourcesDetailAdd the sources detail add
	 * @return the sources detail add that was added
	 */
	public static SourcesDetailAdd addSourcesDetailAdd(
		SourcesDetailAdd sourcesDetailAdd) {

		return getService().addSourcesDetailAdd(sourcesDetailAdd);
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
	 * Creates a new sources detail add with the primary key. Does not add the sources detail add to the database.
	 *
	 * @param sourcesDetailAddId the primary key for the new sources detail add
	 * @return the new sources detail add
	 */
	public static SourcesDetailAdd createSourcesDetailAdd(
		long sourcesDetailAddId) {

		return getService().createSourcesDetailAdd(sourcesDetailAddId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the sources detail add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SourcesDetailAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sourcesDetailAddId the primary key of the sources detail add
	 * @return the sources detail add that was removed
	 * @throws PortalException if a sources detail add with the primary key could not be found
	 */
	public static SourcesDetailAdd deleteSourcesDetailAdd(
			long sourcesDetailAddId)
		throws PortalException {

		return getService().deleteSourcesDetailAdd(sourcesDetailAddId);
	}

	/**
	 * Deletes the sources detail add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SourcesDetailAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sourcesDetailAdd the sources detail add
	 * @return the sources detail add that was removed
	 */
	public static SourcesDetailAdd deleteSourcesDetailAdd(
		SourcesDetailAdd sourcesDetailAdd) {

		return getService().deleteSourcesDetailAdd(sourcesDetailAdd);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.SourcesDetailAddModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.SourcesDetailAddModelImpl</code>.
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

	public static SourcesDetailAdd fetchSourcesDetailAdd(
		long sourcesDetailAddId) {

		return getService().fetchSourcesDetailAdd(sourcesDetailAddId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<SourcesDetailAdd> getHsraById(long hsraApplicationId) {
		return getService().getHsraById(hsraApplicationId);
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
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the sources detail add with the primary key.
	 *
	 * @param sourcesDetailAddId the primary key of the sources detail add
	 * @return the sources detail add
	 * @throws PortalException if a sources detail add with the primary key could not be found
	 */
	public static SourcesDetailAdd getSourcesDetailAdd(long sourcesDetailAddId)
		throws PortalException {

		return getService().getSourcesDetailAdd(sourcesDetailAddId);
	}

	/**
	 * Returns a range of all the sources detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.SourcesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sources detail adds
	 * @param end the upper bound of the range of sources detail adds (not inclusive)
	 * @return the range of sources detail adds
	 */
	public static List<SourcesDetailAdd> getSourcesDetailAdds(
		int start, int end) {

		return getService().getSourcesDetailAdds(start, end);
	}

	/**
	 * Returns the number of sources detail adds.
	 *
	 * @return the number of sources detail adds
	 */
	public static int getSourcesDetailAddsCount() {
		return getService().getSourcesDetailAddsCount();
	}

	/**
	 * Updates the sources detail add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SourcesDetailAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sourcesDetailAdd the sources detail add
	 * @return the sources detail add that was updated
	 */
	public static SourcesDetailAdd updateSourcesDetailAdd(
		SourcesDetailAdd sourcesDetailAdd) {

		return getService().updateSourcesDetailAdd(sourcesDetailAdd);
	}

	public static SourcesDetailAddLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<SourcesDetailAddLocalService>
		_serviceSnapshot = new Snapshot<>(
			SourcesDetailAddLocalServiceUtil.class,
			SourcesDetailAddLocalService.class);

}