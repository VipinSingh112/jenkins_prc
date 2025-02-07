/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezZoneUserUnderInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneUserUnderInfoLocalService
 * @generated
 */
public class SezZoneUserUnderInfoLocalServiceWrapper
	implements ServiceWrapper<SezZoneUserUnderInfoLocalService>,
			   SezZoneUserUnderInfoLocalService {

	public SezZoneUserUnderInfoLocalServiceWrapper() {
		this(null);
	}

	public SezZoneUserUnderInfoLocalServiceWrapper(
		SezZoneUserUnderInfoLocalService sezZoneUserUnderInfoLocalService) {

		_sezZoneUserUnderInfoLocalService = sezZoneUserUnderInfoLocalService;
	}

	/**
	 * Adds the sez zone user under info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneUserUnderInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneUserUnderInfo the sez zone user under info
	 * @return the sez zone user under info that was added
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezZoneUserUnderInfo
			addSezZoneUserUnderInfo(
				com.nbp.sez.status.application.form.service.model.
					SezZoneUserUnderInfo sezZoneUserUnderInfo) {

		return _sezZoneUserUnderInfoLocalService.addSezZoneUserUnderInfo(
			sezZoneUserUnderInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneUserUnderInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez zone user under info with the primary key. Does not add the sez zone user under info to the database.
	 *
	 * @param sezZoneUserUnderInfoId the primary key for the new sez zone user under info
	 * @return the new sez zone user under info
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezZoneUserUnderInfo
			createSezZoneUserUnderInfo(long sezZoneUserUnderInfoId) {

		return _sezZoneUserUnderInfoLocalService.createSezZoneUserUnderInfo(
			sezZoneUserUnderInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneUserUnderInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez zone user under info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneUserUnderInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneUserUnderInfoId the primary key of the sez zone user under info
	 * @return the sez zone user under info that was removed
	 * @throws PortalException if a sez zone user under info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezZoneUserUnderInfo
				deleteSezZoneUserUnderInfo(long sezZoneUserUnderInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneUserUnderInfoLocalService.deleteSezZoneUserUnderInfo(
			sezZoneUserUnderInfoId);
	}

	/**
	 * Deletes the sez zone user under info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneUserUnderInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneUserUnderInfo the sez zone user under info
	 * @return the sez zone user under info that was removed
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezZoneUserUnderInfo
			deleteSezZoneUserUnderInfo(
				com.nbp.sez.status.application.form.service.model.
					SezZoneUserUnderInfo sezZoneUserUnderInfo) {

		return _sezZoneUserUnderInfoLocalService.deleteSezZoneUserUnderInfo(
			sezZoneUserUnderInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezZoneUserUnderInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezZoneUserUnderInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezZoneUserUnderInfoLocalService.dynamicQuery();
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

		return _sezZoneUserUnderInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneUserUnderInfoModelImpl</code>.
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

		return _sezZoneUserUnderInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneUserUnderInfoModelImpl</code>.
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

		return _sezZoneUserUnderInfoLocalService.dynamicQuery(
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

		return _sezZoneUserUnderInfoLocalService.dynamicQueryCount(
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

		return _sezZoneUserUnderInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezZoneUserUnderInfo
			fetchSezZoneUserUnderInfo(long sezZoneUserUnderInfoId) {

		return _sezZoneUserUnderInfoLocalService.fetchSezZoneUserUnderInfo(
			sezZoneUserUnderInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezZoneUserUnderInfoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezZoneUserUnderInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezZoneUserUnderInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneUserUnderInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezZoneUserUnderInfo
				getSezById(long sezStatusApplicationId)
			throws com.nbp.sez.status.application.form.service.exception.
				NoSuchSezZoneUserUnderInfoException {

		return _sezZoneUserUnderInfoLocalService.getSezById(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez zone user under info with the primary key.
	 *
	 * @param sezZoneUserUnderInfoId the primary key of the sez zone user under info
	 * @return the sez zone user under info
	 * @throws PortalException if a sez zone user under info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezZoneUserUnderInfo
				getSezZoneUserUnderInfo(long sezZoneUserUnderInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneUserUnderInfoLocalService.getSezZoneUserUnderInfo(
			sezZoneUserUnderInfoId);
	}

	/**
	 * Returns a range of all the sez zone user under infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneUserUnderInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone user under infos
	 * @param end the upper bound of the range of sez zone user under infos (not inclusive)
	 * @return the range of sez zone user under infos
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.SezZoneUserUnderInfo>
			getSezZoneUserUnderInfos(int start, int end) {

		return _sezZoneUserUnderInfoLocalService.getSezZoneUserUnderInfos(
			start, end);
	}

	/**
	 * Returns the number of sez zone user under infos.
	 *
	 * @return the number of sez zone user under infos
	 */
	@Override
	public int getSezZoneUserUnderInfosCount() {
		return _sezZoneUserUnderInfoLocalService.
			getSezZoneUserUnderInfosCount();
	}

	/**
	 * Updates the sez zone user under info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneUserUnderInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneUserUnderInfo the sez zone user under info
	 * @return the sez zone user under info that was updated
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezZoneUserUnderInfo
			updateSezZoneUserUnderInfo(
				com.nbp.sez.status.application.form.service.model.
					SezZoneUserUnderInfo sezZoneUserUnderInfo) {

		return _sezZoneUserUnderInfoLocalService.updateSezZoneUserUnderInfo(
			sezZoneUserUnderInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezZoneUserUnderInfoLocalService.getBasePersistence();
	}

	@Override
	public SezZoneUserUnderInfoLocalService getWrappedService() {
		return _sezZoneUserUnderInfoLocalService;
	}

	@Override
	public void setWrappedService(
		SezZoneUserUnderInfoLocalService sezZoneUserUnderInfoLocalService) {

		_sezZoneUserUnderInfoLocalService = sezZoneUserUnderInfoLocalService;
	}

	private SezZoneUserUnderInfoLocalService _sezZoneUserUnderInfoLocalService;

}