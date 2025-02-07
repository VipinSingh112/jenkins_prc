/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link BrokerRegistrationInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see BrokerRegistrationInfoLocalService
 * @generated
 */
public class BrokerRegistrationInfoLocalServiceWrapper
	implements BrokerRegistrationInfoLocalService,
			   ServiceWrapper<BrokerRegistrationInfoLocalService> {

	public BrokerRegistrationInfoLocalServiceWrapper() {
		this(null);
	}

	public BrokerRegistrationInfoLocalServiceWrapper(
		BrokerRegistrationInfoLocalService brokerRegistrationInfoLocalService) {

		_brokerRegistrationInfoLocalService =
			brokerRegistrationInfoLocalService;
	}

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
	@Override
	public com.nbp.hsra.application.service.model.BrokerRegistrationInfo
		addBrokerRegistrationInfo(
			com.nbp.hsra.application.service.model.BrokerRegistrationInfo
				brokerRegistrationInfo) {

		return _brokerRegistrationInfoLocalService.addBrokerRegistrationInfo(
			brokerRegistrationInfo);
	}

	/**
	 * Creates a new broker registration info with the primary key. Does not add the broker registration info to the database.
	 *
	 * @param brokerRegstInfoId the primary key for the new broker registration info
	 * @return the new broker registration info
	 */
	@Override
	public com.nbp.hsra.application.service.model.BrokerRegistrationInfo
		createBrokerRegistrationInfo(long brokerRegstInfoId) {

		return _brokerRegistrationInfoLocalService.createBrokerRegistrationInfo(
			brokerRegstInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _brokerRegistrationInfoLocalService.createPersistedModel(
			primaryKeyObj);
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
	@Override
	public com.nbp.hsra.application.service.model.BrokerRegistrationInfo
		deleteBrokerRegistrationInfo(
			com.nbp.hsra.application.service.model.BrokerRegistrationInfo
				brokerRegistrationInfo) {

		return _brokerRegistrationInfoLocalService.deleteBrokerRegistrationInfo(
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
	@Override
	public com.nbp.hsra.application.service.model.BrokerRegistrationInfo
			deleteBrokerRegistrationInfo(long brokerRegstInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _brokerRegistrationInfoLocalService.deleteBrokerRegistrationInfo(
			brokerRegstInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _brokerRegistrationInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _brokerRegistrationInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _brokerRegistrationInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _brokerRegistrationInfoLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _brokerRegistrationInfoLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _brokerRegistrationInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _brokerRegistrationInfoLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _brokerRegistrationInfoLocalService.dynamicQueryCount(
			dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _brokerRegistrationInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.BrokerRegistrationInfo
		fetchBrokerRegistrationInfo(long brokerRegstInfoId) {

		return _brokerRegistrationInfoLocalService.fetchBrokerRegistrationInfo(
			brokerRegstInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _brokerRegistrationInfoLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the broker registration info with the primary key.
	 *
	 * @param brokerRegstInfoId the primary key of the broker registration info
	 * @return the broker registration info
	 * @throws PortalException if a broker registration info with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.BrokerRegistrationInfo
			getBrokerRegistrationInfo(long brokerRegstInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _brokerRegistrationInfoLocalService.getBrokerRegistrationInfo(
			brokerRegstInfoId);
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
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.BrokerRegistrationInfo>
			getBrokerRegistrationInfos(int start, int end) {

		return _brokerRegistrationInfoLocalService.getBrokerRegistrationInfos(
			start, end);
	}

	/**
	 * Returns the number of broker registration infos.
	 *
	 * @return the number of broker registration infos
	 */
	@Override
	public int getBrokerRegistrationInfosCount() {
		return _brokerRegistrationInfoLocalService.
			getBrokerRegistrationInfosCount();
	}

	@Override
	public com.nbp.hsra.application.service.model.BrokerRegistrationInfo
			getHsraById(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchBrokerRegistrationInfoException {

		return _brokerRegistrationInfoLocalService.getHsraById(
			hsraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _brokerRegistrationInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _brokerRegistrationInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _brokerRegistrationInfoLocalService.getPersistedModel(
			primaryKeyObj);
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
	@Override
	public com.nbp.hsra.application.service.model.BrokerRegistrationInfo
		updateBrokerRegistrationInfo(
			com.nbp.hsra.application.service.model.BrokerRegistrationInfo
				brokerRegistrationInfo) {

		return _brokerRegistrationInfoLocalService.updateBrokerRegistrationInfo(
			brokerRegistrationInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _brokerRegistrationInfoLocalService.getBasePersistence();
	}

	@Override
	public BrokerRegistrationInfoLocalService getWrappedService() {
		return _brokerRegistrationInfoLocalService;
	}

	@Override
	public void setWrappedService(
		BrokerRegistrationInfoLocalService brokerRegistrationInfoLocalService) {

		_brokerRegistrationInfoLocalService =
			brokerRegistrationInfoLocalService;
	}

	private BrokerRegistrationInfoLocalService
		_brokerRegistrationInfoLocalService;

}