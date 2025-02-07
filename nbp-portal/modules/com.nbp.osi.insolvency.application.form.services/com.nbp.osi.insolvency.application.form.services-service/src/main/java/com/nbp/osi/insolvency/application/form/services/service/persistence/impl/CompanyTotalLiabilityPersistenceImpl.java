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

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchCompanyTotalLiabilityException;
import com.nbp.osi.insolvency.application.form.services.model.CompanyTotalLiability;
import com.nbp.osi.insolvency.application.form.services.model.CompanyTotalLiabilityTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.CompanyTotalLiabilityImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.CompanyTotalLiabilityModelImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.CompanyTotalLiabilityPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.CompanyTotalLiabilityUtil;
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
 * The persistence implementation for the company total liability service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CompanyTotalLiabilityPersistence.class)
public class CompanyTotalLiabilityPersistenceImpl
	extends BasePersistenceImpl<CompanyTotalLiability>
	implements CompanyTotalLiabilityPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CompanyTotalLiabilityUtil</code> to access the company total liability persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CompanyTotalLiabilityImpl.class.getName();

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
	 * Returns the company total liability where osiInsolvencyId = &#63; or throws a <code>NoSuchCompanyTotalLiabilityException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching company total liability
	 * @throws NoSuchCompanyTotalLiabilityException if a matching company total liability could not be found
	 */
	@Override
	public CompanyTotalLiability findBygetOsiById(long osiInsolvencyId)
		throws NoSuchCompanyTotalLiabilityException {

		CompanyTotalLiability companyTotalLiability = fetchBygetOsiById(
			osiInsolvencyId);

		if (companyTotalLiability == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiInsolvencyId=");
			sb.append(osiInsolvencyId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCompanyTotalLiabilityException(sb.toString());
		}

		return companyTotalLiability;
	}

	/**
	 * Returns the company total liability where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching company total liability, or <code>null</code> if a matching company total liability could not be found
	 */
	@Override
	public CompanyTotalLiability fetchBygetOsiById(long osiInsolvencyId) {
		return fetchBygetOsiById(osiInsolvencyId, true);
	}

	/**
	 * Returns the company total liability where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching company total liability, or <code>null</code> if a matching company total liability could not be found
	 */
	@Override
	public CompanyTotalLiability fetchBygetOsiById(
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

		if (result instanceof CompanyTotalLiability) {
			CompanyTotalLiability companyTotalLiability =
				(CompanyTotalLiability)result;

			if (osiInsolvencyId != companyTotalLiability.getOsiInsolvencyId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_COMPANYTOTALLIABILITY_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				List<CompanyTotalLiability> list = query.list();

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
								"CompanyTotalLiabilityPersistenceImpl.fetchBygetOsiById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CompanyTotalLiability companyTotalLiability = list.get(0);

					result = companyTotalLiability;

					cacheResult(companyTotalLiability);
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
			return (CompanyTotalLiability)result;
		}
	}

	/**
	 * Removes the company total liability where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the company total liability that was removed
	 */
	@Override
	public CompanyTotalLiability removeBygetOsiById(long osiInsolvencyId)
		throws NoSuchCompanyTotalLiabilityException {

		CompanyTotalLiability companyTotalLiability = findBygetOsiById(
			osiInsolvencyId);

		return remove(companyTotalLiability);
	}

	/**
	 * Returns the number of company total liabilities where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching company total liabilities
	 */
	@Override
	public int countBygetOsiById(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOsiById;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_COMPANYTOTALLIABILITY_WHERE);

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
		"companyTotalLiability.osiInsolvencyId = ?";

	public CompanyTotalLiabilityPersistenceImpl() {
		setModelClass(CompanyTotalLiability.class);

		setModelImplClass(CompanyTotalLiabilityImpl.class);
		setModelPKClass(long.class);

		setTable(CompanyTotalLiabilityTable.INSTANCE);
	}

	/**
	 * Caches the company total liability in the entity cache if it is enabled.
	 *
	 * @param companyTotalLiability the company total liability
	 */
	@Override
	public void cacheResult(CompanyTotalLiability companyTotalLiability) {
		entityCache.putResult(
			CompanyTotalLiabilityImpl.class,
			companyTotalLiability.getPrimaryKey(), companyTotalLiability);

		finderCache.putResult(
			_finderPathFetchBygetOsiById,
			new Object[] {companyTotalLiability.getOsiInsolvencyId()},
			companyTotalLiability);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the company total liabilities in the entity cache if it is enabled.
	 *
	 * @param companyTotalLiabilities the company total liabilities
	 */
	@Override
	public void cacheResult(
		List<CompanyTotalLiability> companyTotalLiabilities) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (companyTotalLiabilities.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CompanyTotalLiability companyTotalLiability :
				companyTotalLiabilities) {

			if (entityCache.getResult(
					CompanyTotalLiabilityImpl.class,
					companyTotalLiability.getPrimaryKey()) == null) {

				cacheResult(companyTotalLiability);
			}
		}
	}

	/**
	 * Clears the cache for all company total liabilities.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CompanyTotalLiabilityImpl.class);

		finderCache.clearCache(CompanyTotalLiabilityImpl.class);
	}

	/**
	 * Clears the cache for the company total liability.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CompanyTotalLiability companyTotalLiability) {
		entityCache.removeResult(
			CompanyTotalLiabilityImpl.class, companyTotalLiability);
	}

	@Override
	public void clearCache(
		List<CompanyTotalLiability> companyTotalLiabilities) {

		for (CompanyTotalLiability companyTotalLiability :
				companyTotalLiabilities) {

			entityCache.removeResult(
				CompanyTotalLiabilityImpl.class, companyTotalLiability);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CompanyTotalLiabilityImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CompanyTotalLiabilityImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CompanyTotalLiabilityModelImpl companyTotalLiabilityModelImpl) {

		Object[] args = new Object[] {
			companyTotalLiabilityModelImpl.getOsiInsolvencyId()
		};

		finderCache.putResult(
			_finderPathCountBygetOsiById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiById, args, companyTotalLiabilityModelImpl);
	}

	/**
	 * Creates a new company total liability with the primary key. Does not add the company total liability to the database.
	 *
	 * @param companyTotalLiabilityId the primary key for the new company total liability
	 * @return the new company total liability
	 */
	@Override
	public CompanyTotalLiability create(long companyTotalLiabilityId) {
		CompanyTotalLiability companyTotalLiability =
			new CompanyTotalLiabilityImpl();

		companyTotalLiability.setNew(true);
		companyTotalLiability.setPrimaryKey(companyTotalLiabilityId);

		companyTotalLiability.setCompanyId(CompanyThreadLocal.getCompanyId());

		return companyTotalLiability;
	}

	/**
	 * Removes the company total liability with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param companyTotalLiabilityId the primary key of the company total liability
	 * @return the company total liability that was removed
	 * @throws NoSuchCompanyTotalLiabilityException if a company total liability with the primary key could not be found
	 */
	@Override
	public CompanyTotalLiability remove(long companyTotalLiabilityId)
		throws NoSuchCompanyTotalLiabilityException {

		return remove((Serializable)companyTotalLiabilityId);
	}

	/**
	 * Removes the company total liability with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the company total liability
	 * @return the company total liability that was removed
	 * @throws NoSuchCompanyTotalLiabilityException if a company total liability with the primary key could not be found
	 */
	@Override
	public CompanyTotalLiability remove(Serializable primaryKey)
		throws NoSuchCompanyTotalLiabilityException {

		Session session = null;

		try {
			session = openSession();

			CompanyTotalLiability companyTotalLiability =
				(CompanyTotalLiability)session.get(
					CompanyTotalLiabilityImpl.class, primaryKey);

			if (companyTotalLiability == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCompanyTotalLiabilityException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(companyTotalLiability);
		}
		catch (NoSuchCompanyTotalLiabilityException noSuchEntityException) {
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
	protected CompanyTotalLiability removeImpl(
		CompanyTotalLiability companyTotalLiability) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(companyTotalLiability)) {
				companyTotalLiability = (CompanyTotalLiability)session.get(
					CompanyTotalLiabilityImpl.class,
					companyTotalLiability.getPrimaryKeyObj());
			}

			if (companyTotalLiability != null) {
				session.delete(companyTotalLiability);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (companyTotalLiability != null) {
			clearCache(companyTotalLiability);
		}

		return companyTotalLiability;
	}

	@Override
	public CompanyTotalLiability updateImpl(
		CompanyTotalLiability companyTotalLiability) {

		boolean isNew = companyTotalLiability.isNew();

		if (!(companyTotalLiability instanceof
				CompanyTotalLiabilityModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(companyTotalLiability.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					companyTotalLiability);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in companyTotalLiability proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CompanyTotalLiability implementation " +
					companyTotalLiability.getClass());
		}

		CompanyTotalLiabilityModelImpl companyTotalLiabilityModelImpl =
			(CompanyTotalLiabilityModelImpl)companyTotalLiability;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (companyTotalLiability.getCreateDate() == null)) {
			if (serviceContext == null) {
				companyTotalLiability.setCreateDate(date);
			}
			else {
				companyTotalLiability.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!companyTotalLiabilityModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				companyTotalLiability.setModifiedDate(date);
			}
			else {
				companyTotalLiability.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(companyTotalLiability);
			}
			else {
				companyTotalLiability = (CompanyTotalLiability)session.merge(
					companyTotalLiability);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CompanyTotalLiabilityImpl.class, companyTotalLiabilityModelImpl,
			false, true);

		cacheUniqueFindersCache(companyTotalLiabilityModelImpl);

		if (isNew) {
			companyTotalLiability.setNew(false);
		}

		companyTotalLiability.resetOriginalValues();

		return companyTotalLiability;
	}

	/**
	 * Returns the company total liability with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the company total liability
	 * @return the company total liability
	 * @throws NoSuchCompanyTotalLiabilityException if a company total liability with the primary key could not be found
	 */
	@Override
	public CompanyTotalLiability findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCompanyTotalLiabilityException {

		CompanyTotalLiability companyTotalLiability = fetchByPrimaryKey(
			primaryKey);

		if (companyTotalLiability == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCompanyTotalLiabilityException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return companyTotalLiability;
	}

	/**
	 * Returns the company total liability with the primary key or throws a <code>NoSuchCompanyTotalLiabilityException</code> if it could not be found.
	 *
	 * @param companyTotalLiabilityId the primary key of the company total liability
	 * @return the company total liability
	 * @throws NoSuchCompanyTotalLiabilityException if a company total liability with the primary key could not be found
	 */
	@Override
	public CompanyTotalLiability findByPrimaryKey(long companyTotalLiabilityId)
		throws NoSuchCompanyTotalLiabilityException {

		return findByPrimaryKey((Serializable)companyTotalLiabilityId);
	}

	/**
	 * Returns the company total liability with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param companyTotalLiabilityId the primary key of the company total liability
	 * @return the company total liability, or <code>null</code> if a company total liability with the primary key could not be found
	 */
	@Override
	public CompanyTotalLiability fetchByPrimaryKey(
		long companyTotalLiabilityId) {

		return fetchByPrimaryKey((Serializable)companyTotalLiabilityId);
	}

	/**
	 * Returns all the company total liabilities.
	 *
	 * @return the company total liabilities
	 */
	@Override
	public List<CompanyTotalLiability> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the company total liabilities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyTotalLiabilityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company total liabilities
	 * @param end the upper bound of the range of company total liabilities (not inclusive)
	 * @return the range of company total liabilities
	 */
	@Override
	public List<CompanyTotalLiability> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the company total liabilities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyTotalLiabilityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company total liabilities
	 * @param end the upper bound of the range of company total liabilities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of company total liabilities
	 */
	@Override
	public List<CompanyTotalLiability> findAll(
		int start, int end,
		OrderByComparator<CompanyTotalLiability> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the company total liabilities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyTotalLiabilityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company total liabilities
	 * @param end the upper bound of the range of company total liabilities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of company total liabilities
	 */
	@Override
	public List<CompanyTotalLiability> findAll(
		int start, int end,
		OrderByComparator<CompanyTotalLiability> orderByComparator,
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

		List<CompanyTotalLiability> list = null;

		if (useFinderCache) {
			list = (List<CompanyTotalLiability>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_COMPANYTOTALLIABILITY);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_COMPANYTOTALLIABILITY;

				sql = sql.concat(CompanyTotalLiabilityModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CompanyTotalLiability>)QueryUtil.list(
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
	 * Removes all the company total liabilities from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CompanyTotalLiability companyTotalLiability : findAll()) {
			remove(companyTotalLiability);
		}
	}

	/**
	 * Returns the number of company total liabilities.
	 *
	 * @return the number of company total liabilities
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
					_SQL_COUNT_COMPANYTOTALLIABILITY);

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
		return "companyTotalLiabilityId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_COMPANYTOTALLIABILITY;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CompanyTotalLiabilityModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the company total liability persistence.
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

		CompanyTotalLiabilityUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CompanyTotalLiabilityUtil.setPersistence(null);

		entityCache.removeCache(CompanyTotalLiabilityImpl.class.getName());
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

	private static final String _SQL_SELECT_COMPANYTOTALLIABILITY =
		"SELECT companyTotalLiability FROM CompanyTotalLiability companyTotalLiability";

	private static final String _SQL_SELECT_COMPANYTOTALLIABILITY_WHERE =
		"SELECT companyTotalLiability FROM CompanyTotalLiability companyTotalLiability WHERE ";

	private static final String _SQL_COUNT_COMPANYTOTALLIABILITY =
		"SELECT COUNT(companyTotalLiability) FROM CompanyTotalLiability companyTotalLiability";

	private static final String _SQL_COUNT_COMPANYTOTALLIABILITY_WHERE =
		"SELECT COUNT(companyTotalLiability) FROM CompanyTotalLiability companyTotalLiability WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"companyTotalLiability.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CompanyTotalLiability exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CompanyTotalLiability exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CompanyTotalLiabilityPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}