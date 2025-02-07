/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezOccupantExistingProposedProjectBriefInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantExistingProposedProjectBriefInfoLocalService
 * @generated
 */
public class SezOccupantExistingProposedProjectBriefInfoLocalServiceWrapper
	implements ServiceWrapper
		<SezOccupantExistingProposedProjectBriefInfoLocalService>,
			   SezOccupantExistingProposedProjectBriefInfoLocalService {

	public SezOccupantExistingProposedProjectBriefInfoLocalServiceWrapper() {
		this(null);
	}

	public SezOccupantExistingProposedProjectBriefInfoLocalServiceWrapper(
		SezOccupantExistingProposedProjectBriefInfoLocalService
			sezOccupantExistingProposedProjectBriefInfoLocalService) {

		_sezOccupantExistingProposedProjectBriefInfoLocalService =
			sezOccupantExistingProposedProjectBriefInfoLocalService;
	}

	/**
	 * Adds the sez occupant existing proposed project brief info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantExistingProposedProjectBriefInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantExistingProposedProjectBriefInfo the sez occupant existing proposed project brief info
	 * @return the sez occupant existing proposed project brief info that was added
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantExistingProposedProjectBriefInfo
			addSezOccupantExistingProposedProjectBriefInfo(
				com.nbp.sez.status.application.form.service.model.
					SezOccupantExistingProposedProjectBriefInfo
						sezOccupantExistingProposedProjectBriefInfo) {

		return _sezOccupantExistingProposedProjectBriefInfoLocalService.
			addSezOccupantExistingProposedProjectBriefInfo(
				sezOccupantExistingProposedProjectBriefInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantExistingProposedProjectBriefInfoLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new sez occupant existing proposed project brief info with the primary key. Does not add the sez occupant existing proposed project brief info to the database.
	 *
	 * @param sezOccExistPorpId the primary key for the new sez occupant existing proposed project brief info
	 * @return the new sez occupant existing proposed project brief info
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantExistingProposedProjectBriefInfo
			createSezOccupantExistingProposedProjectBriefInfo(
				long sezOccExistPorpId) {

		return _sezOccupantExistingProposedProjectBriefInfoLocalService.
			createSezOccupantExistingProposedProjectBriefInfo(
				sezOccExistPorpId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantExistingProposedProjectBriefInfoLocalService.
			deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the sez occupant existing proposed project brief info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantExistingProposedProjectBriefInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccExistPorpId the primary key of the sez occupant existing proposed project brief info
	 * @return the sez occupant existing proposed project brief info that was removed
	 * @throws PortalException if a sez occupant existing proposed project brief info with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantExistingProposedProjectBriefInfo
				deleteSezOccupantExistingProposedProjectBriefInfo(
					long sezOccExistPorpId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantExistingProposedProjectBriefInfoLocalService.
			deleteSezOccupantExistingProposedProjectBriefInfo(
				sezOccExistPorpId);
	}

	/**
	 * Deletes the sez occupant existing proposed project brief info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantExistingProposedProjectBriefInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantExistingProposedProjectBriefInfo the sez occupant existing proposed project brief info
	 * @return the sez occupant existing proposed project brief info that was removed
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantExistingProposedProjectBriefInfo
			deleteSezOccupantExistingProposedProjectBriefInfo(
				com.nbp.sez.status.application.form.service.model.
					SezOccupantExistingProposedProjectBriefInfo
						sezOccupantExistingProposedProjectBriefInfo) {

		return _sezOccupantExistingProposedProjectBriefInfoLocalService.
			deleteSezOccupantExistingProposedProjectBriefInfo(
				sezOccupantExistingProposedProjectBriefInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezOccupantExistingProposedProjectBriefInfoLocalService.
			dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezOccupantExistingProposedProjectBriefInfoLocalService.
			dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezOccupantExistingProposedProjectBriefInfoLocalService.
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

		return _sezOccupantExistingProposedProjectBriefInfoLocalService.
			dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantExistingProposedProjectBriefInfoModelImpl</code>.
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

		return _sezOccupantExistingProposedProjectBriefInfoLocalService.
			dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantExistingProposedProjectBriefInfoModelImpl</code>.
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

		return _sezOccupantExistingProposedProjectBriefInfoLocalService.
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

		return _sezOccupantExistingProposedProjectBriefInfoLocalService.
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

		return _sezOccupantExistingProposedProjectBriefInfoLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantExistingProposedProjectBriefInfo
			fetchSezOccupantExistingProposedProjectBriefInfo(
				long sezOccExistPorpId) {

		return _sezOccupantExistingProposedProjectBriefInfoLocalService.
			fetchSezOccupantExistingProposedProjectBriefInfo(sezOccExistPorpId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezOccupantExistingProposedProjectBriefInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezOccupantExistingProposedProjectBriefInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezOccupantExistingProposedProjectBriefInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantExistingProposedProjectBriefInfoLocalService.
			getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the sez occupant existing proposed project brief info with the primary key.
	 *
	 * @param sezOccExistPorpId the primary key of the sez occupant existing proposed project brief info
	 * @return the sez occupant existing proposed project brief info
	 * @throws PortalException if a sez occupant existing proposed project brief info with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantExistingProposedProjectBriefInfo
				getSezOccupantExistingProposedProjectBriefInfo(
					long sezOccExistPorpId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantExistingProposedProjectBriefInfoLocalService.
			getSezOccupantExistingProposedProjectBriefInfo(sezOccExistPorpId);
	}

	/**
	 * Returns a range of all the sez occupant existing proposed project brief infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantExistingProposedProjectBriefInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant existing proposed project brief infos
	 * @param end the upper bound of the range of sez occupant existing proposed project brief infos (not inclusive)
	 * @return the range of sez occupant existing proposed project brief infos
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezOccupantExistingProposedProjectBriefInfo>
				getSezOccupantExistingProposedProjectBriefInfos(
					int start, int end) {

		return _sezOccupantExistingProposedProjectBriefInfoLocalService.
			getSezOccupantExistingProposedProjectBriefInfos(start, end);
	}

	/**
	 * Returns the number of sez occupant existing proposed project brief infos.
	 *
	 * @return the number of sez occupant existing proposed project brief infos
	 */
	@Override
	public int getSezOccupantExistingProposedProjectBriefInfosCount() {
		return _sezOccupantExistingProposedProjectBriefInfoLocalService.
			getSezOccupantExistingProposedProjectBriefInfosCount();
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantExistingProposedProjectBriefInfo getSezStatusBy_Id(
				long sezApplicationId)
			throws com.nbp.sez.status.application.form.service.exception.
				NoSuchSezOccupantExistingProposedProjectBriefInfoException {

		return _sezOccupantExistingProposedProjectBriefInfoLocalService.
			getSezStatusBy_Id(sezApplicationId);
	}

	/**
	 * Updates the sez occupant existing proposed project brief info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantExistingProposedProjectBriefInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantExistingProposedProjectBriefInfo the sez occupant existing proposed project brief info
	 * @return the sez occupant existing proposed project brief info that was updated
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantExistingProposedProjectBriefInfo
			updateSezOccupantExistingProposedProjectBriefInfo(
				com.nbp.sez.status.application.form.service.model.
					SezOccupantExistingProposedProjectBriefInfo
						sezOccupantExistingProposedProjectBriefInfo) {

		return _sezOccupantExistingProposedProjectBriefInfoLocalService.
			updateSezOccupantExistingProposedProjectBriefInfo(
				sezOccupantExistingProposedProjectBriefInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezOccupantExistingProposedProjectBriefInfoLocalService.
			getBasePersistence();
	}

	@Override
	public SezOccupantExistingProposedProjectBriefInfoLocalService
		getWrappedService() {

		return _sezOccupantExistingProposedProjectBriefInfoLocalService;
	}

	@Override
	public void setWrappedService(
		SezOccupantExistingProposedProjectBriefInfoLocalService
			sezOccupantExistingProposedProjectBriefInfoLocalService) {

		_sezOccupantExistingProposedProjectBriefInfoLocalService =
			sezOccupantExistingProposedProjectBriefInfoLocalService;
	}

	private SezOccupantExistingProposedProjectBriefInfoLocalService
		_sezOccupantExistingProposedProjectBriefInfoLocalService;

}