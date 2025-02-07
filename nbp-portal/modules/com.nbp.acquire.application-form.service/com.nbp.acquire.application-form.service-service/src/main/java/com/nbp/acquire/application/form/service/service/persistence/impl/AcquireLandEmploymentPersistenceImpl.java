/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service.persistence.impl;

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

import com.nbp.acquire.application.form.service.exception.NoSuchAcquireLandEmploymentException;
import com.nbp.acquire.application.form.service.model.AcquireLandEmployment;
import com.nbp.acquire.application.form.service.model.AcquireLandEmploymentTable;
import com.nbp.acquire.application.form.service.model.impl.AcquireLandEmploymentImpl;
import com.nbp.acquire.application.form.service.model.impl.AcquireLandEmploymentModelImpl;
import com.nbp.acquire.application.form.service.service.persistence.AcquireLandEmploymentPersistence;
import com.nbp.acquire.application.form.service.service.persistence.AcquireLandEmploymentUtil;
import com.nbp.acquire.application.form.service.service.persistence.impl.constants.ACQUIREPersistenceConstants;

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
 * The persistence implementation for the acquire land employment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AcquireLandEmploymentPersistence.class)
public class AcquireLandEmploymentPersistenceImpl
	extends BasePersistenceImpl<AcquireLandEmployment>
	implements AcquireLandEmploymentPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AcquireLandEmploymentUtil</code> to access the acquire land employment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AcquireLandEmploymentImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetAcquireById;
	private FinderPath _finderPathCountBygetAcquireById;

	/**
	 * Returns the acquire land employment where acquireApplicationId = &#63; or throws a <code>NoSuchAcquireLandEmploymentException</code> if it could not be found.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire land employment
	 * @throws NoSuchAcquireLandEmploymentException if a matching acquire land employment could not be found
	 */
	@Override
	public AcquireLandEmployment findBygetAcquireById(long acquireApplicationId)
		throws NoSuchAcquireLandEmploymentException {

		AcquireLandEmployment acquireLandEmployment = fetchBygetAcquireById(
			acquireApplicationId);

		if (acquireLandEmployment == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("acquireApplicationId=");
			sb.append(acquireApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAcquireLandEmploymentException(sb.toString());
		}

		return acquireLandEmployment;
	}

	/**
	 * Returns the acquire land employment where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire land employment, or <code>null</code> if a matching acquire land employment could not be found
	 */
	@Override
	public AcquireLandEmployment fetchBygetAcquireById(
		long acquireApplicationId) {

		return fetchBygetAcquireById(acquireApplicationId, true);
	}

	/**
	 * Returns the acquire land employment where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire land employment, or <code>null</code> if a matching acquire land employment could not be found
	 */
	@Override
	public AcquireLandEmployment fetchBygetAcquireById(
		long acquireApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {acquireApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetAcquireById, finderArgs, this);
		}

		if (result instanceof AcquireLandEmployment) {
			AcquireLandEmployment acquireLandEmployment =
				(AcquireLandEmployment)result;

			if (acquireApplicationId !=
					acquireLandEmployment.getAcquireApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ACQUIRELANDEMPLOYMENT_WHERE);

			sb.append(_FINDER_COLUMN_GETACQUIREBYID_ACQUIREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(acquireApplicationId);

				List<AcquireLandEmployment> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetAcquireById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									acquireApplicationId
								};
							}

							_log.warn(
								"AcquireLandEmploymentPersistenceImpl.fetchBygetAcquireById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AcquireLandEmployment acquireLandEmployment = list.get(0);

					result = acquireLandEmployment;

					cacheResult(acquireLandEmployment);
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
			return (AcquireLandEmployment)result;
		}
	}

	/**
	 * Removes the acquire land employment where acquireApplicationId = &#63; from the database.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the acquire land employment that was removed
	 */
	@Override
	public AcquireLandEmployment removeBygetAcquireById(
			long acquireApplicationId)
		throws NoSuchAcquireLandEmploymentException {

		AcquireLandEmployment acquireLandEmployment = findBygetAcquireById(
			acquireApplicationId);

		return remove(acquireLandEmployment);
	}

	/**
	 * Returns the number of acquire land employments where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the number of matching acquire land employments
	 */
	@Override
	public int countBygetAcquireById(long acquireApplicationId) {
		FinderPath finderPath = _finderPathCountBygetAcquireById;

		Object[] finderArgs = new Object[] {acquireApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACQUIRELANDEMPLOYMENT_WHERE);

			sb.append(_FINDER_COLUMN_GETACQUIREBYID_ACQUIREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(acquireApplicationId);

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
		_FINDER_COLUMN_GETACQUIREBYID_ACQUIREAPPLICATIONID_2 =
			"acquireLandEmployment.acquireApplicationId = ?";

	public AcquireLandEmploymentPersistenceImpl() {
		setModelClass(AcquireLandEmployment.class);

		setModelImplClass(AcquireLandEmploymentImpl.class);
		setModelPKClass(long.class);

		setTable(AcquireLandEmploymentTable.INSTANCE);
	}

	/**
	 * Caches the acquire land employment in the entity cache if it is enabled.
	 *
	 * @param acquireLandEmployment the acquire land employment
	 */
	@Override
	public void cacheResult(AcquireLandEmployment acquireLandEmployment) {
		entityCache.putResult(
			AcquireLandEmploymentImpl.class,
			acquireLandEmployment.getPrimaryKey(), acquireLandEmployment);

		finderCache.putResult(
			_finderPathFetchBygetAcquireById,
			new Object[] {acquireLandEmployment.getAcquireApplicationId()},
			acquireLandEmployment);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the acquire land employments in the entity cache if it is enabled.
	 *
	 * @param acquireLandEmployments the acquire land employments
	 */
	@Override
	public void cacheResult(
		List<AcquireLandEmployment> acquireLandEmployments) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (acquireLandEmployments.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AcquireLandEmployment acquireLandEmployment :
				acquireLandEmployments) {

			if (entityCache.getResult(
					AcquireLandEmploymentImpl.class,
					acquireLandEmployment.getPrimaryKey()) == null) {

				cacheResult(acquireLandEmployment);
			}
		}
	}

	/**
	 * Clears the cache for all acquire land employments.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AcquireLandEmploymentImpl.class);

		finderCache.clearCache(AcquireLandEmploymentImpl.class);
	}

	/**
	 * Clears the cache for the acquire land employment.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AcquireLandEmployment acquireLandEmployment) {
		entityCache.removeResult(
			AcquireLandEmploymentImpl.class, acquireLandEmployment);
	}

	@Override
	public void clearCache(List<AcquireLandEmployment> acquireLandEmployments) {
		for (AcquireLandEmployment acquireLandEmployment :
				acquireLandEmployments) {

			entityCache.removeResult(
				AcquireLandEmploymentImpl.class, acquireLandEmployment);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AcquireLandEmploymentImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AcquireLandEmploymentImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AcquireLandEmploymentModelImpl acquireLandEmploymentModelImpl) {

		Object[] args = new Object[] {
			acquireLandEmploymentModelImpl.getAcquireApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetAcquireById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAcquireById, args,
			acquireLandEmploymentModelImpl);
	}

	/**
	 * Creates a new acquire land employment with the primary key. Does not add the acquire land employment to the database.
	 *
	 * @param acquireLandEmploymentId the primary key for the new acquire land employment
	 * @return the new acquire land employment
	 */
	@Override
	public AcquireLandEmployment create(long acquireLandEmploymentId) {
		AcquireLandEmployment acquireLandEmployment =
			new AcquireLandEmploymentImpl();

		acquireLandEmployment.setNew(true);
		acquireLandEmployment.setPrimaryKey(acquireLandEmploymentId);

		acquireLandEmployment.setCompanyId(CompanyThreadLocal.getCompanyId());

		return acquireLandEmployment;
	}

	/**
	 * Removes the acquire land employment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireLandEmploymentId the primary key of the acquire land employment
	 * @return the acquire land employment that was removed
	 * @throws NoSuchAcquireLandEmploymentException if a acquire land employment with the primary key could not be found
	 */
	@Override
	public AcquireLandEmployment remove(long acquireLandEmploymentId)
		throws NoSuchAcquireLandEmploymentException {

		return remove((Serializable)acquireLandEmploymentId);
	}

	/**
	 * Removes the acquire land employment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the acquire land employment
	 * @return the acquire land employment that was removed
	 * @throws NoSuchAcquireLandEmploymentException if a acquire land employment with the primary key could not be found
	 */
	@Override
	public AcquireLandEmployment remove(Serializable primaryKey)
		throws NoSuchAcquireLandEmploymentException {

		Session session = null;

		try {
			session = openSession();

			AcquireLandEmployment acquireLandEmployment =
				(AcquireLandEmployment)session.get(
					AcquireLandEmploymentImpl.class, primaryKey);

			if (acquireLandEmployment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAcquireLandEmploymentException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(acquireLandEmployment);
		}
		catch (NoSuchAcquireLandEmploymentException noSuchEntityException) {
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
	protected AcquireLandEmployment removeImpl(
		AcquireLandEmployment acquireLandEmployment) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(acquireLandEmployment)) {
				acquireLandEmployment = (AcquireLandEmployment)session.get(
					AcquireLandEmploymentImpl.class,
					acquireLandEmployment.getPrimaryKeyObj());
			}

			if (acquireLandEmployment != null) {
				session.delete(acquireLandEmployment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (acquireLandEmployment != null) {
			clearCache(acquireLandEmployment);
		}

		return acquireLandEmployment;
	}

	@Override
	public AcquireLandEmployment updateImpl(
		AcquireLandEmployment acquireLandEmployment) {

		boolean isNew = acquireLandEmployment.isNew();

		if (!(acquireLandEmployment instanceof
				AcquireLandEmploymentModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(acquireLandEmployment.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					acquireLandEmployment);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in acquireLandEmployment proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AcquireLandEmployment implementation " +
					acquireLandEmployment.getClass());
		}

		AcquireLandEmploymentModelImpl acquireLandEmploymentModelImpl =
			(AcquireLandEmploymentModelImpl)acquireLandEmployment;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (acquireLandEmployment.getCreateDate() == null)) {
			if (serviceContext == null) {
				acquireLandEmployment.setCreateDate(date);
			}
			else {
				acquireLandEmployment.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!acquireLandEmploymentModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				acquireLandEmployment.setModifiedDate(date);
			}
			else {
				acquireLandEmployment.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(acquireLandEmployment);
			}
			else {
				acquireLandEmployment = (AcquireLandEmployment)session.merge(
					acquireLandEmployment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AcquireLandEmploymentImpl.class, acquireLandEmploymentModelImpl,
			false, true);

		cacheUniqueFindersCache(acquireLandEmploymentModelImpl);

		if (isNew) {
			acquireLandEmployment.setNew(false);
		}

		acquireLandEmployment.resetOriginalValues();

		return acquireLandEmployment;
	}

	/**
	 * Returns the acquire land employment with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the acquire land employment
	 * @return the acquire land employment
	 * @throws NoSuchAcquireLandEmploymentException if a acquire land employment with the primary key could not be found
	 */
	@Override
	public AcquireLandEmployment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAcquireLandEmploymentException {

		AcquireLandEmployment acquireLandEmployment = fetchByPrimaryKey(
			primaryKey);

		if (acquireLandEmployment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAcquireLandEmploymentException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return acquireLandEmployment;
	}

	/**
	 * Returns the acquire land employment with the primary key or throws a <code>NoSuchAcquireLandEmploymentException</code> if it could not be found.
	 *
	 * @param acquireLandEmploymentId the primary key of the acquire land employment
	 * @return the acquire land employment
	 * @throws NoSuchAcquireLandEmploymentException if a acquire land employment with the primary key could not be found
	 */
	@Override
	public AcquireLandEmployment findByPrimaryKey(long acquireLandEmploymentId)
		throws NoSuchAcquireLandEmploymentException {

		return findByPrimaryKey((Serializable)acquireLandEmploymentId);
	}

	/**
	 * Returns the acquire land employment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireLandEmploymentId the primary key of the acquire land employment
	 * @return the acquire land employment, or <code>null</code> if a acquire land employment with the primary key could not be found
	 */
	@Override
	public AcquireLandEmployment fetchByPrimaryKey(
		long acquireLandEmploymentId) {

		return fetchByPrimaryKey((Serializable)acquireLandEmploymentId);
	}

	/**
	 * Returns all the acquire land employments.
	 *
	 * @return the acquire land employments
	 */
	@Override
	public List<AcquireLandEmployment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acquire land employments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireLandEmploymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire land employments
	 * @param end the upper bound of the range of acquire land employments (not inclusive)
	 * @return the range of acquire land employments
	 */
	@Override
	public List<AcquireLandEmployment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the acquire land employments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireLandEmploymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire land employments
	 * @param end the upper bound of the range of acquire land employments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire land employments
	 */
	@Override
	public List<AcquireLandEmployment> findAll(
		int start, int end,
		OrderByComparator<AcquireLandEmployment> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acquire land employments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireLandEmploymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire land employments
	 * @param end the upper bound of the range of acquire land employments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire land employments
	 */
	@Override
	public List<AcquireLandEmployment> findAll(
		int start, int end,
		OrderByComparator<AcquireLandEmployment> orderByComparator,
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

		List<AcquireLandEmployment> list = null;

		if (useFinderCache) {
			list = (List<AcquireLandEmployment>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ACQUIRELANDEMPLOYMENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ACQUIRELANDEMPLOYMENT;

				sql = sql.concat(AcquireLandEmploymentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AcquireLandEmployment>)QueryUtil.list(
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
	 * Removes all the acquire land employments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AcquireLandEmployment acquireLandEmployment : findAll()) {
			remove(acquireLandEmployment);
		}
	}

	/**
	 * Returns the number of acquire land employments.
	 *
	 * @return the number of acquire land employments
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
					_SQL_COUNT_ACQUIRELANDEMPLOYMENT);

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
		return "acquireLandEmploymentId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ACQUIRELANDEMPLOYMENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AcquireLandEmploymentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the acquire land employment persistence.
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

		_finderPathFetchBygetAcquireById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetAcquireById",
			new String[] {Long.class.getName()},
			new String[] {"acquireApplicationId"}, true);

		_finderPathCountBygetAcquireById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetAcquireById",
			new String[] {Long.class.getName()},
			new String[] {"acquireApplicationId"}, false);

		AcquireLandEmploymentUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AcquireLandEmploymentUtil.setPersistence(null);

		entityCache.removeCache(AcquireLandEmploymentImpl.class.getName());
	}

	@Override
	@Reference(
		target = ACQUIREPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = ACQUIREPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = ACQUIREPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ACQUIRELANDEMPLOYMENT =
		"SELECT acquireLandEmployment FROM AcquireLandEmployment acquireLandEmployment";

	private static final String _SQL_SELECT_ACQUIRELANDEMPLOYMENT_WHERE =
		"SELECT acquireLandEmployment FROM AcquireLandEmployment acquireLandEmployment WHERE ";

	private static final String _SQL_COUNT_ACQUIRELANDEMPLOYMENT =
		"SELECT COUNT(acquireLandEmployment) FROM AcquireLandEmployment acquireLandEmployment";

	private static final String _SQL_COUNT_ACQUIRELANDEMPLOYMENT_WHERE =
		"SELECT COUNT(acquireLandEmployment) FROM AcquireLandEmployment acquireLandEmployment WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"acquireLandEmployment.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AcquireLandEmployment exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AcquireLandEmployment exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AcquireLandEmploymentPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}