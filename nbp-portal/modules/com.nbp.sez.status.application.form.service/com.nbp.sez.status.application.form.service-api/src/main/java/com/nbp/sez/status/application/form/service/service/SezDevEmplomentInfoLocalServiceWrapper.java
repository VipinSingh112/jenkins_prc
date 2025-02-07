/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezDevEmplomentInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevEmplomentInfoLocalService
 * @generated
 */
public class SezDevEmplomentInfoLocalServiceWrapper
	implements ServiceWrapper<SezDevEmplomentInfoLocalService>,
			   SezDevEmplomentInfoLocalService {

	public SezDevEmplomentInfoLocalServiceWrapper() {
		this(null);
	}

	public SezDevEmplomentInfoLocalServiceWrapper(
		SezDevEmplomentInfoLocalService sezDevEmplomentInfoLocalService) {

		_sezDevEmplomentInfoLocalService = sezDevEmplomentInfoLocalService;
	}

	/**
	 * Adds the sez dev emploment info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevEmplomentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevEmplomentInfo the sez dev emploment info
	 * @return the sez dev emploment info that was added
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezDevEmplomentInfo
		addSezDevEmplomentInfo(
			com.nbp.sez.status.application.form.service.model.
				SezDevEmplomentInfo sezDevEmplomentInfo) {

		return _sezDevEmplomentInfoLocalService.addSezDevEmplomentInfo(
			sezDevEmplomentInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevEmplomentInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez dev emploment info with the primary key. Does not add the sez dev emploment info to the database.
	 *
	 * @param sezDevEmplomentInfoId the primary key for the new sez dev emploment info
	 * @return the new sez dev emploment info
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezDevEmplomentInfo
		createSezDevEmplomentInfo(long sezDevEmplomentInfoId) {

		return _sezDevEmplomentInfoLocalService.createSezDevEmplomentInfo(
			sezDevEmplomentInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevEmplomentInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez dev emploment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevEmplomentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevEmplomentInfoId the primary key of the sez dev emploment info
	 * @return the sez dev emploment info that was removed
	 * @throws PortalException if a sez dev emploment info with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezDevEmplomentInfo
			deleteSezDevEmplomentInfo(long sezDevEmplomentInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevEmplomentInfoLocalService.deleteSezDevEmplomentInfo(
			sezDevEmplomentInfoId);
	}

	/**
	 * Deletes the sez dev emploment info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevEmplomentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevEmplomentInfo the sez dev emploment info
	 * @return the sez dev emploment info that was removed
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezDevEmplomentInfo
		deleteSezDevEmplomentInfo(
			com.nbp.sez.status.application.form.service.model.
				SezDevEmplomentInfo sezDevEmplomentInfo) {

		return _sezDevEmplomentInfoLocalService.deleteSezDevEmplomentInfo(
			sezDevEmplomentInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezDevEmplomentInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezDevEmplomentInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezDevEmplomentInfoLocalService.dynamicQuery();
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

		return _sezDevEmplomentInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevEmplomentInfoModelImpl</code>.
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

		return _sezDevEmplomentInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevEmplomentInfoModelImpl</code>.
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

		return _sezDevEmplomentInfoLocalService.dynamicQuery(
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

		return _sezDevEmplomentInfoLocalService.dynamicQueryCount(dynamicQuery);
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

		return _sezDevEmplomentInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.SezDevEmplomentInfo
		fetchSezDevEmplomentInfo(long sezDevEmplomentInfoId) {

		return _sezDevEmplomentInfoLocalService.fetchSezDevEmplomentInfo(
			sezDevEmplomentInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezDevEmplomentInfoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.SezDevEmplomentInfo
			getgetSezById(long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevEmplomentInfoException {

		return _sezDevEmplomentInfoLocalService.getgetSezById(
			sezStatusApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezDevEmplomentInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDevEmplomentInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevEmplomentInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the sez dev emploment info with the primary key.
	 *
	 * @param sezDevEmplomentInfoId the primary key of the sez dev emploment info
	 * @return the sez dev emploment info
	 * @throws PortalException if a sez dev emploment info with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezDevEmplomentInfo
			getSezDevEmplomentInfo(long sezDevEmplomentInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevEmplomentInfoLocalService.getSezDevEmplomentInfo(
			sezDevEmplomentInfoId);
	}

	/**
	 * Returns a range of all the sez dev emploment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevEmplomentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev emploment infos
	 * @param end the upper bound of the range of sez dev emploment infos (not inclusive)
	 * @return the range of sez dev emploment infos
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.SezDevEmplomentInfo>
			getSezDevEmplomentInfos(int start, int end) {

		return _sezDevEmplomentInfoLocalService.getSezDevEmplomentInfos(
			start, end);
	}

	/**
	 * Returns the number of sez dev emploment infos.
	 *
	 * @return the number of sez dev emploment infos
	 */
	@Override
	public int getSezDevEmplomentInfosCount() {
		return _sezDevEmplomentInfoLocalService.getSezDevEmplomentInfosCount();
	}

	/**
	 * Updates the sez dev emploment info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevEmplomentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevEmplomentInfo the sez dev emploment info
	 * @return the sez dev emploment info that was updated
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezDevEmplomentInfo
		updateSezDevEmplomentInfo(
			com.nbp.sez.status.application.form.service.model.
				SezDevEmplomentInfo sezDevEmplomentInfo) {

		return _sezDevEmplomentInfoLocalService.updateSezDevEmplomentInfo(
			sezDevEmplomentInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezDevEmplomentInfoLocalService.getBasePersistence();
	}

	@Override
	public SezDevEmplomentInfoLocalService getWrappedService() {
		return _sezDevEmplomentInfoLocalService;
	}

	@Override
	public void setWrappedService(
		SezDevEmplomentInfoLocalService sezDevEmplomentInfoLocalService) {

		_sezDevEmplomentInfoLocalService = sezDevEmplomentInfoLocalService;
	}

	private SezDevEmplomentInfoLocalService _sezDevEmplomentInfoLocalService;

}