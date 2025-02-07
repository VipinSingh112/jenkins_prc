/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service.persistence.impl;

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

import com.nbp.pharmaceutical.application.form.service.exception.NoSuchPharmaCancellationFormException;
import com.nbp.pharmaceutical.application.form.service.model.PharmaCancellationForm;
import com.nbp.pharmaceutical.application.form.service.model.PharmaCancellationFormTable;
import com.nbp.pharmaceutical.application.form.service.model.impl.PharmaCancellationFormImpl;
import com.nbp.pharmaceutical.application.form.service.model.impl.PharmaCancellationFormModelImpl;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaCancellationFormPersistence;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaCancellationFormUtil;
import com.nbp.pharmaceutical.application.form.service.service.persistence.impl.constants.PHARMACEUTICALPersistenceConstants;

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
 * The persistence implementation for the pharma cancellation form service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = PharmaCancellationFormPersistence.class)
public class PharmaCancellationFormPersistenceImpl
	extends BasePersistenceImpl<PharmaCancellationForm>
	implements PharmaCancellationFormPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PharmaCancellationFormUtil</code> to access the pharma cancellation form persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PharmaCancellationFormImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetCancelById;
	private FinderPath _finderPathCountBygetCancelById;

	/**
	 * Returns the pharma cancellation form where pharmaApplicationId = &#63; or throws a <code>NoSuchPharmaCancellationFormException</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma cancellation form
	 * @throws NoSuchPharmaCancellationFormException if a matching pharma cancellation form could not be found
	 */
	@Override
	public PharmaCancellationForm findBygetCancelById(long pharmaApplicationId)
		throws NoSuchPharmaCancellationFormException {

		PharmaCancellationForm pharmaCancellationForm = fetchBygetCancelById(
			pharmaApplicationId);

		if (pharmaCancellationForm == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("pharmaApplicationId=");
			sb.append(pharmaApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchPharmaCancellationFormException(sb.toString());
		}

		return pharmaCancellationForm;
	}

	/**
	 * Returns the pharma cancellation form where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma cancellation form, or <code>null</code> if a matching pharma cancellation form could not be found
	 */
	@Override
	public PharmaCancellationForm fetchBygetCancelById(
		long pharmaApplicationId) {

		return fetchBygetCancelById(pharmaApplicationId, true);
	}

	/**
	 * Returns the pharma cancellation form where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma cancellation form, or <code>null</code> if a matching pharma cancellation form could not be found
	 */
	@Override
	public PharmaCancellationForm fetchBygetCancelById(
		long pharmaApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {pharmaApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetCancelById, finderArgs, this);
		}

		if (result instanceof PharmaCancellationForm) {
			PharmaCancellationForm pharmaCancellationForm =
				(PharmaCancellationForm)result;

			if (pharmaApplicationId !=
					pharmaCancellationForm.getPharmaApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_PHARMACANCELLATIONFORM_WHERE);

			sb.append(_FINDER_COLUMN_GETCANCELBYID_PHARMAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(pharmaApplicationId);

				List<PharmaCancellationForm> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCancelById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {pharmaApplicationId};
							}

							_log.warn(
								"PharmaCancellationFormPersistenceImpl.fetchBygetCancelById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					PharmaCancellationForm pharmaCancellationForm = list.get(0);

					result = pharmaCancellationForm;

					cacheResult(pharmaCancellationForm);
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
			return (PharmaCancellationForm)result;
		}
	}

	/**
	 * Removes the pharma cancellation form where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the pharma cancellation form that was removed
	 */
	@Override
	public PharmaCancellationForm removeBygetCancelById(
			long pharmaApplicationId)
		throws NoSuchPharmaCancellationFormException {

		PharmaCancellationForm pharmaCancellationForm = findBygetCancelById(
			pharmaApplicationId);

		return remove(pharmaCancellationForm);
	}

	/**
	 * Returns the number of pharma cancellation forms where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma cancellation forms
	 */
	@Override
	public int countBygetCancelById(long pharmaApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCancelById;

		Object[] finderArgs = new Object[] {pharmaApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PHARMACANCELLATIONFORM_WHERE);

			sb.append(_FINDER_COLUMN_GETCANCELBYID_PHARMAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(pharmaApplicationId);

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
		_FINDER_COLUMN_GETCANCELBYID_PHARMAAPPLICATIONID_2 =
			"pharmaCancellationForm.pharmaApplicationId = ?";

	public PharmaCancellationFormPersistenceImpl() {
		setModelClass(PharmaCancellationForm.class);

		setModelImplClass(PharmaCancellationFormImpl.class);
		setModelPKClass(long.class);

		setTable(PharmaCancellationFormTable.INSTANCE);
	}

	/**
	 * Caches the pharma cancellation form in the entity cache if it is enabled.
	 *
	 * @param pharmaCancellationForm the pharma cancellation form
	 */
	@Override
	public void cacheResult(PharmaCancellationForm pharmaCancellationForm) {
		entityCache.putResult(
			PharmaCancellationFormImpl.class,
			pharmaCancellationForm.getPrimaryKey(), pharmaCancellationForm);

		finderCache.putResult(
			_finderPathFetchBygetCancelById,
			new Object[] {pharmaCancellationForm.getPharmaApplicationId()},
			pharmaCancellationForm);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the pharma cancellation forms in the entity cache if it is enabled.
	 *
	 * @param pharmaCancellationForms the pharma cancellation forms
	 */
	@Override
	public void cacheResult(
		List<PharmaCancellationForm> pharmaCancellationForms) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (pharmaCancellationForms.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (PharmaCancellationForm pharmaCancellationForm :
				pharmaCancellationForms) {

			if (entityCache.getResult(
					PharmaCancellationFormImpl.class,
					pharmaCancellationForm.getPrimaryKey()) == null) {

				cacheResult(pharmaCancellationForm);
			}
		}
	}

	/**
	 * Clears the cache for all pharma cancellation forms.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PharmaCancellationFormImpl.class);

		finderCache.clearCache(PharmaCancellationFormImpl.class);
	}

	/**
	 * Clears the cache for the pharma cancellation form.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PharmaCancellationForm pharmaCancellationForm) {
		entityCache.removeResult(
			PharmaCancellationFormImpl.class, pharmaCancellationForm);
	}

	@Override
	public void clearCache(
		List<PharmaCancellationForm> pharmaCancellationForms) {

		for (PharmaCancellationForm pharmaCancellationForm :
				pharmaCancellationForms) {

			entityCache.removeResult(
				PharmaCancellationFormImpl.class, pharmaCancellationForm);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(PharmaCancellationFormImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				PharmaCancellationFormImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		PharmaCancellationFormModelImpl pharmaCancellationFormModelImpl) {

		Object[] args = new Object[] {
			pharmaCancellationFormModelImpl.getPharmaApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetCancelById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCancelById, args,
			pharmaCancellationFormModelImpl);
	}

	/**
	 * Creates a new pharma cancellation form with the primary key. Does not add the pharma cancellation form to the database.
	 *
	 * @param pharmaCancellationFormId the primary key for the new pharma cancellation form
	 * @return the new pharma cancellation form
	 */
	@Override
	public PharmaCancellationForm create(long pharmaCancellationFormId) {
		PharmaCancellationForm pharmaCancellationForm =
			new PharmaCancellationFormImpl();

		pharmaCancellationForm.setNew(true);
		pharmaCancellationForm.setPrimaryKey(pharmaCancellationFormId);

		pharmaCancellationForm.setCompanyId(CompanyThreadLocal.getCompanyId());

		return pharmaCancellationForm;
	}

	/**
	 * Removes the pharma cancellation form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaCancellationFormId the primary key of the pharma cancellation form
	 * @return the pharma cancellation form that was removed
	 * @throws NoSuchPharmaCancellationFormException if a pharma cancellation form with the primary key could not be found
	 */
	@Override
	public PharmaCancellationForm remove(long pharmaCancellationFormId)
		throws NoSuchPharmaCancellationFormException {

		return remove((Serializable)pharmaCancellationFormId);
	}

	/**
	 * Removes the pharma cancellation form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the pharma cancellation form
	 * @return the pharma cancellation form that was removed
	 * @throws NoSuchPharmaCancellationFormException if a pharma cancellation form with the primary key could not be found
	 */
	@Override
	public PharmaCancellationForm remove(Serializable primaryKey)
		throws NoSuchPharmaCancellationFormException {

		Session session = null;

		try {
			session = openSession();

			PharmaCancellationForm pharmaCancellationForm =
				(PharmaCancellationForm)session.get(
					PharmaCancellationFormImpl.class, primaryKey);

			if (pharmaCancellationForm == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPharmaCancellationFormException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(pharmaCancellationForm);
		}
		catch (NoSuchPharmaCancellationFormException noSuchEntityException) {
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
	protected PharmaCancellationForm removeImpl(
		PharmaCancellationForm pharmaCancellationForm) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(pharmaCancellationForm)) {
				pharmaCancellationForm = (PharmaCancellationForm)session.get(
					PharmaCancellationFormImpl.class,
					pharmaCancellationForm.getPrimaryKeyObj());
			}

			if (pharmaCancellationForm != null) {
				session.delete(pharmaCancellationForm);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (pharmaCancellationForm != null) {
			clearCache(pharmaCancellationForm);
		}

		return pharmaCancellationForm;
	}

	@Override
	public PharmaCancellationForm updateImpl(
		PharmaCancellationForm pharmaCancellationForm) {

		boolean isNew = pharmaCancellationForm.isNew();

		if (!(pharmaCancellationForm instanceof
				PharmaCancellationFormModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(pharmaCancellationForm.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					pharmaCancellationForm);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in pharmaCancellationForm proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom PharmaCancellationForm implementation " +
					pharmaCancellationForm.getClass());
		}

		PharmaCancellationFormModelImpl pharmaCancellationFormModelImpl =
			(PharmaCancellationFormModelImpl)pharmaCancellationForm;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (pharmaCancellationForm.getCreateDate() == null)) {
			if (serviceContext == null) {
				pharmaCancellationForm.setCreateDate(date);
			}
			else {
				pharmaCancellationForm.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!pharmaCancellationFormModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				pharmaCancellationForm.setModifiedDate(date);
			}
			else {
				pharmaCancellationForm.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(pharmaCancellationForm);
			}
			else {
				pharmaCancellationForm = (PharmaCancellationForm)session.merge(
					pharmaCancellationForm);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			PharmaCancellationFormImpl.class, pharmaCancellationFormModelImpl,
			false, true);

		cacheUniqueFindersCache(pharmaCancellationFormModelImpl);

		if (isNew) {
			pharmaCancellationForm.setNew(false);
		}

		pharmaCancellationForm.resetOriginalValues();

		return pharmaCancellationForm;
	}

	/**
	 * Returns the pharma cancellation form with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the pharma cancellation form
	 * @return the pharma cancellation form
	 * @throws NoSuchPharmaCancellationFormException if a pharma cancellation form with the primary key could not be found
	 */
	@Override
	public PharmaCancellationForm findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPharmaCancellationFormException {

		PharmaCancellationForm pharmaCancellationForm = fetchByPrimaryKey(
			primaryKey);

		if (pharmaCancellationForm == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPharmaCancellationFormException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return pharmaCancellationForm;
	}

	/**
	 * Returns the pharma cancellation form with the primary key or throws a <code>NoSuchPharmaCancellationFormException</code> if it could not be found.
	 *
	 * @param pharmaCancellationFormId the primary key of the pharma cancellation form
	 * @return the pharma cancellation form
	 * @throws NoSuchPharmaCancellationFormException if a pharma cancellation form with the primary key could not be found
	 */
	@Override
	public PharmaCancellationForm findByPrimaryKey(
			long pharmaCancellationFormId)
		throws NoSuchPharmaCancellationFormException {

		return findByPrimaryKey((Serializable)pharmaCancellationFormId);
	}

	/**
	 * Returns the pharma cancellation form with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaCancellationFormId the primary key of the pharma cancellation form
	 * @return the pharma cancellation form, or <code>null</code> if a pharma cancellation form with the primary key could not be found
	 */
	@Override
	public PharmaCancellationForm fetchByPrimaryKey(
		long pharmaCancellationFormId) {

		return fetchByPrimaryKey((Serializable)pharmaCancellationFormId);
	}

	/**
	 * Returns all the pharma cancellation forms.
	 *
	 * @return the pharma cancellation forms
	 */
	@Override
	public List<PharmaCancellationForm> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pharma cancellation forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaCancellationFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma cancellation forms
	 * @param end the upper bound of the range of pharma cancellation forms (not inclusive)
	 * @return the range of pharma cancellation forms
	 */
	@Override
	public List<PharmaCancellationForm> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the pharma cancellation forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaCancellationFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma cancellation forms
	 * @param end the upper bound of the range of pharma cancellation forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma cancellation forms
	 */
	@Override
	public List<PharmaCancellationForm> findAll(
		int start, int end,
		OrderByComparator<PharmaCancellationForm> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the pharma cancellation forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaCancellationFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma cancellation forms
	 * @param end the upper bound of the range of pharma cancellation forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma cancellation forms
	 */
	@Override
	public List<PharmaCancellationForm> findAll(
		int start, int end,
		OrderByComparator<PharmaCancellationForm> orderByComparator,
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

		List<PharmaCancellationForm> list = null;

		if (useFinderCache) {
			list = (List<PharmaCancellationForm>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PHARMACANCELLATIONFORM);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PHARMACANCELLATIONFORM;

				sql = sql.concat(PharmaCancellationFormModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<PharmaCancellationForm>)QueryUtil.list(
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
	 * Removes all the pharma cancellation forms from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (PharmaCancellationForm pharmaCancellationForm : findAll()) {
			remove(pharmaCancellationForm);
		}
	}

	/**
	 * Returns the number of pharma cancellation forms.
	 *
	 * @return the number of pharma cancellation forms
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
					_SQL_COUNT_PHARMACANCELLATIONFORM);

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
		return "pharmaCancellationFormId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PHARMACANCELLATIONFORM;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PharmaCancellationFormModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the pharma cancellation form persistence.
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

		_finderPathFetchBygetCancelById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCancelById",
			new String[] {Long.class.getName()},
			new String[] {"pharmaApplicationId"}, true);

		_finderPathCountBygetCancelById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCancelById",
			new String[] {Long.class.getName()},
			new String[] {"pharmaApplicationId"}, false);

		PharmaCancellationFormUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		PharmaCancellationFormUtil.setPersistence(null);

		entityCache.removeCache(PharmaCancellationFormImpl.class.getName());
	}

	@Override
	@Reference(
		target = PHARMACEUTICALPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = PHARMACEUTICALPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = PHARMACEUTICALPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_PHARMACANCELLATIONFORM =
		"SELECT pharmaCancellationForm FROM PharmaCancellationForm pharmaCancellationForm";

	private static final String _SQL_SELECT_PHARMACANCELLATIONFORM_WHERE =
		"SELECT pharmaCancellationForm FROM PharmaCancellationForm pharmaCancellationForm WHERE ";

	private static final String _SQL_COUNT_PHARMACANCELLATIONFORM =
		"SELECT COUNT(pharmaCancellationForm) FROM PharmaCancellationForm pharmaCancellationForm";

	private static final String _SQL_COUNT_PHARMACANCELLATIONFORM_WHERE =
		"SELECT COUNT(pharmaCancellationForm) FROM PharmaCancellationForm pharmaCancellationForm WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"pharmaCancellationForm.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No PharmaCancellationForm exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No PharmaCancellationForm exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		PharmaCancellationFormPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}