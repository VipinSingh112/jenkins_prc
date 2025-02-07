/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezZoneProposedProjectInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneProposedProjectInfoLocalService
 * @generated
 */
public class SezZoneProposedProjectInfoLocalServiceWrapper
	implements ServiceWrapper<SezZoneProposedProjectInfoLocalService>,
			   SezZoneProposedProjectInfoLocalService {

	public SezZoneProposedProjectInfoLocalServiceWrapper() {
		this(null);
	}

	public SezZoneProposedProjectInfoLocalServiceWrapper(
		SezZoneProposedProjectInfoLocalService
			sezZoneProposedProjectInfoLocalService) {

		_sezZoneProposedProjectInfoLocalService =
			sezZoneProposedProjectInfoLocalService;
	}

	/**
	 * Adds the sez zone proposed project info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneProposedProjectInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneProposedProjectInfo the sez zone proposed project info
	 * @return the sez zone proposed project info that was added
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezZoneProposedProjectInfo addSezZoneProposedProjectInfo(
				com.nbp.sez.status.application.form.service.model.
					SezZoneProposedProjectInfo sezZoneProposedProjectInfo) {

		return _sezZoneProposedProjectInfoLocalService.
			addSezZoneProposedProjectInfo(sezZoneProposedProjectInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneProposedProjectInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez zone proposed project info with the primary key. Does not add the sez zone proposed project info to the database.
	 *
	 * @param sezZoneProposedProjectInfoId the primary key for the new sez zone proposed project info
	 * @return the new sez zone proposed project info
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezZoneProposedProjectInfo createSezZoneProposedProjectInfo(
				long sezZoneProposedProjectInfoId) {

		return _sezZoneProposedProjectInfoLocalService.
			createSezZoneProposedProjectInfo(sezZoneProposedProjectInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneProposedProjectInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez zone proposed project info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneProposedProjectInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneProposedProjectInfoId the primary key of the sez zone proposed project info
	 * @return the sez zone proposed project info that was removed
	 * @throws PortalException if a sez zone proposed project info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezZoneProposedProjectInfo deleteSezZoneProposedProjectInfo(
					long sezZoneProposedProjectInfoId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneProposedProjectInfoLocalService.
			deleteSezZoneProposedProjectInfo(sezZoneProposedProjectInfoId);
	}

	/**
	 * Deletes the sez zone proposed project info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneProposedProjectInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneProposedProjectInfo the sez zone proposed project info
	 * @return the sez zone proposed project info that was removed
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezZoneProposedProjectInfo deleteSezZoneProposedProjectInfo(
				com.nbp.sez.status.application.form.service.model.
					SezZoneProposedProjectInfo sezZoneProposedProjectInfo) {

		return _sezZoneProposedProjectInfoLocalService.
			deleteSezZoneProposedProjectInfo(sezZoneProposedProjectInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezZoneProposedProjectInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezZoneProposedProjectInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezZoneProposedProjectInfoLocalService.dynamicQuery();
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

		return _sezZoneProposedProjectInfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneProposedProjectInfoModelImpl</code>.
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

		return _sezZoneProposedProjectInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneProposedProjectInfoModelImpl</code>.
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

		return _sezZoneProposedProjectInfoLocalService.dynamicQuery(
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

		return _sezZoneProposedProjectInfoLocalService.dynamicQueryCount(
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

		return _sezZoneProposedProjectInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezZoneProposedProjectInfo fetchSezZoneProposedProjectInfo(
				long sezZoneProposedProjectInfoId) {

		return _sezZoneProposedProjectInfoLocalService.
			fetchSezZoneProposedProjectInfo(sezZoneProposedProjectInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezZoneProposedProjectInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezZoneProposedProjectInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezZoneProposedProjectInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneProposedProjectInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezZoneProposedProjectInfo getSezById(long sezStatusApplicationId) {

		return _sezZoneProposedProjectInfoLocalService.getSezById(
			sezStatusApplicationId);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezZoneProposedProjectInfo getSezStatusById(
					long sezStatusApplicationId)
				throws com.nbp.sez.status.application.form.service.exception.
					NoSuchSezZoneProposedProjectInfoException {

		return _sezZoneProposedProjectInfoLocalService.getSezStatusById(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez zone proposed project info with the primary key.
	 *
	 * @param sezZoneProposedProjectInfoId the primary key of the sez zone proposed project info
	 * @return the sez zone proposed project info
	 * @throws PortalException if a sez zone proposed project info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezZoneProposedProjectInfo getSezZoneProposedProjectInfo(
					long sezZoneProposedProjectInfoId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneProposedProjectInfoLocalService.
			getSezZoneProposedProjectInfo(sezZoneProposedProjectInfoId);
	}

	/**
	 * Returns a range of all the sez zone proposed project infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneProposedProjectInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone proposed project infos
	 * @param end the upper bound of the range of sez zone proposed project infos (not inclusive)
	 * @return the range of sez zone proposed project infos
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezZoneProposedProjectInfo> getSezZoneProposedProjectInfos(
				int start, int end) {

		return _sezZoneProposedProjectInfoLocalService.
			getSezZoneProposedProjectInfos(start, end);
	}

	/**
	 * Returns the number of sez zone proposed project infos.
	 *
	 * @return the number of sez zone proposed project infos
	 */
	@Override
	public int getSezZoneProposedProjectInfosCount() {
		return _sezZoneProposedProjectInfoLocalService.
			getSezZoneProposedProjectInfosCount();
	}

	/**
	 * Updates the sez zone proposed project info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneProposedProjectInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneProposedProjectInfo the sez zone proposed project info
	 * @return the sez zone proposed project info that was updated
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezZoneProposedProjectInfo updateSezZoneProposedProjectInfo(
				com.nbp.sez.status.application.form.service.model.
					SezZoneProposedProjectInfo sezZoneProposedProjectInfo) {

		return _sezZoneProposedProjectInfoLocalService.
			updateSezZoneProposedProjectInfo(sezZoneProposedProjectInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezZoneProposedProjectInfoLocalService.getBasePersistence();
	}

	@Override
	public SezZoneProposedProjectInfoLocalService getWrappedService() {
		return _sezZoneProposedProjectInfoLocalService;
	}

	@Override
	public void setWrappedService(
		SezZoneProposedProjectInfoLocalService
			sezZoneProposedProjectInfoLocalService) {

		_sezZoneProposedProjectInfoLocalService =
			sezZoneProposedProjectInfoLocalService;
	}

	private SezZoneProposedProjectInfoLocalService
		_sezZoneProposedProjectInfoLocalService;

}