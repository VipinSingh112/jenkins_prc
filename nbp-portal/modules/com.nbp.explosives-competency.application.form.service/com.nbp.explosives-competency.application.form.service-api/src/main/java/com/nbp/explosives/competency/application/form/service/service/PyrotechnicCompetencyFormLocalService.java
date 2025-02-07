/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.explosives.competency.application.form.service.exception.NoSuchPyrotechnicCompetencyFormException;
import com.nbp.explosives.competency.application.form.service.model.PyrotechnicCompetencyForm;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for PyrotechnicCompetencyForm. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see PyrotechnicCompetencyFormLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface PyrotechnicCompetencyFormLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.explosives.competency.application.form.service.service.impl.PyrotechnicCompetencyFormLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the pyrotechnic competency form local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link PyrotechnicCompetencyFormLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the pyrotechnic competency form to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PyrotechnicCompetencyFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pyrotechnicCompetencyForm the pyrotechnic competency form
	 * @return the pyrotechnic competency form that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public PyrotechnicCompetencyForm addPyrotechnicCompetencyForm(
		PyrotechnicCompetencyForm pyrotechnicCompetencyForm);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Creates a new pyrotechnic competency form with the primary key. Does not add the pyrotechnic competency form to the database.
	 *
	 * @param pyrotechnicCompetencyFormId the primary key for the new pyrotechnic competency form
	 * @return the new pyrotechnic competency form
	 */
	@Transactional(enabled = false)
	public PyrotechnicCompetencyForm createPyrotechnicCompetencyForm(
		long pyrotechnicCompetencyFormId);

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	/**
	 * Deletes the pyrotechnic competency form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PyrotechnicCompetencyFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pyrotechnicCompetencyFormId the primary key of the pyrotechnic competency form
	 * @return the pyrotechnic competency form that was removed
	 * @throws PortalException if a pyrotechnic competency form with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public PyrotechnicCompetencyForm deletePyrotechnicCompetencyForm(
			long pyrotechnicCompetencyFormId)
		throws PortalException;

	/**
	 * Deletes the pyrotechnic competency form from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PyrotechnicCompetencyFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pyrotechnicCompetencyForm the pyrotechnic competency form
	 * @return the pyrotechnic competency form that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public PyrotechnicCompetencyForm deletePyrotechnicCompetencyForm(
		PyrotechnicCompetencyForm pyrotechnicCompetencyForm);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> T dslQuery(DSLQuery dslQuery);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int dslQueryCount(DSLQuery dslQuery);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.application.form.service.model.impl.PyrotechnicCompetencyFormModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.application.form.service.model.impl.PyrotechnicCompetencyFormModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PyrotechnicCompetencyForm fetchPyrotechnicCompetencyForm(
		long pyrotechnicCompetencyFormId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PyrotechnicCompetencyForm getExplosiveById(
			long explosivesApplicationId)
		throws NoSuchPyrotechnicCompetencyFormException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Returns the pyrotechnic competency form with the primary key.
	 *
	 * @param pyrotechnicCompetencyFormId the primary key of the pyrotechnic competency form
	 * @return the pyrotechnic competency form
	 * @throws PortalException if a pyrotechnic competency form with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PyrotechnicCompetencyForm getPyrotechnicCompetencyForm(
			long pyrotechnicCompetencyFormId)
		throws PortalException;

	/**
	 * Returns a range of all the pyrotechnic competency forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.application.form.service.model.impl.PyrotechnicCompetencyFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pyrotechnic competency forms
	 * @param end the upper bound of the range of pyrotechnic competency forms (not inclusive)
	 * @return the range of pyrotechnic competency forms
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<PyrotechnicCompetencyForm> getPyrotechnicCompetencyForms(
		int start, int end);

	/**
	 * Returns the number of pyrotechnic competency forms.
	 *
	 * @return the number of pyrotechnic competency forms
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getPyrotechnicCompetencyFormsCount();

	/**
	 * Updates the pyrotechnic competency form in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PyrotechnicCompetencyFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pyrotechnicCompetencyForm the pyrotechnic competency form
	 * @return the pyrotechnic competency form that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public PyrotechnicCompetencyForm updatePyrotechnicCompetencyForm(
		PyrotechnicCompetencyForm pyrotechnicCompetencyForm);

}