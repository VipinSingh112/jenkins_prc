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

import com.nbp.hsra.application.service.model.BrokerRegistrationInfo;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for BrokerRegistrationInfo. This utility wraps
 * <code>com.nbp.hsra.application.service.service.impl.BrokerRegistrationInfoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see BrokerRegistrationInfoLocalService
 * @generated
 */
public class BrokerRegistrationInfoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.hsra.application.service.service.impl.BrokerRegistrationInfoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the broker registration info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BrokerRegistrationInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param brokerRegistrationInfo the broker registration info
	 * @return the broker registration info that was added
	 */
	public static BrokerRegistrationInfo addBrokerRegistrationInfo(
		BrokerRegistrationInfo brokerRegistrationInfo) {

		return getService().addBrokerRegistrationInfo(brokerRegistrationInfo);
	}

	/**
	 * Creates a new broker registration info with the primary key. Does not add the broker registration info to the database.
	 *
	 * @param brokerRegstInfoId the primary key for the new broker registration info
	 * @return the new broker registration info
	 */
	public static BrokerRegistrationInfo createBrokerRegistrationInfo(
		long brokerRegstInfoId) {

		return getService().createBrokerRegistrationInfo(brokerRegstInfoId);
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
	 * Deletes the broker registration info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BrokerRegistrationInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param brokerRegistrationInfo the broker registration info
	 * @return the broker registration info that was removed
	 */
	public static BrokerRegistrationInfo deleteBrokerRegistrationInfo(
		BrokerRegistrationInfo brokerRegistrationInfo) {

		return getService().deleteBrokerRegistrationInfo(
			brokerRegistrationInfo);
	}

	/**
	 * Deletes the broker registration info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BrokerRegistrationInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param brokerRegstInfoId the primary key of the broker registration info
	 * @return the broker registration info that was removed
	 * @throws PortalException if a broker registration info with the primary key could not be found
	 */
	public static BrokerRegistrationInfo deleteBrokerRegistrationInfo(
			long brokerRegstInfoId)
		throws PortalException {

		return getService().deleteBrokerRegistrationInfo(brokerRegstInfoId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.BrokerRegistrationInfoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.BrokerRegistrationInfoModelImpl</code>.
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

	public static BrokerRegistrationInfo fetchBrokerRegistrationInfo(
		long brokerRegstInfoId) {

		return getService().fetchBrokerRegistrationInfo(brokerRegstInfoId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the broker registration info with the primary key.
	 *
	 * @param brokerRegstInfoId the primary key of the broker registration info
	 * @return the broker registration info
	 * @throws PortalException if a broker registration info with the primary key could not be found
	 */
	public static BrokerRegistrationInfo getBrokerRegistrationInfo(
			long brokerRegstInfoId)
		throws PortalException {

		return getService().getBrokerRegistrationInfo(brokerRegstInfoId);
	}

	/**
	 * Returns a range of all the broker registration infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.BrokerRegistrationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of broker registration infos
	 * @param end the upper bound of the range of broker registration infos (not inclusive)
	 * @return the range of broker registration infos
	 */
	public static List<BrokerRegistrationInfo> getBrokerRegistrationInfos(
		int start, int end) {

		return getService().getBrokerRegistrationInfos(start, end);
	}

	/**
	 * Returns the number of broker registration infos.
	 *
	 * @return the number of broker registration infos
	 */
	public static int getBrokerRegistrationInfosCount() {
		return getService().getBrokerRegistrationInfosCount();
	}

	public static BrokerRegistrationInfo getHsraById(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchBrokerRegistrationInfoException {

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
	 * Updates the broker registration info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BrokerRegistrationInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param brokerRegistrationInfo the broker registration info
	 * @return the broker registration info that was updated
	 */
	public static BrokerRegistrationInfo updateBrokerRegistrationInfo(
		BrokerRegistrationInfo brokerRegistrationInfo) {

		return getService().updateBrokerRegistrationInfo(
			brokerRegistrationInfo);
	}

	public static BrokerRegistrationInfoLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<BrokerRegistrationInfoLocalService>
		_serviceSnapshot = new Snapshot<>(
			BrokerRegistrationInfoLocalServiceUtil.class,
			BrokerRegistrationInfoLocalService.class);

}