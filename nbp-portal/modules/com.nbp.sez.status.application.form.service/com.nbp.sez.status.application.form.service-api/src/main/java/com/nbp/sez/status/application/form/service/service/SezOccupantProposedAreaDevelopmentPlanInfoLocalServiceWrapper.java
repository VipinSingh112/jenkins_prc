/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezOccupantProposedAreaDevelopmentPlanInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantProposedAreaDevelopmentPlanInfoLocalService
 * @generated
 */
public class SezOccupantProposedAreaDevelopmentPlanInfoLocalServiceWrapper
	implements ServiceWrapper
		<SezOccupantProposedAreaDevelopmentPlanInfoLocalService>,
			   SezOccupantProposedAreaDevelopmentPlanInfoLocalService {

	public SezOccupantProposedAreaDevelopmentPlanInfoLocalServiceWrapper() {
		this(null);
	}

	public SezOccupantProposedAreaDevelopmentPlanInfoLocalServiceWrapper(
		SezOccupantProposedAreaDevelopmentPlanInfoLocalService
			sezOccupantProposedAreaDevelopmentPlanInfoLocalService) {

		_sezOccupantProposedAreaDevelopmentPlanInfoLocalService =
			sezOccupantProposedAreaDevelopmentPlanInfoLocalService;
	}

	/**
	 * Adds the sez occupant proposed area development plan info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantProposedAreaDevelopmentPlanInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantProposedAreaDevelopmentPlanInfo the sez occupant proposed area development plan info
	 * @return the sez occupant proposed area development plan info that was added
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantProposedAreaDevelopmentPlanInfo
			addSezOccupantProposedAreaDevelopmentPlanInfo(
				com.nbp.sez.status.application.form.service.model.
					SezOccupantProposedAreaDevelopmentPlanInfo
						sezOccupantProposedAreaDevelopmentPlanInfo) {

		return _sezOccupantProposedAreaDevelopmentPlanInfoLocalService.
			addSezOccupantProposedAreaDevelopmentPlanInfo(
				sezOccupantProposedAreaDevelopmentPlanInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantProposedAreaDevelopmentPlanInfoLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new sez occupant proposed area development plan info with the primary key. Does not add the sez occupant proposed area development plan info to the database.
	 *
	 * @param sezOccPropAreaId the primary key for the new sez occupant proposed area development plan info
	 * @return the new sez occupant proposed area development plan info
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantProposedAreaDevelopmentPlanInfo
			createSezOccupantProposedAreaDevelopmentPlanInfo(
				long sezOccPropAreaId) {

		return _sezOccupantProposedAreaDevelopmentPlanInfoLocalService.
			createSezOccupantProposedAreaDevelopmentPlanInfo(sezOccPropAreaId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantProposedAreaDevelopmentPlanInfoLocalService.
			deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the sez occupant proposed area development plan info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantProposedAreaDevelopmentPlanInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccPropAreaId the primary key of the sez occupant proposed area development plan info
	 * @return the sez occupant proposed area development plan info that was removed
	 * @throws PortalException if a sez occupant proposed area development plan info with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantProposedAreaDevelopmentPlanInfo
				deleteSezOccupantProposedAreaDevelopmentPlanInfo(
					long sezOccPropAreaId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantProposedAreaDevelopmentPlanInfoLocalService.
			deleteSezOccupantProposedAreaDevelopmentPlanInfo(sezOccPropAreaId);
	}

	/**
	 * Deletes the sez occupant proposed area development plan info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantProposedAreaDevelopmentPlanInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantProposedAreaDevelopmentPlanInfo the sez occupant proposed area development plan info
	 * @return the sez occupant proposed area development plan info that was removed
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantProposedAreaDevelopmentPlanInfo
			deleteSezOccupantProposedAreaDevelopmentPlanInfo(
				com.nbp.sez.status.application.form.service.model.
					SezOccupantProposedAreaDevelopmentPlanInfo
						sezOccupantProposedAreaDevelopmentPlanInfo) {

		return _sezOccupantProposedAreaDevelopmentPlanInfoLocalService.
			deleteSezOccupantProposedAreaDevelopmentPlanInfo(
				sezOccupantProposedAreaDevelopmentPlanInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezOccupantProposedAreaDevelopmentPlanInfoLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezOccupantProposedAreaDevelopmentPlanInfoLocalService.
			dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezOccupantProposedAreaDevelopmentPlanInfoLocalService.
			dynamicQuery();
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

		return _sezOccupantProposedAreaDevelopmentPlanInfoLocalService.
			dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantProposedAreaDevelopmentPlanInfoModelImpl</code>.
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

		return _sezOccupantProposedAreaDevelopmentPlanInfoLocalService.
			dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantProposedAreaDevelopmentPlanInfoModelImpl</code>.
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

		return _sezOccupantProposedAreaDevelopmentPlanInfoLocalService.
			dynamicQuery(dynamicQuery, start, end, orderByComparator);
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

		return _sezOccupantProposedAreaDevelopmentPlanInfoLocalService.
			dynamicQueryCount(dynamicQuery);
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

		return _sezOccupantProposedAreaDevelopmentPlanInfoLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantProposedAreaDevelopmentPlanInfo
			fetchSezOccupantProposedAreaDevelopmentPlanInfo(
				long sezOccPropAreaId) {

		return _sezOccupantProposedAreaDevelopmentPlanInfoLocalService.
			fetchSezOccupantProposedAreaDevelopmentPlanInfo(sezOccPropAreaId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezOccupantProposedAreaDevelopmentPlanInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezOccupantProposedAreaDevelopmentPlanInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezOccupantProposedAreaDevelopmentPlanInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantProposedAreaDevelopmentPlanInfoLocalService.
			getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the sez occupant proposed area development plan info with the primary key.
	 *
	 * @param sezOccPropAreaId the primary key of the sez occupant proposed area development plan info
	 * @return the sez occupant proposed area development plan info
	 * @throws PortalException if a sez occupant proposed area development plan info with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantProposedAreaDevelopmentPlanInfo
				getSezOccupantProposedAreaDevelopmentPlanInfo(
					long sezOccPropAreaId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantProposedAreaDevelopmentPlanInfoLocalService.
			getSezOccupantProposedAreaDevelopmentPlanInfo(sezOccPropAreaId);
	}

	/**
	 * Returns a range of all the sez occupant proposed area development plan infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantProposedAreaDevelopmentPlanInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant proposed area development plan infos
	 * @param end the upper bound of the range of sez occupant proposed area development plan infos (not inclusive)
	 * @return the range of sez occupant proposed area development plan infos
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezOccupantProposedAreaDevelopmentPlanInfo>
				getSezOccupantProposedAreaDevelopmentPlanInfos(
					int start, int end) {

		return _sezOccupantProposedAreaDevelopmentPlanInfoLocalService.
			getSezOccupantProposedAreaDevelopmentPlanInfos(start, end);
	}

	/**
	 * Returns the number of sez occupant proposed area development plan infos.
	 *
	 * @return the number of sez occupant proposed area development plan infos
	 */
	@Override
	public int getSezOccupantProposedAreaDevelopmentPlanInfosCount() {
		return _sezOccupantProposedAreaDevelopmentPlanInfoLocalService.
			getSezOccupantProposedAreaDevelopmentPlanInfosCount();
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantProposedAreaDevelopmentPlanInfo getSezStatusBy_Id(
				long sezApplicationId)
			throws com.nbp.sez.status.application.form.service.exception.
				NoSuchSezOccupantProposedAreaDevelopmentPlanInfoException {

		return _sezOccupantProposedAreaDevelopmentPlanInfoLocalService.
			getSezStatusBy_Id(sezApplicationId);
	}

	/**
	 * Updates the sez occupant proposed area development plan info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantProposedAreaDevelopmentPlanInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantProposedAreaDevelopmentPlanInfo the sez occupant proposed area development plan info
	 * @return the sez occupant proposed area development plan info that was updated
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantProposedAreaDevelopmentPlanInfo
			updateSezOccupantProposedAreaDevelopmentPlanInfo(
				com.nbp.sez.status.application.form.service.model.
					SezOccupantProposedAreaDevelopmentPlanInfo
						sezOccupantProposedAreaDevelopmentPlanInfo) {

		return _sezOccupantProposedAreaDevelopmentPlanInfoLocalService.
			updateSezOccupantProposedAreaDevelopmentPlanInfo(
				sezOccupantProposedAreaDevelopmentPlanInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezOccupantProposedAreaDevelopmentPlanInfoLocalService.
			getBasePersistence();
	}

	@Override
	public SezOccupantProposedAreaDevelopmentPlanInfoLocalService
		getWrappedService() {

		return _sezOccupantProposedAreaDevelopmentPlanInfoLocalService;
	}

	@Override
	public void setWrappedService(
		SezOccupantProposedAreaDevelopmentPlanInfoLocalService
			sezOccupantProposedAreaDevelopmentPlanInfoLocalService) {

		_sezOccupantProposedAreaDevelopmentPlanInfoLocalService =
			sezOccupantProposedAreaDevelopmentPlanInfoLocalService;
	}

	private SezOccupantProposedAreaDevelopmentPlanInfoLocalService
		_sezOccupantProposedAreaDevelopmentPlanInfoLocalService;

}