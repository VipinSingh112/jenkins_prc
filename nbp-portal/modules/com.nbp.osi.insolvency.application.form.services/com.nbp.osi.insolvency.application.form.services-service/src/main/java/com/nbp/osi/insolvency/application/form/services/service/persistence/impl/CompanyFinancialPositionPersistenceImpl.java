/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence.impl;

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

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchCompanyFinancialPositionException;
import com.nbp.osi.insolvency.application.form.services.model.CompanyFinancialPosition;
import com.nbp.osi.insolvency.application.form.services.model.CompanyFinancialPositionTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.CompanyFinancialPositionImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.CompanyFinancialPositionModelImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.CompanyFinancialPositionPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.CompanyFinancialPositionUtil;
import com.nbp.osi.insolvency.application.form.services.service.persistence.impl.constants.OSI_INSOLVENCYPersistenceConstants;

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
 * The persistence implementation for the company financial position service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CompanyFinancialPositionPersistence.class)
public class CompanyFinancialPositionPersistenceImpl
	extends BasePersistenceImpl<CompanyFinancialPosition>
	implements CompanyFinancialPositionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CompanyFinancialPositionUtil</code> to access the company financial position persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CompanyFinancialPositionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetOsiById;
	private FinderPath _finderPathCountBygetOsiById;

	/**
	 * Returns the company financial position where osiInsolvencyId = &#63; or throws a <code>NoSuchCompanyFinancialPositionException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching company financial position
	 * @throws NoSuchCompanyFinancialPositionException if a matching company financial position could not be found
	 */
	@Override
	public CompanyFinancialPosition findBygetOsiById(long osiInsolvencyId)
		throws NoSuchCompanyFinancialPositionException {

		CompanyFinancialPosition companyFinancialPosition = fetchBygetOsiById(
			osiInsolvencyId);

		if (companyFinancialPosition == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiInsolvencyId=");
			sb.append(osiInsolvencyId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCompanyFinancialPositionException(sb.toString());
		}

		return companyFinancialPosition;
	}

	/**
	 * Returns the company financial position where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching company financial position, or <code>null</code> if a matching company financial position could not be found
	 */
	@Override
	public CompanyFinancialPosition fetchBygetOsiById(long osiInsolvencyId) {
		return fetchBygetOsiById(osiInsolvencyId, true);
	}

	/**
	 * Returns the company financial position where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching company financial position, or <code>null</code> if a matching company financial position could not be found
	 */
	@Override
	public CompanyFinancialPosition fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {osiInsolvencyId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOsiById, finderArgs, this);
		}

		if (result instanceof CompanyFinancialPosition) {
			CompanyFinancialPosition companyFinancialPosition =
				(CompanyFinancialPosition)result;

			if (osiInsolvencyId !=
					companyFinancialPosition.getOsiInsolvencyId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_COMPANYFINANCIALPOSITION_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				List<CompanyFinancialPosition> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOsiById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {osiInsolvencyId};
							}

							_log.warn(
								"CompanyFinancialPositionPersistenceImpl.fetchBygetOsiById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CompanyFinancialPosition companyFinancialPosition =
						list.get(0);

					result = companyFinancialPosition;

					cacheResult(companyFinancialPosition);
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
			return (CompanyFinancialPosition)result;
		}
	}

	/**
	 * Removes the company financial position where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the company financial position that was removed
	 */
	@Override
	public CompanyFinancialPosition removeBygetOsiById(long osiInsolvencyId)
		throws NoSuchCompanyFinancialPositionException {

		CompanyFinancialPosition companyFinancialPosition = findBygetOsiById(
			osiInsolvencyId);

		return remove(companyFinancialPosition);
	}

	/**
	 * Returns the number of company financial positions where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching company financial positions
	 */
	@Override
	public int countBygetOsiById(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOsiById;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_COMPANYFINANCIALPOSITION_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

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

	private static final String _FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2 =
		"companyFinancialPosition.osiInsolvencyId = ?";

	public CompanyFinancialPositionPersistenceImpl() {
		setModelClass(CompanyFinancialPosition.class);

		setModelImplClass(CompanyFinancialPositionImpl.class);
		setModelPKClass(long.class);

		setTable(CompanyFinancialPositionTable.INSTANCE);
	}

	/**
	 * Caches the company financial position in the entity cache if it is enabled.
	 *
	 * @param companyFinancialPosition the company financial position
	 */
	@Override
	public void cacheResult(CompanyFinancialPosition companyFinancialPosition) {
		entityCache.putResult(
			CompanyFinancialPositionImpl.class,
			companyFinancialPosition.getPrimaryKey(), companyFinancialPosition);

		finderCache.putResult(
			_finderPathFetchBygetOsiById,
			new Object[] {companyFinancialPosition.getOsiInsolvencyId()},
			companyFinancialPosition);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the company financial positions in the entity cache if it is enabled.
	 *
	 * @param companyFinancialPositions the company financial positions
	 */
	@Override
	public void cacheResult(
		List<CompanyFinancialPosition> companyFinancialPositions) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (companyFinancialPositions.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CompanyFinancialPosition companyFinancialPosition :
				companyFinancialPositions) {

			if (entityCache.getResult(
					CompanyFinancialPositionImpl.class,
					companyFinancialPosition.getPrimaryKey()) == null) {

				cacheResult(companyFinancialPosition);
			}
		}
	}

	/**
	 * Clears the cache for all company financial positions.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CompanyFinancialPositionImpl.class);

		finderCache.clearCache(CompanyFinancialPositionImpl.class);
	}

	/**
	 * Clears the cache for the company financial position.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CompanyFinancialPosition companyFinancialPosition) {
		entityCache.removeResult(
			CompanyFinancialPositionImpl.class, companyFinancialPosition);
	}

	@Override
	public void clearCache(
		List<CompanyFinancialPosition> companyFinancialPositions) {

		for (CompanyFinancialPosition companyFinancialPosition :
				companyFinancialPositions) {

			entityCache.removeResult(
				CompanyFinancialPositionImpl.class, companyFinancialPosition);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CompanyFinancialPositionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CompanyFinancialPositionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CompanyFinancialPositionModelImpl companyFinancialPositionModelImpl) {

		Object[] args = new Object[] {
			companyFinancialPositionModelImpl.getOsiInsolvencyId()
		};

		finderCache.putResult(
			_finderPathCountBygetOsiById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiById, args,
			companyFinancialPositionModelImpl);
	}

	/**
	 * Creates a new company financial position with the primary key. Does not add the company financial position to the database.
	 *
	 * @param companyFinancialPositionId the primary key for the new company financial position
	 * @return the new company financial position
	 */
	@Override
	public CompanyFinancialPosition create(long companyFinancialPositionId) {
		CompanyFinancialPosition companyFinancialPosition =
			new CompanyFinancialPositionImpl();

		companyFinancialPosition.setNew(true);
		companyFinancialPosition.setPrimaryKey(companyFinancialPositionId);

		companyFinancialPosition.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return companyFinancialPosition;
	}

	/**
	 * Removes the company financial position with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param companyFinancialPositionId the primary key of the company financial position
	 * @return the company financial position that was removed
	 * @throws NoSuchCompanyFinancialPositionException if a company financial position with the primary key could not be found
	 */
	@Override
	public CompanyFinancialPosition remove(long companyFinancialPositionId)
		throws NoSuchCompanyFinancialPositionException {

		return remove((Serializable)companyFinancialPositionId);
	}

	/**
	 * Removes the company financial position with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the company financial position
	 * @return the company financial position that was removed
	 * @throws NoSuchCompanyFinancialPositionException if a company financial position with the primary key could not be found
	 */
	@Override
	public CompanyFinancialPosition remove(Serializable primaryKey)
		throws NoSuchCompanyFinancialPositionException {

		Session session = null;

		try {
			session = openSession();

			CompanyFinancialPosition companyFinancialPosition =
				(CompanyFinancialPosition)session.get(
					CompanyFinancialPositionImpl.class, primaryKey);

			if (companyFinancialPosition == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCompanyFinancialPositionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(companyFinancialPosition);
		}
		catch (NoSuchCompanyFinancialPositionException noSuchEntityException) {
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
	protected CompanyFinancialPosition removeImpl(
		CompanyFinancialPosition companyFinancialPosition) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(companyFinancialPosition)) {
				companyFinancialPosition =
					(CompanyFinancialPosition)session.get(
						CompanyFinancialPositionImpl.class,
						companyFinancialPosition.getPrimaryKeyObj());
			}

			if (companyFinancialPosition != null) {
				session.delete(companyFinancialPosition);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (companyFinancialPosition != null) {
			clearCache(companyFinancialPosition);
		}

		return companyFinancialPosition;
	}

	@Override
	public CompanyFinancialPosition updateImpl(
		CompanyFinancialPosition companyFinancialPosition) {

		boolean isNew = companyFinancialPosition.isNew();

		if (!(companyFinancialPosition instanceof
				CompanyFinancialPositionModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(companyFinancialPosition.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					companyFinancialPosition);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in companyFinancialPosition proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CompanyFinancialPosition implementation " +
					companyFinancialPosition.getClass());
		}

		CompanyFinancialPositionModelImpl companyFinancialPositionModelImpl =
			(CompanyFinancialPositionModelImpl)companyFinancialPosition;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (companyFinancialPosition.getCreateDate() == null)) {
			if (serviceContext == null) {
				companyFinancialPosition.setCreateDate(date);
			}
			else {
				companyFinancialPosition.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!companyFinancialPositionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				companyFinancialPosition.setModifiedDate(date);
			}
			else {
				companyFinancialPosition.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(companyFinancialPosition);
			}
			else {
				companyFinancialPosition =
					(CompanyFinancialPosition)session.merge(
						companyFinancialPosition);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CompanyFinancialPositionImpl.class,
			companyFinancialPositionModelImpl, false, true);

		cacheUniqueFindersCache(companyFinancialPositionModelImpl);

		if (isNew) {
			companyFinancialPosition.setNew(false);
		}

		companyFinancialPosition.resetOriginalValues();

		return companyFinancialPosition;
	}

	/**
	 * Returns the company financial position with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the company financial position
	 * @return the company financial position
	 * @throws NoSuchCompanyFinancialPositionException if a company financial position with the primary key could not be found
	 */
	@Override
	public CompanyFinancialPosition findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCompanyFinancialPositionException {

		CompanyFinancialPosition companyFinancialPosition = fetchByPrimaryKey(
			primaryKey);

		if (companyFinancialPosition == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCompanyFinancialPositionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return companyFinancialPosition;
	}

	/**
	 * Returns the company financial position with the primary key or throws a <code>NoSuchCompanyFinancialPositionException</code> if it could not be found.
	 *
	 * @param companyFinancialPositionId the primary key of the company financial position
	 * @return the company financial position
	 * @throws NoSuchCompanyFinancialPositionException if a company financial position with the primary key could not be found
	 */
	@Override
	public CompanyFinancialPosition findByPrimaryKey(
			long companyFinancialPositionId)
		throws NoSuchCompanyFinancialPositionException {

		return findByPrimaryKey((Serializable)companyFinancialPositionId);
	}

	/**
	 * Returns the company financial position with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param companyFinancialPositionId the primary key of the company financial position
	 * @return the company financial position, or <code>null</code> if a company financial position with the primary key could not be found
	 */
	@Override
	public CompanyFinancialPosition fetchByPrimaryKey(
		long companyFinancialPositionId) {

		return fetchByPrimaryKey((Serializable)companyFinancialPositionId);
	}

	/**
	 * Returns all the company financial positions.
	 *
	 * @return the company financial positions
	 */
	@Override
	public List<CompanyFinancialPosition> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the company financial positions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyFinancialPositionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company financial positions
	 * @param end the upper bound of the range of company financial positions (not inclusive)
	 * @return the range of company financial positions
	 */
	@Override
	public List<CompanyFinancialPosition> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the company financial positions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyFinancialPositionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company financial positions
	 * @param end the upper bound of the range of company financial positions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of company financial positions
	 */
	@Override
	public List<CompanyFinancialPosition> findAll(
		int start, int end,
		OrderByComparator<CompanyFinancialPosition> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the company financial positions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyFinancialPositionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company financial positions
	 * @param end the upper bound of the range of company financial positions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of company financial positions
	 */
	@Override
	public List<CompanyFinancialPosition> findAll(
		int start, int end,
		OrderByComparator<CompanyFinancialPosition> orderByComparator,
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

		List<CompanyFinancialPosition> list = null;

		if (useFinderCache) {
			list = (List<CompanyFinancialPosition>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_COMPANYFINANCIALPOSITION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_COMPANYFINANCIALPOSITION;

				sql = sql.concat(
					CompanyFinancialPositionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CompanyFinancialPosition>)QueryUtil.list(
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
	 * Removes all the company financial positions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CompanyFinancialPosition companyFinancialPosition : findAll()) {
			remove(companyFinancialPosition);
		}
	}

	/**
	 * Returns the number of company financial positions.
	 *
	 * @return the number of company financial positions
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
					_SQL_COUNT_COMPANYFINANCIALPOSITION);

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
		return "companyFinancialPositionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_COMPANYFINANCIALPOSITION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CompanyFinancialPositionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the company financial position persistence.
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

		_finderPathFetchBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, true);

		_finderPathCountBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, false);

		CompanyFinancialPositionUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CompanyFinancialPositionUtil.setPersistence(null);

		entityCache.removeCache(CompanyFinancialPositionImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_COMPANYFINANCIALPOSITION =
		"SELECT companyFinancialPosition FROM CompanyFinancialPosition companyFinancialPosition";

	private static final String _SQL_SELECT_COMPANYFINANCIALPOSITION_WHERE =
		"SELECT companyFinancialPosition FROM CompanyFinancialPosition companyFinancialPosition WHERE ";

	private static final String _SQL_COUNT_COMPANYFINANCIALPOSITION =
		"SELECT COUNT(companyFinancialPosition) FROM CompanyFinancialPosition companyFinancialPosition";

	private static final String _SQL_COUNT_COMPANYFINANCIALPOSITION_WHERE =
		"SELECT COUNT(companyFinancialPosition) FROM CompanyFinancialPosition companyFinancialPosition WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"companyFinancialPosition.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CompanyFinancialPosition exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CompanyFinancialPosition exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CompanyFinancialPositionPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}