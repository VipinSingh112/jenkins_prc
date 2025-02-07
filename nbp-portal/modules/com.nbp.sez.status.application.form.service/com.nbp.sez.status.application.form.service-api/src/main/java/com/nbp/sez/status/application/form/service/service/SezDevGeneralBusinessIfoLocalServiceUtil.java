/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezDevGeneralBusinessIfo;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for SezDevGeneralBusinessIfo. This utility wraps
 * <code>com.nbp.sez.status.application.form.service.service.impl.SezDevGeneralBusinessIfoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevGeneralBusinessIfoLocalService
 * @generated
 */
public class SezDevGeneralBusinessIfoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.sez.status.application.form.service.service.impl.SezDevGeneralBusinessIfoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the sez dev general business ifo to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevGeneralBusinessIfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevGeneralBusinessIfo the sez dev general business ifo
	 * @return the sez dev general business ifo that was added
	 */
	public static SezDevGeneralBusinessIfo addSezDevGeneralBusinessIfo(
		SezDevGeneralBusinessIfo sezDevGeneralBusinessIfo) {

		return getService().addSezDevGeneralBusinessIfo(
			sezDevGeneralBusinessIfo);
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
	 * Creates a new sez dev general business ifo with the primary key. Does not add the sez dev general business ifo to the database.
	 *
	 * @param sezDevGeneralBusinessIfoId the primary key for the new sez dev general business ifo
	 * @return the new sez dev general business ifo
	 */
	public static SezDevGeneralBusinessIfo createSezDevGeneralBusinessIfo(
		long sezDevGeneralBusinessIfoId) {

		return getService().createSezDevGeneralBusinessIfo(
			sezDevGeneralBusinessIfoId);
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
	 * Deletes the sez dev general business ifo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevGeneralBusinessIfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevGeneralBusinessIfoId the primary key of the sez dev general business ifo
	 * @return the sez dev general business ifo that was removed
	 * @throws PortalException if a sez dev general business ifo with the primary key could not be found
	 */
	public static SezDevGeneralBusinessIfo deleteSezDevGeneralBusinessIfo(
			long sezDevGeneralBusinessIfoId)
		throws PortalException {

		return getService().deleteSezDevGeneralBusinessIfo(
			sezDevGeneralBusinessIfoId);
	}

	/**
	 * Deletes the sez dev general business ifo from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevGeneralBusinessIfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevGeneralBusinessIfo the sez dev general business ifo
	 * @return the sez dev general business ifo that was removed
	 */
	public static SezDevGeneralBusinessIfo deleteSezDevGeneralBusinessIfo(
		SezDevGeneralBusinessIfo sezDevGeneralBusinessIfo) {

		return getService().deleteSezDevGeneralBusinessIfo(
			sezDevGeneralBusinessIfo);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevGeneralBusinessIfoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevGeneralBusinessIfoModelImpl</code>.
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

	public static SezDevGeneralBusinessIfo fetchSezDevGeneralBusinessIfo(
		long sezDevGeneralBusinessIfoId) {

		return getService().fetchSezDevGeneralBusinessIfo(
			sezDevGeneralBusinessIfoId);
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

	public static SezDevGeneralBusinessIfo getSezById(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevGeneralBusinessIfoException {

		return getService().getSezById(sezStatusApplicationId);
	}

	/**
	 * Returns the sez dev general business ifo with the primary key.
	 *
	 * @param sezDevGeneralBusinessIfoId the primary key of the sez dev general business ifo
	 * @return the sez dev general business ifo
	 * @throws PortalException if a sez dev general business ifo with the primary key could not be found
	 */
	public static SezDevGeneralBusinessIfo getSezDevGeneralBusinessIfo(
			long sezDevGeneralBusinessIfoId)
		throws PortalException {

		return getService().getSezDevGeneralBusinessIfo(
			sezDevGeneralBusinessIfoId);
	}

	/**
	 * Returns a range of all the sez dev general business ifos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevGeneralBusinessIfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev general business ifos
	 * @param end the upper bound of the range of sez dev general business ifos (not inclusive)
	 * @return the range of sez dev general business ifos
	 */
	public static List<SezDevGeneralBusinessIfo> getSezDevGeneralBusinessIfos(
		int start, int end) {

		return getService().getSezDevGeneralBusinessIfos(start, end);
	}

	/**
	 * Returns the number of sez dev general business ifos.
	 *
	 * @return the number of sez dev general business ifos
	 */
	public static int getSezDevGeneralBusinessIfosCount() {
		return getService().getSezDevGeneralBusinessIfosCount();
	}

	/**
	 * Updates the sez dev general business ifo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevGeneralBusinessIfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevGeneralBusinessIfo the sez dev general business ifo
	 * @return the sez dev general business ifo that was updated
	 */
	public static SezDevGeneralBusinessIfo updateSezDevGeneralBusinessIfo(
		SezDevGeneralBusinessIfo sezDevGeneralBusinessIfo) {

		return getService().updateSezDevGeneralBusinessIfo(
			sezDevGeneralBusinessIfo);
	}

	public static SezDevGeneralBusinessIfoLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<SezDevGeneralBusinessIfoLocalService>
		_serviceSnapshot = new Snapshot<>(
			SezDevGeneralBusinessIfoLocalServiceUtil.class,
			SezDevGeneralBusinessIfoLocalService.class);

}