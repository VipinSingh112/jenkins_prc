/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NotifiLegalInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NotifiLegalInfoLocalService
 * @generated
 */
public class NotifiLegalInfoLocalServiceWrapper
	implements NotifiLegalInfoLocalService,
			   ServiceWrapper<NotifiLegalInfoLocalService> {

	public NotifiLegalInfoLocalServiceWrapper() {
		this(null);
	}

	public NotifiLegalInfoLocalServiceWrapper(
		NotifiLegalInfoLocalService notifiLegalInfoLocalService) {

		_notifiLegalInfoLocalService = notifiLegalInfoLocalService;
	}

	/**
	 * Adds the notifi legal info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NotifiLegalInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param notifiLegalInfo the notifi legal info
	 * @return the notifi legal info that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.NotifiLegalInfo
		addNotifiLegalInfo(
			com.nbp.hsra.application.service.model.NotifiLegalInfo
				notifiLegalInfo) {

		return _notifiLegalInfoLocalService.addNotifiLegalInfo(notifiLegalInfo);
	}

	/**
	 * Creates a new notifi legal info with the primary key. Does not add the notifi legal info to the database.
	 *
	 * @param notifiLegalInfoId the primary key for the new notifi legal info
	 * @return the new notifi legal info
	 */
	@Override
	public com.nbp.hsra.application.service.model.NotifiLegalInfo
		createNotifiLegalInfo(long notifiLegalInfoId) {

		return _notifiLegalInfoLocalService.createNotifiLegalInfo(
			notifiLegalInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _notifiLegalInfoLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the notifi legal info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NotifiLegalInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param notifiLegalInfoId the primary key of the notifi legal info
	 * @return the notifi legal info that was removed
	 * @throws PortalException if a notifi legal info with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.NotifiLegalInfo
			deleteNotifiLegalInfo(long notifiLegalInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _notifiLegalInfoLocalService.deleteNotifiLegalInfo(
			notifiLegalInfoId);
	}

	/**
	 * Deletes the notifi legal info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NotifiLegalInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param notifiLegalInfo the notifi legal info
	 * @return the notifi legal info that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.NotifiLegalInfo
		deleteNotifiLegalInfo(
			com.nbp.hsra.application.service.model.NotifiLegalInfo
				notifiLegalInfo) {

		return _notifiLegalInfoLocalService.deleteNotifiLegalInfo(
			notifiLegalInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _notifiLegalInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _notifiLegalInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _notifiLegalInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _notifiLegalInfoLocalService.dynamicQuery();
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

		return _notifiLegalInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.NotifiLegalInfoModelImpl</code>.
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

		return _notifiLegalInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.NotifiLegalInfoModelImpl</code>.
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

		return _notifiLegalInfoLocalService.dynamicQuery(
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

		return _notifiLegalInfoLocalService.dynamicQueryCount(dynamicQuery);
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

		return _notifiLegalInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.NotifiLegalInfo
		fetchNotifiLegalInfo(long notifiLegalInfoId) {

		return _notifiLegalInfoLocalService.fetchNotifiLegalInfo(
			notifiLegalInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _notifiLegalInfoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.nbp.hsra.application.service.model.NotifiLegalInfo getHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchNotifiLegalInfoException {

		return _notifiLegalInfoLocalService.getHsraById(hsraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _notifiLegalInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the notifi legal info with the primary key.
	 *
	 * @param notifiLegalInfoId the primary key of the notifi legal info
	 * @return the notifi legal info
	 * @throws PortalException if a notifi legal info with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.NotifiLegalInfo
			getNotifiLegalInfo(long notifiLegalInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _notifiLegalInfoLocalService.getNotifiLegalInfo(
			notifiLegalInfoId);
	}

	/**
	 * Returns a range of all the notifi legal infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.NotifiLegalInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of notifi legal infos
	 * @param end the upper bound of the range of notifi legal infos (not inclusive)
	 * @return the range of notifi legal infos
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.NotifiLegalInfo>
			getNotifiLegalInfos(int start, int end) {

		return _notifiLegalInfoLocalService.getNotifiLegalInfos(start, end);
	}

	/**
	 * Returns the number of notifi legal infos.
	 *
	 * @return the number of notifi legal infos
	 */
	@Override
	public int getNotifiLegalInfosCount() {
		return _notifiLegalInfoLocalService.getNotifiLegalInfosCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _notifiLegalInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _notifiLegalInfoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the notifi legal info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NotifiLegalInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param notifiLegalInfo the notifi legal info
	 * @return the notifi legal info that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.NotifiLegalInfo
		updateNotifiLegalInfo(
			com.nbp.hsra.application.service.model.NotifiLegalInfo
				notifiLegalInfo) {

		return _notifiLegalInfoLocalService.updateNotifiLegalInfo(
			notifiLegalInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _notifiLegalInfoLocalService.getBasePersistence();
	}

	@Override
	public NotifiLegalInfoLocalService getWrappedService() {
		return _notifiLegalInfoLocalService;
	}

	@Override
	public void setWrappedService(
		NotifiLegalInfoLocalService notifiLegalInfoLocalService) {

		_notifiLegalInfoLocalService = notifiLegalInfoLocalService;
	}

	private NotifiLegalInfoLocalService _notifiLegalInfoLocalService;

}