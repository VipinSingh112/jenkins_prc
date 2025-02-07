/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezOccupanteSubmissionChecklistInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupanteSubmissionChecklistInfoLocalService
 * @generated
 */
public class SezOccupanteSubmissionChecklistInfoLocalServiceWrapper
	implements ServiceWrapper<SezOccupanteSubmissionChecklistInfoLocalService>,
			   SezOccupanteSubmissionChecklistInfoLocalService {

	public SezOccupanteSubmissionChecklistInfoLocalServiceWrapper() {
		this(null);
	}

	public SezOccupanteSubmissionChecklistInfoLocalServiceWrapper(
		SezOccupanteSubmissionChecklistInfoLocalService
			sezOccupanteSubmissionChecklistInfoLocalService) {

		_sezOccupanteSubmissionChecklistInfoLocalService =
			sezOccupanteSubmissionChecklistInfoLocalService;
	}

	/**
	 * Adds the sez occupante submission checklist info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupanteSubmissionChecklistInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupanteSubmissionChecklistInfo the sez occupante submission checklist info
	 * @return the sez occupante submission checklist info that was added
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupanteSubmissionChecklistInfo
			addSezOccupanteSubmissionChecklistInfo(
				com.nbp.sez.status.application.form.service.model.
					SezOccupanteSubmissionChecklistInfo
						sezOccupanteSubmissionChecklistInfo) {

		return _sezOccupanteSubmissionChecklistInfoLocalService.
			addSezOccupanteSubmissionChecklistInfo(
				sezOccupanteSubmissionChecklistInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupanteSubmissionChecklistInfoLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new sez occupante submission checklist info with the primary key. Does not add the sez occupante submission checklist info to the database.
	 *
	 * @param sezOccCheckSubmitId the primary key for the new sez occupante submission checklist info
	 * @return the new sez occupante submission checklist info
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupanteSubmissionChecklistInfo
			createSezOccupanteSubmissionChecklistInfo(
				long sezOccCheckSubmitId) {

		return _sezOccupanteSubmissionChecklistInfoLocalService.
			createSezOccupanteSubmissionChecklistInfo(sezOccCheckSubmitId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupanteSubmissionChecklistInfoLocalService.
			deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the sez occupante submission checklist info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupanteSubmissionChecklistInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccCheckSubmitId the primary key of the sez occupante submission checklist info
	 * @return the sez occupante submission checklist info that was removed
	 * @throws PortalException if a sez occupante submission checklist info with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupanteSubmissionChecklistInfo
				deleteSezOccupanteSubmissionChecklistInfo(
					long sezOccCheckSubmitId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupanteSubmissionChecklistInfoLocalService.
			deleteSezOccupanteSubmissionChecklistInfo(sezOccCheckSubmitId);
	}

	/**
	 * Deletes the sez occupante submission checklist info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupanteSubmissionChecklistInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupanteSubmissionChecklistInfo the sez occupante submission checklist info
	 * @return the sez occupante submission checklist info that was removed
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupanteSubmissionChecklistInfo
			deleteSezOccupanteSubmissionChecklistInfo(
				com.nbp.sez.status.application.form.service.model.
					SezOccupanteSubmissionChecklistInfo
						sezOccupanteSubmissionChecklistInfo) {

		return _sezOccupanteSubmissionChecklistInfoLocalService.
			deleteSezOccupanteSubmissionChecklistInfo(
				sezOccupanteSubmissionChecklistInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezOccupanteSubmissionChecklistInfoLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezOccupanteSubmissionChecklistInfoLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezOccupanteSubmissionChecklistInfoLocalService.dynamicQuery();
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

		return _sezOccupanteSubmissionChecklistInfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupanteSubmissionChecklistInfoModelImpl</code>.
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

		return _sezOccupanteSubmissionChecklistInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupanteSubmissionChecklistInfoModelImpl</code>.
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

		return _sezOccupanteSubmissionChecklistInfoLocalService.dynamicQuery(
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

		return _sezOccupanteSubmissionChecklistInfoLocalService.
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

		return _sezOccupanteSubmissionChecklistInfoLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupanteSubmissionChecklistInfo
			fetchSezOccupanteSubmissionChecklistInfo(long sezOccCheckSubmitId) {

		return _sezOccupanteSubmissionChecklistInfoLocalService.
			fetchSezOccupanteSubmissionChecklistInfo(sezOccCheckSubmitId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezOccupanteSubmissionChecklistInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezOccupanteSubmissionChecklistInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezOccupanteSubmissionChecklistInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupanteSubmissionChecklistInfoLocalService.
			getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the sez occupante submission checklist info with the primary key.
	 *
	 * @param sezOccCheckSubmitId the primary key of the sez occupante submission checklist info
	 * @return the sez occupante submission checklist info
	 * @throws PortalException if a sez occupante submission checklist info with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupanteSubmissionChecklistInfo
				getSezOccupanteSubmissionChecklistInfo(long sezOccCheckSubmitId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupanteSubmissionChecklistInfoLocalService.
			getSezOccupanteSubmissionChecklistInfo(sezOccCheckSubmitId);
	}

	/**
	 * Returns a range of all the sez occupante submission checklist infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupanteSubmissionChecklistInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupante submission checklist infos
	 * @param end the upper bound of the range of sez occupante submission checklist infos (not inclusive)
	 * @return the range of sez occupante submission checklist infos
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezOccupanteSubmissionChecklistInfo>
				getSezOccupanteSubmissionChecklistInfos(int start, int end) {

		return _sezOccupanteSubmissionChecklistInfoLocalService.
			getSezOccupanteSubmissionChecklistInfos(start, end);
	}

	/**
	 * Returns the number of sez occupante submission checklist infos.
	 *
	 * @return the number of sez occupante submission checklist infos
	 */
	@Override
	public int getSezOccupanteSubmissionChecklistInfosCount() {
		return _sezOccupanteSubmissionChecklistInfoLocalService.
			getSezOccupanteSubmissionChecklistInfosCount();
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupanteSubmissionChecklistInfo getSezStatusBy_Id(
				long sezApplicationId)
			throws com.nbp.sez.status.application.form.service.exception.
				NoSuchSezOccupanteSubmissionChecklistInfoException {

		return _sezOccupanteSubmissionChecklistInfoLocalService.
			getSezStatusBy_Id(sezApplicationId);
	}

	/**
	 * Updates the sez occupante submission checklist info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupanteSubmissionChecklistInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupanteSubmissionChecklistInfo the sez occupante submission checklist info
	 * @return the sez occupante submission checklist info that was updated
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupanteSubmissionChecklistInfo
			updateSezOccupanteSubmissionChecklistInfo(
				com.nbp.sez.status.application.form.service.model.
					SezOccupanteSubmissionChecklistInfo
						sezOccupanteSubmissionChecklistInfo) {

		return _sezOccupanteSubmissionChecklistInfoLocalService.
			updateSezOccupanteSubmissionChecklistInfo(
				sezOccupanteSubmissionChecklistInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezOccupanteSubmissionChecklistInfoLocalService.
			getBasePersistence();
	}

	@Override
	public SezOccupanteSubmissionChecklistInfoLocalService getWrappedService() {
		return _sezOccupanteSubmissionChecklistInfoLocalService;
	}

	@Override
	public void setWrappedService(
		SezOccupanteSubmissionChecklistInfoLocalService
			sezOccupanteSubmissionChecklistInfoLocalService) {

		_sezOccupanteSubmissionChecklistInfoLocalService =
			sezOccupanteSubmissionChecklistInfoLocalService;
	}

	private SezOccupanteSubmissionChecklistInfoLocalService
		_sezOccupanteSubmissionChecklistInfoLocalService;

}