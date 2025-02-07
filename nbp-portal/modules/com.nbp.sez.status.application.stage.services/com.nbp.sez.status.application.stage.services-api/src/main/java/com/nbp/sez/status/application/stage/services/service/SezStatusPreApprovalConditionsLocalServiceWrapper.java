/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezStatusPreApprovalConditionsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusPreApprovalConditionsLocalService
 * @generated
 */
public class SezStatusPreApprovalConditionsLocalServiceWrapper
	implements ServiceWrapper<SezStatusPreApprovalConditionsLocalService>,
			   SezStatusPreApprovalConditionsLocalService {

	public SezStatusPreApprovalConditionsLocalServiceWrapper() {
		this(null);
	}

	public SezStatusPreApprovalConditionsLocalServiceWrapper(
		SezStatusPreApprovalConditionsLocalService
			sezStatusPreApprovalConditionsLocalService) {

		_sezStatusPreApprovalConditionsLocalService =
			sezStatusPreApprovalConditionsLocalService;
	}

	/**
	 * Adds the sez status pre approval conditions to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusPreApprovalConditionsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusPreApprovalConditions the sez status pre approval conditions
	 * @return the sez status pre approval conditions that was added
	 */
	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusPreApprovalConditions addSezStatusPreApprovalConditions(
			com.nbp.sez.status.application.stage.services.model.
				SezStatusPreApprovalConditions sezStatusPreApprovalConditions) {

		return _sezStatusPreApprovalConditionsLocalService.
			addSezStatusPreApprovalConditions(sezStatusPreApprovalConditions);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusPreApprovalConditionsLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez status pre approval conditions with the primary key. Does not add the sez status pre approval conditions to the database.
	 *
	 * @param preApprovalId the primary key for the new sez status pre approval conditions
	 * @return the new sez status pre approval conditions
	 */
	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusPreApprovalConditions createSezStatusPreApprovalConditions(
			long preApprovalId) {

		return _sezStatusPreApprovalConditionsLocalService.
			createSezStatusPreApprovalConditions(preApprovalId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusPreApprovalConditionsLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez status pre approval conditions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusPreApprovalConditionsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param preApprovalId the primary key of the sez status pre approval conditions
	 * @return the sez status pre approval conditions that was removed
	 * @throws PortalException if a sez status pre approval conditions with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusPreApprovalConditions deleteSezStatusPreApprovalConditions(
				long preApprovalId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusPreApprovalConditionsLocalService.
			deleteSezStatusPreApprovalConditions(preApprovalId);
	}

	/**
	 * Deletes the sez status pre approval conditions from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusPreApprovalConditionsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusPreApprovalConditions the sez status pre approval conditions
	 * @return the sez status pre approval conditions that was removed
	 */
	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusPreApprovalConditions deleteSezStatusPreApprovalConditions(
			com.nbp.sez.status.application.stage.services.model.
				SezStatusPreApprovalConditions sezStatusPreApprovalConditions) {

		return _sezStatusPreApprovalConditionsLocalService.
			deleteSezStatusPreApprovalConditions(
				sezStatusPreApprovalConditions);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezStatusPreApprovalConditionsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezStatusPreApprovalConditionsLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezStatusPreApprovalConditionsLocalService.dynamicQuery();
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

		return _sezStatusPreApprovalConditionsLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusPreApprovalConditionsModelImpl</code>.
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

		return _sezStatusPreApprovalConditionsLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusPreApprovalConditionsModelImpl</code>.
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

		return _sezStatusPreApprovalConditionsLocalService.dynamicQuery(
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

		return _sezStatusPreApprovalConditionsLocalService.dynamicQueryCount(
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

		return _sezStatusPreApprovalConditionsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusPreApprovalConditions fetchSezStatusPreApprovalConditions(
			long preApprovalId) {

		return _sezStatusPreApprovalConditionsLocalService.
			fetchSezStatusPreApprovalConditions(preApprovalId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezStatusPreApprovalConditionsLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezStatusPreApprovalConditionsLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezStatusPreApprovalConditionsLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusPreApprovalConditionsLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusPreApprovalConditions getPreApprovalCondition_By_CI(
				String caseId)
			throws com.nbp.sez.status.application.stage.services.exception.
				NoSuchSezStatusPreApprovalConditionsException {

		return _sezStatusPreApprovalConditionsLocalService.
			getPreApprovalCondition_By_CI(caseId);
	}

	/**
	 * Returns the sez status pre approval conditions with the primary key.
	 *
	 * @param preApprovalId the primary key of the sez status pre approval conditions
	 * @return the sez status pre approval conditions
	 * @throws PortalException if a sez status pre approval conditions with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusPreApprovalConditions getSezStatusPreApprovalConditions(
				long preApprovalId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusPreApprovalConditionsLocalService.
			getSezStatusPreApprovalConditions(preApprovalId);
	}

	/**
	 * Returns a range of all the sez status pre approval conditionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusPreApprovalConditionsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status pre approval conditionses
	 * @param end the upper bound of the range of sez status pre approval conditionses (not inclusive)
	 * @return the range of sez status pre approval conditionses
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.stage.services.model.
			SezStatusPreApprovalConditions> getSezStatusPreApprovalConditionses(
				int start, int end) {

		return _sezStatusPreApprovalConditionsLocalService.
			getSezStatusPreApprovalConditionses(start, end);
	}

	/**
	 * Returns the number of sez status pre approval conditionses.
	 *
	 * @return the number of sez status pre approval conditionses
	 */
	@Override
	public int getSezStatusPreApprovalConditionsesCount() {
		return _sezStatusPreApprovalConditionsLocalService.
			getSezStatusPreApprovalConditionsesCount();
	}

	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusPreApprovalConditions updatePreApprovalConditions(
			String caseId, long preApprovalConditionLetterId) {

		return _sezStatusPreApprovalConditionsLocalService.
			updatePreApprovalConditions(caseId, preApprovalConditionLetterId);
	}

	/**
	 * Updates the sez status pre approval conditions in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusPreApprovalConditionsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusPreApprovalConditions the sez status pre approval conditions
	 * @return the sez status pre approval conditions that was updated
	 */
	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusPreApprovalConditions updateSezStatusPreApprovalConditions(
			com.nbp.sez.status.application.stage.services.model.
				SezStatusPreApprovalConditions sezStatusPreApprovalConditions) {

		return _sezStatusPreApprovalConditionsLocalService.
			updateSezStatusPreApprovalConditions(
				sezStatusPreApprovalConditions);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezStatusPreApprovalConditionsLocalService.getBasePersistence();
	}

	@Override
	public SezStatusPreApprovalConditionsLocalService getWrappedService() {
		return _sezStatusPreApprovalConditionsLocalService;
	}

	@Override
	public void setWrappedService(
		SezStatusPreApprovalConditionsLocalService
			sezStatusPreApprovalConditionsLocalService) {

		_sezStatusPreApprovalConditionsLocalService =
			sezStatusPreApprovalConditionsLocalService;
	}

	private SezStatusPreApprovalConditionsLocalService
		_sezStatusPreApprovalConditionsLocalService;

}