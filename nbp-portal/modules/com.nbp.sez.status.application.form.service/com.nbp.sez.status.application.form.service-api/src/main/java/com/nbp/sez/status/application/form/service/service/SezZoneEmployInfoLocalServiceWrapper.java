/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezZoneEmployInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneEmployInfoLocalService
 * @generated
 */
public class SezZoneEmployInfoLocalServiceWrapper
	implements ServiceWrapper<SezZoneEmployInfoLocalService>,
			   SezZoneEmployInfoLocalService {

	public SezZoneEmployInfoLocalServiceWrapper() {
		this(null);
	}

	public SezZoneEmployInfoLocalServiceWrapper(
		SezZoneEmployInfoLocalService sezZoneEmployInfoLocalService) {

		_sezZoneEmployInfoLocalService = sezZoneEmployInfoLocalService;
	}

	/**
	 * Adds the sez zone employ info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneEmployInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneEmployInfo the sez zone employ info
	 * @return the sez zone employ info that was added
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneEmployInfo
		addSezZoneEmployInfo(
			com.nbp.sez.status.application.form.service.model.SezZoneEmployInfo
				sezZoneEmployInfo) {

		return _sezZoneEmployInfoLocalService.addSezZoneEmployInfo(
			sezZoneEmployInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneEmployInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez zone employ info with the primary key. Does not add the sez zone employ info to the database.
	 *
	 * @param sezZoneEmpInfoId the primary key for the new sez zone employ info
	 * @return the new sez zone employ info
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneEmployInfo
		createSezZoneEmployInfo(long sezZoneEmpInfoId) {

		return _sezZoneEmployInfoLocalService.createSezZoneEmployInfo(
			sezZoneEmpInfoId);
	}

	@Override
	public void deleteBygetSezStatusByAppId(long sezStatusApplicationId) {
		_sezZoneEmployInfoLocalService.deleteBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneEmployInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez zone employ info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneEmployInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneEmpInfoId the primary key of the sez zone employ info
	 * @return the sez zone employ info that was removed
	 * @throws PortalException if a sez zone employ info with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneEmployInfo
			deleteSezZoneEmployInfo(long sezZoneEmpInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneEmployInfoLocalService.deleteSezZoneEmployInfo(
			sezZoneEmpInfoId);
	}

	/**
	 * Deletes the sez zone employ info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneEmployInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneEmployInfo the sez zone employ info
	 * @return the sez zone employ info that was removed
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneEmployInfo
		deleteSezZoneEmployInfo(
			com.nbp.sez.status.application.form.service.model.SezZoneEmployInfo
				sezZoneEmployInfo) {

		return _sezZoneEmployInfoLocalService.deleteSezZoneEmployInfo(
			sezZoneEmployInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezZoneEmployInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezZoneEmployInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezZoneEmployInfoLocalService.dynamicQuery();
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

		return _sezZoneEmployInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneEmployInfoModelImpl</code>.
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

		return _sezZoneEmployInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneEmployInfoModelImpl</code>.
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

		return _sezZoneEmployInfoLocalService.dynamicQuery(
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

		return _sezZoneEmployInfoLocalService.dynamicQueryCount(dynamicQuery);
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

		return _sezZoneEmployInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneEmployInfo
		fetchSezZoneEmployInfo(long sezZoneEmpInfoId) {

		return _sezZoneEmployInfoLocalService.fetchSezZoneEmployInfo(
			sezZoneEmpInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezZoneEmployInfoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezZoneEmployInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezZoneEmployInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneEmployInfoLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.SezZoneEmployInfo>
			getSezById(long sezStatusApplicationId) {

		return _sezZoneEmployInfoLocalService.getSezById(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez zone employ info with the primary key.
	 *
	 * @param sezZoneEmpInfoId the primary key of the sez zone employ info
	 * @return the sez zone employ info
	 * @throws PortalException if a sez zone employ info with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneEmployInfo
			getSezZoneEmployInfo(long sezZoneEmpInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneEmployInfoLocalService.getSezZoneEmployInfo(
			sezZoneEmpInfoId);
	}

	/**
	 * Returns a range of all the sez zone employ infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneEmployInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone employ infos
	 * @param end the upper bound of the range of sez zone employ infos (not inclusive)
	 * @return the range of sez zone employ infos
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.SezZoneEmployInfo>
			getSezZoneEmployInfos(int start, int end) {

		return _sezZoneEmployInfoLocalService.getSezZoneEmployInfos(start, end);
	}

	/**
	 * Returns the number of sez zone employ infos.
	 *
	 * @return the number of sez zone employ infos
	 */
	@Override
	public int getSezZoneEmployInfosCount() {
		return _sezZoneEmployInfoLocalService.getSezZoneEmployInfosCount();
	}

	/**
	 * Updates the sez zone employ info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneEmployInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneEmployInfo the sez zone employ info
	 * @return the sez zone employ info that was updated
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneEmployInfo
		updateSezZoneEmployInfo(
			com.nbp.sez.status.application.form.service.model.SezZoneEmployInfo
				sezZoneEmployInfo) {

		return _sezZoneEmployInfoLocalService.updateSezZoneEmployInfo(
			sezZoneEmployInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezZoneEmployInfoLocalService.getBasePersistence();
	}

	@Override
	public SezZoneEmployInfoLocalService getWrappedService() {
		return _sezZoneEmployInfoLocalService;
	}

	@Override
	public void setWrappedService(
		SezZoneEmployInfoLocalService sezZoneEmployInfoLocalService) {

		_sezZoneEmployInfoLocalService = sezZoneEmployInfoLocalService;
	}

	private SezZoneEmployInfoLocalService _sezZoneEmployInfoLocalService;

}