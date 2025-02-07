/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MiicApplicationCurrentStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiicApplicationCurrentStageLocalService
 * @generated
 */
public class MiicApplicationCurrentStageLocalServiceWrapper
	implements MiicApplicationCurrentStageLocalService,
			   ServiceWrapper<MiicApplicationCurrentStageLocalService> {

	public MiicApplicationCurrentStageLocalServiceWrapper() {
		this(null);
	}

	public MiicApplicationCurrentStageLocalServiceWrapper(
		MiicApplicationCurrentStageLocalService
			miicApplicationCurrentStageLocalService) {

		_miicApplicationCurrentStageLocalService =
			miicApplicationCurrentStageLocalService;
	}

	/**
	 * Adds the miic application current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicApplicationCurrentStage the miic application current stage
	 * @return the miic application current stage that was added
	 */
	@Override
	public
		com.nbp.miic.application.form.services.model.MiicApplicationCurrentStage
			addMiicApplicationCurrentStage(
				com.nbp.miic.application.form.services.model.
					MiicApplicationCurrentStage miicApplicationCurrentStage) {

		return _miicApplicationCurrentStageLocalService.
			addMiicApplicationCurrentStage(miicApplicationCurrentStage);
	}

	/**
	 * Creates a new miic application current stage with the primary key. Does not add the miic application current stage to the database.
	 *
	 * @param miicApplicationCurrentStageId the primary key for the new miic application current stage
	 * @return the new miic application current stage
	 */
	@Override
	public
		com.nbp.miic.application.form.services.model.MiicApplicationCurrentStage
			createMiicApplicationCurrentStage(
				long miicApplicationCurrentStageId) {

		return _miicApplicationCurrentStageLocalService.
			createMiicApplicationCurrentStage(miicApplicationCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicApplicationCurrentStageLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the miic application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicApplicationCurrentStageId the primary key of the miic application current stage
	 * @return the miic application current stage that was removed
	 * @throws PortalException if a miic application current stage with the primary key could not be found
	 */
	@Override
	public
		com.nbp.miic.application.form.services.model.MiicApplicationCurrentStage
				deleteMiicApplicationCurrentStage(
					long miicApplicationCurrentStageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _miicApplicationCurrentStageLocalService.
			deleteMiicApplicationCurrentStage(miicApplicationCurrentStageId);
	}

	/**
	 * Deletes the miic application current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicApplicationCurrentStage the miic application current stage
	 * @return the miic application current stage that was removed
	 */
	@Override
	public
		com.nbp.miic.application.form.services.model.MiicApplicationCurrentStage
			deleteMiicApplicationCurrentStage(
				com.nbp.miic.application.form.services.model.
					MiicApplicationCurrentStage miicApplicationCurrentStage) {

		return _miicApplicationCurrentStageLocalService.
			deleteMiicApplicationCurrentStage(miicApplicationCurrentStage);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicApplicationCurrentStageLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _miicApplicationCurrentStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _miicApplicationCurrentStageLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _miicApplicationCurrentStageLocalService.dynamicQuery();
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

		return _miicApplicationCurrentStageLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicApplicationCurrentStageModelImpl</code>.
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

		return _miicApplicationCurrentStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicApplicationCurrentStageModelImpl</code>.
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

		return _miicApplicationCurrentStageLocalService.dynamicQuery(
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

		return _miicApplicationCurrentStageLocalService.dynamicQueryCount(
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

		return _miicApplicationCurrentStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.miic.application.form.services.model.MiicApplicationCurrentStage
			fetchMiicApplicationCurrentStage(
				long miicApplicationCurrentStageId) {

		return _miicApplicationCurrentStageLocalService.
			fetchMiicApplicationCurrentStage(miicApplicationCurrentStageId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _miicApplicationCurrentStageLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _miicApplicationCurrentStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public
		com.nbp.miic.application.form.services.model.MiicApplicationCurrentStage
				getMIIC_Stage_MIIC_AI(long miicApplicationId)
			throws com.nbp.miic.application.form.services.exception.
				NoSuchMiicApplicationCurrentStageException {

		return _miicApplicationCurrentStageLocalService.getMIIC_Stage_MIIC_AI(
			miicApplicationId);
	}

	/**
	 * Returns the miic application current stage with the primary key.
	 *
	 * @param miicApplicationCurrentStageId the primary key of the miic application current stage
	 * @return the miic application current stage
	 * @throws PortalException if a miic application current stage with the primary key could not be found
	 */
	@Override
	public
		com.nbp.miic.application.form.services.model.MiicApplicationCurrentStage
				getMiicApplicationCurrentStage(
					long miicApplicationCurrentStageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _miicApplicationCurrentStageLocalService.
			getMiicApplicationCurrentStage(miicApplicationCurrentStageId);
	}

	/**
	 * Returns a range of all the miic application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic application current stages
	 * @param end the upper bound of the range of miic application current stages (not inclusive)
	 * @return the range of miic application current stages
	 */
	@Override
	public java.util.List
		<com.nbp.miic.application.form.services.model.
			MiicApplicationCurrentStage> getMiicApplicationCurrentStages(
				int start, int end) {

		return _miicApplicationCurrentStageLocalService.
			getMiicApplicationCurrentStages(start, end);
	}

	/**
	 * Returns the number of miic application current stages.
	 *
	 * @return the number of miic application current stages
	 */
	@Override
	public int getMiicApplicationCurrentStagesCount() {
		return _miicApplicationCurrentStageLocalService.
			getMiicApplicationCurrentStagesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miicApplicationCurrentStageLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicApplicationCurrentStageLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the miic application current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicApplicationCurrentStage the miic application current stage
	 * @return the miic application current stage that was updated
	 */
	@Override
	public
		com.nbp.miic.application.form.services.model.MiicApplicationCurrentStage
			updateMiicApplicationCurrentStage(
				com.nbp.miic.application.form.services.model.
					MiicApplicationCurrentStage miicApplicationCurrentStage) {

		return _miicApplicationCurrentStageLocalService.
			updateMiicApplicationCurrentStage(miicApplicationCurrentStage);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _miicApplicationCurrentStageLocalService.getBasePersistence();
	}

	@Override
	public MiicApplicationCurrentStageLocalService getWrappedService() {
		return _miicApplicationCurrentStageLocalService;
	}

	@Override
	public void setWrappedService(
		MiicApplicationCurrentStageLocalService
			miicApplicationCurrentStageLocalService) {

		_miicApplicationCurrentStageLocalService =
			miicApplicationCurrentStageLocalService;
	}

	private MiicApplicationCurrentStageLocalService
		_miicApplicationCurrentStageLocalService;

}