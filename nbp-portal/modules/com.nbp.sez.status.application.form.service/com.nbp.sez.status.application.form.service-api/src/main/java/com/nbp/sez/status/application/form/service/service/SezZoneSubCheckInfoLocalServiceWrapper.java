/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezZoneSubCheckInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneSubCheckInfoLocalService
 * @generated
 */
public class SezZoneSubCheckInfoLocalServiceWrapper
	implements ServiceWrapper<SezZoneSubCheckInfoLocalService>,
			   SezZoneSubCheckInfoLocalService {

	public SezZoneSubCheckInfoLocalServiceWrapper() {
		this(null);
	}

	public SezZoneSubCheckInfoLocalServiceWrapper(
		SezZoneSubCheckInfoLocalService sezZoneSubCheckInfoLocalService) {

		_sezZoneSubCheckInfoLocalService = sezZoneSubCheckInfoLocalService;
	}

	/**
	 * Adds the sez zone sub check info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneSubCheckInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneSubCheckInfo the sez zone sub check info
	 * @return the sez zone sub check info that was added
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneSubCheckInfo
		addSezZoneSubCheckInfo(
			com.nbp.sez.status.application.form.service.model.
				SezZoneSubCheckInfo sezZoneSubCheckInfo) {

		return _sezZoneSubCheckInfoLocalService.addSezZoneSubCheckInfo(
			sezZoneSubCheckInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneSubCheckInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez zone sub check info with the primary key. Does not add the sez zone sub check info to the database.
	 *
	 * @param sezZoneSubCheckInfoId the primary key for the new sez zone sub check info
	 * @return the new sez zone sub check info
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneSubCheckInfo
		createSezZoneSubCheckInfo(long sezZoneSubCheckInfoId) {

		return _sezZoneSubCheckInfoLocalService.createSezZoneSubCheckInfo(
			sezZoneSubCheckInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneSubCheckInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez zone sub check info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneSubCheckInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneSubCheckInfoId the primary key of the sez zone sub check info
	 * @return the sez zone sub check info that was removed
	 * @throws PortalException if a sez zone sub check info with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneSubCheckInfo
			deleteSezZoneSubCheckInfo(long sezZoneSubCheckInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneSubCheckInfoLocalService.deleteSezZoneSubCheckInfo(
			sezZoneSubCheckInfoId);
	}

	/**
	 * Deletes the sez zone sub check info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneSubCheckInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneSubCheckInfo the sez zone sub check info
	 * @return the sez zone sub check info that was removed
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneSubCheckInfo
		deleteSezZoneSubCheckInfo(
			com.nbp.sez.status.application.form.service.model.
				SezZoneSubCheckInfo sezZoneSubCheckInfo) {

		return _sezZoneSubCheckInfoLocalService.deleteSezZoneSubCheckInfo(
			sezZoneSubCheckInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezZoneSubCheckInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezZoneSubCheckInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezZoneSubCheckInfoLocalService.dynamicQuery();
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

		return _sezZoneSubCheckInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneSubCheckInfoModelImpl</code>.
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

		return _sezZoneSubCheckInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneSubCheckInfoModelImpl</code>.
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

		return _sezZoneSubCheckInfoLocalService.dynamicQuery(
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

		return _sezZoneSubCheckInfoLocalService.dynamicQueryCount(dynamicQuery);
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

		return _sezZoneSubCheckInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneSubCheckInfo
		fetchSezZoneSubCheckInfo(long sezZoneSubCheckInfoId) {

		return _sezZoneSubCheckInfoLocalService.fetchSezZoneSubCheckInfo(
			sezZoneSubCheckInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezZoneSubCheckInfoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezZoneSubCheckInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezZoneSubCheckInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneSubCheckInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneSubCheckInfo
			getSezById(long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneSubCheckInfoException {

		return _sezZoneSubCheckInfoLocalService.getSezById(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez zone sub check info with the primary key.
	 *
	 * @param sezZoneSubCheckInfoId the primary key of the sez zone sub check info
	 * @return the sez zone sub check info
	 * @throws PortalException if a sez zone sub check info with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneSubCheckInfo
			getSezZoneSubCheckInfo(long sezZoneSubCheckInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneSubCheckInfoLocalService.getSezZoneSubCheckInfo(
			sezZoneSubCheckInfoId);
	}

	/**
	 * Returns a range of all the sez zone sub check infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneSubCheckInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone sub check infos
	 * @param end the upper bound of the range of sez zone sub check infos (not inclusive)
	 * @return the range of sez zone sub check infos
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.SezZoneSubCheckInfo>
			getSezZoneSubCheckInfos(int start, int end) {

		return _sezZoneSubCheckInfoLocalService.getSezZoneSubCheckInfos(
			start, end);
	}

	/**
	 * Returns the number of sez zone sub check infos.
	 *
	 * @return the number of sez zone sub check infos
	 */
	@Override
	public int getSezZoneSubCheckInfosCount() {
		return _sezZoneSubCheckInfoLocalService.getSezZoneSubCheckInfosCount();
	}

	/**
	 * Updates the sez zone sub check info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneSubCheckInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneSubCheckInfo the sez zone sub check info
	 * @return the sez zone sub check info that was updated
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneSubCheckInfo
		updateSezZoneSubCheckInfo(
			com.nbp.sez.status.application.form.service.model.
				SezZoneSubCheckInfo sezZoneSubCheckInfo) {

		return _sezZoneSubCheckInfoLocalService.updateSezZoneSubCheckInfo(
			sezZoneSubCheckInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezZoneSubCheckInfoLocalService.getBasePersistence();
	}

	@Override
	public SezZoneSubCheckInfoLocalService getWrappedService() {
		return _sezZoneSubCheckInfoLocalService;
	}

	@Override
	public void setWrappedService(
		SezZoneSubCheckInfoLocalService sezZoneSubCheckInfoLocalService) {

		_sezZoneSubCheckInfoLocalService = sezZoneSubCheckInfoLocalService;
	}

	private SezZoneSubCheckInfoLocalService _sezZoneSubCheckInfoLocalService;

}