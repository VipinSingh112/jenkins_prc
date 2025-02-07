/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.explosives.competency.application.form.service.exception.NoSuchPyrotechnicCompetencyFormException;
import com.nbp.explosives.competency.application.form.service.model.PyrotechnicCompetencyForm;
import com.nbp.explosives.competency.application.form.service.model.PyrotechnicCompetencyFormTable;
import com.nbp.explosives.competency.application.form.service.model.impl.PyrotechnicCompetencyFormImpl;
import com.nbp.explosives.competency.application.form.service.model.impl.PyrotechnicCompetencyFormModelImpl;
import com.nbp.explosives.competency.application.form.service.service.persistence.PyrotechnicCompetencyFormPersistence;
import com.nbp.explosives.competency.application.form.service.service.persistence.PyrotechnicCompetencyFormUtil;
import com.nbp.explosives.competency.application.form.service.service.persistence.impl.constants.EXPLOSIVEPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the pyrotechnic competency form service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = PyrotechnicCompetencyFormPersistence.class)
public class PyrotechnicCompetencyFormPersistenceImpl
	extends BasePersistenceImpl<PyrotechnicCompetencyForm>
	implements PyrotechnicCompetencyFormPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PyrotechnicCompetencyFormUtil</code> to access the pyrotechnic competency form persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PyrotechnicCompetencyFormImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetExplosiveById;
	private FinderPath _finderPathCountBygetExplosiveById;

	/**
	 * Returns the pyrotechnic competency form where explosivesApplicationId = &#63; or throws a <code>NoSuchPyrotechnicCompetencyFormException</code> if it could not be found.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the matching pyrotechnic competency form
	 * @throws NoSuchPyrotechnicCompetencyFormException if a matching pyrotechnic competency form could not be found
	 */
	@Override
	public PyrotechnicCompetencyForm findBygetExplosiveById(
			long explosivesApplicationId)
		throws NoSuchPyrotechnicCompetencyFormException {

		PyrotechnicCompetencyForm pyrotechnicCompetencyForm =
			fetchBygetExplosiveById(explosivesApplicationId);

		if (pyrotechnicCompetencyForm == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("explosivesApplicationId=");
			sb.append(explosivesApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchPyrotechnicCompetencyFormException(sb.toString());
		}

		return pyrotechnicCompetencyForm;
	}

	/**
	 * Returns the pyrotechnic competency form where explosivesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the matching pyrotechnic competency form, or <code>null</code> if a matching pyrotechnic competency form could not be found
	 */
	@Override
	public PyrotechnicCompetencyForm fetchBygetExplosiveById(
		long explosivesApplicationId) {

		return fetchBygetExplosiveById(explosivesApplicationId, true);
	}

	/**
	 * Returns the pyrotechnic competency form where explosivesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pyrotechnic competency form, or <code>null</code> if a matching pyrotechnic competency form could not be found
	 */
	@Override
	public PyrotechnicCompetencyForm fetchBygetExplosiveById(
		long explosivesApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {explosivesApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetExplosiveById, finderArgs, this);
		}

		if (result instanceof PyrotechnicCompetencyForm) {
			PyrotechnicCompetencyForm pyrotechnicCompetencyForm =
				(PyrotechnicCompetencyForm)result;

			if (explosivesApplicationId !=
					pyrotechnicCompetencyForm.getExplosivesApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_PYROTECHNICCOMPETENCYFORM_WHERE);

			sb.append(
				_FINDER_COLUMN_GETEXPLOSIVEBYID_EXPLOSIVESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(explosivesApplicationId);

				List<PyrotechnicCompetencyForm> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetExplosiveById, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									explosivesApplicationId
								};
							}

							_log.warn(
								"PyrotechnicCompetencyFormPersistenceImpl.fetchBygetExplosiveById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					PyrotechnicCompetencyForm pyrotechnicCompetencyForm =
						list.get(0);

					result = pyrotechnicCompetencyForm;

					cacheResult(pyrotechnicCompetencyForm);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (PyrotechnicCompetencyForm)result;
		}
	}

	/**
	 * Removes the pyrotechnic competency form where explosivesApplicationId = &#63; from the database.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the pyrotechnic competency form that was removed
	 */
	@Override
	public PyrotechnicCompetencyForm removeBygetExplosiveById(
			long explosivesApplicationId)
		throws NoSuchPyrotechnicCompetencyFormException {

		PyrotechnicCompetencyForm pyrotechnicCompetencyForm =
			findBygetExplosiveById(explosivesApplicationId);

		return remove(pyrotechnicCompetencyForm);
	}

	/**
	 * Returns the number of pyrotechnic competency forms where explosivesApplicationId = &#63;.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the number of matching pyrotechnic competency forms
	 */
	@Override
	public int countBygetExplosiveById(long explosivesApplicationId) {
		FinderPath finderPath = _finderPathCountBygetExplosiveById;

		Object[] finderArgs = new Object[] {explosivesApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PYROTECHNICCOMPETENCYFORM_WHERE);

			sb.append(
				_FINDER_COLUMN_GETEXPLOSIVEBYID_EXPLOSIVESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(explosivesApplicationId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETEXPLOSIVEBYID_EXPLOSIVESAPPLICATIONID_2 =
			"pyrotechnicCompetencyForm.explosivesApplicationId = ?";

	public PyrotechnicCompetencyFormPersistenceImpl() {
		setModelClass(PyrotechnicCompetencyForm.class);

		setModelImplClass(PyrotechnicCompetencyFormImpl.class);
		setModelPKClass(long.class);

		setTable(PyrotechnicCompetencyFormTable.INSTANCE);
	}

	/**
	 * Caches the pyrotechnic competency form in the entity cache if it is enabled.
	 *
	 * @param pyrotechnicCompetencyForm the pyrotechnic competency form
	 */
	@Override
	public void cacheResult(
		PyrotechnicCompetencyForm pyrotechnicCompetencyForm) {

		entityCache.putResult(
			PyrotechnicCompetencyFormImpl.class,
			pyrotechnicCompetencyForm.getPrimaryKey(),
			pyrotechnicCompetencyForm);

		finderCache.putResult(
			_finderPathFetchBygetExplosiveById,
			new Object[] {
				pyrotechnicCompetencyForm.getExplosivesApplicationId()
			},
			pyrotechnicCompetencyForm);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the pyrotechnic competency forms in the entity cache if it is enabled.
	 *
	 * @param pyrotechnicCompetencyForms the pyrotechnic competency forms
	 */
	@Override
	public void cacheResult(
		List<PyrotechnicCompetencyForm> pyrotechnicCompetencyForms) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (pyrotechnicCompetencyForms.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (PyrotechnicCompetencyForm pyrotechnicCompetencyForm :
				pyrotechnicCompetencyForms) {

			if (entityCache.getResult(
					PyrotechnicCompetencyFormImpl.class,
					pyrotechnicCompetencyForm.getPrimaryKey()) == null) {

				cacheResult(pyrotechnicCompetencyForm);
			}
		}
	}

	/**
	 * Clears the cache for all pyrotechnic competency forms.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PyrotechnicCompetencyFormImpl.class);

		finderCache.clearCache(PyrotechnicCompetencyFormImpl.class);
	}

	/**
	 * Clears the cache for the pyrotechnic competency form.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		PyrotechnicCompetencyForm pyrotechnicCompetencyForm) {

		entityCache.removeResult(
			PyrotechnicCompetencyFormImpl.class, pyrotechnicCompetencyForm);
	}

	@Override
	public void clearCache(
		List<PyrotechnicCompetencyForm> pyrotechnicCompetencyForms) {

		for (PyrotechnicCompetencyForm pyrotechnicCompetencyForm :
				pyrotechnicCompetencyForms) {

			entityCache.removeResult(
				PyrotechnicCompetencyFormImpl.class, pyrotechnicCompetencyForm);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(PyrotechnicCompetencyFormImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				PyrotechnicCompetencyFormImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		PyrotechnicCompetencyFormModelImpl pyrotechnicCompetencyFormModelImpl) {

		Object[] args = new Object[] {
			pyrotechnicCompetencyFormModelImpl.getExplosivesApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetExplosiveById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetExplosiveById, args,
			pyrotechnicCompetencyFormModelImpl);
	}

	/**
	 * Creates a new pyrotechnic competency form with the primary key. Does not add the pyrotechnic competency form to the database.
	 *
	 * @param pyrotechnicCompetencyFormId the primary key for the new pyrotechnic competency form
	 * @return the new pyrotechnic competency form
	 */
	@Override
	public PyrotechnicCompetencyForm create(long pyrotechnicCompetencyFormId) {
		PyrotechnicCompetencyForm pyrotechnicCompetencyForm =
			new PyrotechnicCompetencyFormImpl();

		pyrotechnicCompetencyForm.setNew(true);
		pyrotechnicCompetencyForm.setPrimaryKey(pyrotechnicCompetencyFormId);

		pyrotechnicCompetencyForm.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return pyrotechnicCompetencyForm;
	}

	/**
	 * Removes the pyrotechnic competency form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pyrotechnicCompetencyFormId the primary key of the pyrotechnic competency form
	 * @return the pyrotechnic competency form that was removed
	 * @throws NoSuchPyrotechnicCompetencyFormException if a pyrotechnic competency form with the primary key could not be found
	 */
	@Override
	public PyrotechnicCompetencyForm remove(long pyrotechnicCompetencyFormId)
		throws NoSuchPyrotechnicCompetencyFormException {

		return remove((Serializable)pyrotechnicCompetencyFormId);
	}

	/**
	 * Removes the pyrotechnic competency form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the pyrotechnic competency form
	 * @return the pyrotechnic competency form that was removed
	 * @throws NoSuchPyrotechnicCompetencyFormException if a pyrotechnic competency form with the primary key could not be found
	 */
	@Override
	public PyrotechnicCompetencyForm remove(Serializable primaryKey)
		throws NoSuchPyrotechnicCompetencyFormException {

		Session session = null;

		try {
			session = openSession();

			PyrotechnicCompetencyForm pyrotechnicCompetencyForm =
				(PyrotechnicCompetencyForm)session.get(
					PyrotechnicCompetencyFormImpl.class, primaryKey);

			if (pyrotechnicCompetencyForm == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPyrotechnicCompetencyFormException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(pyrotechnicCompetencyForm);
		}
		catch (NoSuchPyrotechnicCompetencyFormException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected PyrotechnicCompetencyForm removeImpl(
		PyrotechnicCompetencyForm pyrotechnicCompetencyForm) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(pyrotechnicCompetencyForm)) {
				pyrotechnicCompetencyForm =
					(PyrotechnicCompetencyForm)session.get(
						PyrotechnicCompetencyFormImpl.class,
						pyrotechnicCompetencyForm.getPrimaryKeyObj());
			}

			if (pyrotechnicCompetencyForm != null) {
				session.delete(pyrotechnicCompetencyForm);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (pyrotechnicCompetencyForm != null) {
			clearCache(pyrotechnicCompetencyForm);
		}

		return pyrotechnicCompetencyForm;
	}

	@Override
	public PyrotechnicCompetencyForm updateImpl(
		PyrotechnicCompetencyForm pyrotechnicCompetencyForm) {

		boolean isNew = pyrotechnicCompetencyForm.isNew();

		if (!(pyrotechnicCompetencyForm instanceof
				PyrotechnicCompetencyFormModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(pyrotechnicCompetencyForm.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					pyrotechnicCompetencyForm);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in pyrotechnicCompetencyForm proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom PyrotechnicCompetencyForm implementation " +
					pyrotechnicCompetencyForm.getClass());
		}

		PyrotechnicCompetencyFormModelImpl pyrotechnicCompetencyFormModelImpl =
			(PyrotechnicCompetencyFormModelImpl)pyrotechnicCompetencyForm;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (pyrotechnicCompetencyForm.getCreateDate() == null)) {
			if (serviceContext == null) {
				pyrotechnicCompetencyForm.setCreateDate(date);
			}
			else {
				pyrotechnicCompetencyForm.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!pyrotechnicCompetencyFormModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				pyrotechnicCompetencyForm.setModifiedDate(date);
			}
			else {
				pyrotechnicCompetencyForm.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(pyrotechnicCompetencyForm);
			}
			else {
				pyrotechnicCompetencyForm =
					(PyrotechnicCompetencyForm)session.merge(
						pyrotechnicCompetencyForm);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			PyrotechnicCompetencyFormImpl.class,
			pyrotechnicCompetencyFormModelImpl, false, true);

		cacheUniqueFindersCache(pyrotechnicCompetencyFormModelImpl);

		if (isNew) {
			pyrotechnicCompetencyForm.setNew(false);
		}

		pyrotechnicCompetencyForm.resetOriginalValues();

		return pyrotechnicCompetencyForm;
	}

	/**
	 * Returns the pyrotechnic competency form with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the pyrotechnic competency form
	 * @return the pyrotechnic competency form
	 * @throws NoSuchPyrotechnicCompetencyFormException if a pyrotechnic competency form with the primary key could not be found
	 */
	@Override
	public PyrotechnicCompetencyForm findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPyrotechnicCompetencyFormException {

		PyrotechnicCompetencyForm pyrotechnicCompetencyForm = fetchByPrimaryKey(
			primaryKey);

		if (pyrotechnicCompetencyForm == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPyrotechnicCompetencyFormException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return pyrotechnicCompetencyForm;
	}

	/**
	 * Returns the pyrotechnic competency form with the primary key or throws a <code>NoSuchPyrotechnicCompetencyFormException</code> if it could not be found.
	 *
	 * @param pyrotechnicCompetencyFormId the primary key of the pyrotechnic competency form
	 * @return the pyrotechnic competency form
	 * @throws NoSuchPyrotechnicCompetencyFormException if a pyrotechnic competency form with the primary key could not be found
	 */
	@Override
	public PyrotechnicCompetencyForm findByPrimaryKey(
			long pyrotechnicCompetencyFormId)
		throws NoSuchPyrotechnicCompetencyFormException {

		return findByPrimaryKey((Serializable)pyrotechnicCompetencyFormId);
	}

	/**
	 * Returns the pyrotechnic competency form with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pyrotechnicCompetencyFormId the primary key of the pyrotechnic competency form
	 * @return the pyrotechnic competency form, or <code>null</code> if a pyrotechnic competency form with the primary key could not be found
	 */
	@Override
	public PyrotechnicCompetencyForm fetchByPrimaryKey(
		long pyrotechnicCompetencyFormId) {

		return fetchByPrimaryKey((Serializable)pyrotechnicCompetencyFormId);
	}

	/**
	 * Returns all the pyrotechnic competency forms.
	 *
	 * @return the pyrotechnic competency forms
	 */
	@Override
	public List<PyrotechnicCompetencyForm> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pyrotechnic competency forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PyrotechnicCompetencyFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pyrotechnic competency forms
	 * @param end the upper bound of the range of pyrotechnic competency forms (not inclusive)
	 * @return the range of pyrotechnic competency forms
	 */
	@Override
	public List<PyrotechnicCompetencyForm> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the pyrotechnic competency forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PyrotechnicCompetencyFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pyrotechnic competency forms
	 * @param end the upper bound of the range of pyrotechnic competency forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pyrotechnic competency forms
	 */
	@Override
	public List<PyrotechnicCompetencyForm> findAll(
		int start, int end,
		OrderByComparator<PyrotechnicCompetencyForm> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the pyrotechnic competency forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PyrotechnicCompetencyFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pyrotechnic competency forms
	 * @param end the upper bound of the range of pyrotechnic competency forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pyrotechnic competency forms
	 */
	@Override
	public List<PyrotechnicCompetencyForm> findAll(
		int start, int end,
		OrderByComparator<PyrotechnicCompetencyForm> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<PyrotechnicCompetencyForm> list = null;

		if (useFinderCache) {
			list = (List<PyrotechnicCompetencyForm>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PYROTECHNICCOMPETENCYFORM);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PYROTECHNICCOMPETENCYFORM;

				sql = sql.concat(
					PyrotechnicCompetencyFormModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<PyrotechnicCompetencyForm>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the pyrotechnic competency forms from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (PyrotechnicCompetencyForm pyrotechnicCompetencyForm : findAll()) {
			remove(pyrotechnicCompetencyForm);
		}
	}

	/**
	 * Returns the number of pyrotechnic competency forms.
	 *
	 * @return the number of pyrotechnic competency forms
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_PYROTECHNICCOMPETENCYFORM);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "pyrotechnicCompetencyFormId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PYROTECHNICCOMPETENCYFORM;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PyrotechnicCompetencyFormModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the pyrotechnic competency form persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathFetchBygetExplosiveById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetExplosiveById",
			new String[] {Long.class.getName()},
			new String[] {"explosivesApplicationId"}, true);

		_finderPathCountBygetExplosiveById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetExplosiveById", new String[] {Long.class.getName()},
			new String[] {"explosivesApplicationId"}, false);

		PyrotechnicCompetencyFormUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		PyrotechnicCompetencyFormUtil.setPersistence(null);

		entityCache.removeCache(PyrotechnicCompetencyFormImpl.class.getName());
	}

	@Override
	@Reference(
		target = EXPLOSIVEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = EXPLOSIVEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = EXPLOSIVEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_PYROTECHNICCOMPETENCYFORM =
		"SELECT pyrotechnicCompetencyForm FROM PyrotechnicCompetencyForm pyrotechnicCompetencyForm";

	private static final String _SQL_SELECT_PYROTECHNICCOMPETENCYFORM_WHERE =
		"SELECT pyrotechnicCompetencyForm FROM PyrotechnicCompetencyForm pyrotechnicCompetencyForm WHERE ";

	private static final String _SQL_COUNT_PYROTECHNICCOMPETENCYFORM =
		"SELECT COUNT(pyrotechnicCompetencyForm) FROM PyrotechnicCompetencyForm pyrotechnicCompetencyForm";

	private static final String _SQL_COUNT_PYROTECHNICCOMPETENCYFORM_WHERE =
		"SELECT COUNT(pyrotechnicCompetencyForm) FROM PyrotechnicCompetencyForm pyrotechnicCompetencyForm WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"pyrotechnicCompetencyForm.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No PyrotechnicCompetencyForm exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No PyrotechnicCompetencyForm exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		PyrotechnicCompetencyFormPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}