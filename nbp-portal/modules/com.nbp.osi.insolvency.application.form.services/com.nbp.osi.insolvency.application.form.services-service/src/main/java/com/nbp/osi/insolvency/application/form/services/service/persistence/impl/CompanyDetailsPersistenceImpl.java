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

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchCompanyDetailsException;
import com.nbp.osi.insolvency.application.form.services.model.CompanyDetails;
import com.nbp.osi.insolvency.application.form.services.model.CompanyDetailsTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.CompanyDetailsImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.CompanyDetailsModelImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.CompanyDetailsPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.CompanyDetailsUtil;
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
 * The persistence implementation for the company details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CompanyDetailsPersistence.class)
public class CompanyDetailsPersistenceImpl
	extends BasePersistenceImpl<CompanyDetails>
	implements CompanyDetailsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CompanyDetailsUtil</code> to access the company details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CompanyDetailsImpl.class.getName();

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
	 * Returns the company details where osiInsolvencyId = &#63; or throws a <code>NoSuchCompanyDetailsException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching company details
	 * @throws NoSuchCompanyDetailsException if a matching company details could not be found
	 */
	@Override
	public CompanyDetails findBygetOsiById(long osiInsolvencyId)
		throws NoSuchCompanyDetailsException {

		CompanyDetails companyDetails = fetchBygetOsiById(osiInsolvencyId);

		if (companyDetails == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiInsolvencyId=");
			sb.append(osiInsolvencyId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCompanyDetailsException(sb.toString());
		}

		return companyDetails;
	}

	/**
	 * Returns the company details where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching company details, or <code>null</code> if a matching company details could not be found
	 */
	@Override
	public CompanyDetails fetchBygetOsiById(long osiInsolvencyId) {
		return fetchBygetOsiById(osiInsolvencyId, true);
	}

	/**
	 * Returns the company details where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching company details, or <code>null</code> if a matching company details could not be found
	 */
	@Override
	public CompanyDetails fetchBygetOsiById(
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

		if (result instanceof CompanyDetails) {
			CompanyDetails companyDetails = (CompanyDetails)result;

			if (osiInsolvencyId != companyDetails.getOsiInsolvencyId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_COMPANYDETAILS_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				List<CompanyDetails> list = query.list();

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
								"CompanyDetailsPersistenceImpl.fetchBygetOsiById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CompanyDetails companyDetails = list.get(0);

					result = companyDetails;

					cacheResult(companyDetails);
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
			return (CompanyDetails)result;
		}
	}

	/**
	 * Removes the company details where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the company details that was removed
	 */
	@Override
	public CompanyDetails removeBygetOsiById(long osiInsolvencyId)
		throws NoSuchCompanyDetailsException {

		CompanyDetails companyDetails = findBygetOsiById(osiInsolvencyId);

		return remove(companyDetails);
	}

	/**
	 * Returns the number of company detailses where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching company detailses
	 */
	@Override
	public int countBygetOsiById(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOsiById;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_COMPANYDETAILS_WHERE);

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
		"companyDetails.osiInsolvencyId = ?";

	public CompanyDetailsPersistenceImpl() {
		setModelClass(CompanyDetails.class);

		setModelImplClass(CompanyDetailsImpl.class);
		setModelPKClass(long.class);

		setTable(CompanyDetailsTable.INSTANCE);
	}

	/**
	 * Caches the company details in the entity cache if it is enabled.
	 *
	 * @param companyDetails the company details
	 */
	@Override
	public void cacheResult(CompanyDetails companyDetails) {
		entityCache.putResult(
			CompanyDetailsImpl.class, companyDetails.getPrimaryKey(),
			companyDetails);

		finderCache.putResult(
			_finderPathFetchBygetOsiById,
			new Object[] {companyDetails.getOsiInsolvencyId()}, companyDetails);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the company detailses in the entity cache if it is enabled.
	 *
	 * @param companyDetailses the company detailses
	 */
	@Override
	public void cacheResult(List<CompanyDetails> companyDetailses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (companyDetailses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CompanyDetails companyDetails : companyDetailses) {
			if (entityCache.getResult(
					CompanyDetailsImpl.class, companyDetails.getPrimaryKey()) ==
						null) {

				cacheResult(companyDetails);
			}
		}
	}

	/**
	 * Clears the cache for all company detailses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CompanyDetailsImpl.class);

		finderCache.clearCache(CompanyDetailsImpl.class);
	}

	/**
	 * Clears the cache for the company details.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CompanyDetails companyDetails) {
		entityCache.removeResult(CompanyDetailsImpl.class, companyDetails);
	}

	@Override
	public void clearCache(List<CompanyDetails> companyDetailses) {
		for (CompanyDetails companyDetails : companyDetailses) {
			entityCache.removeResult(CompanyDetailsImpl.class, companyDetails);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CompanyDetailsImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(CompanyDetailsImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CompanyDetailsModelImpl companyDetailsModelImpl) {

		Object[] args = new Object[] {
			companyDetailsModelImpl.getOsiInsolvencyId()
		};

		finderCache.putResult(
			_finderPathCountBygetOsiById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiById, args, companyDetailsModelImpl);
	}

	/**
	 * Creates a new company details with the primary key. Does not add the company details to the database.
	 *
	 * @param companyDetailsId the primary key for the new company details
	 * @return the new company details
	 */
	@Override
	public CompanyDetails create(long companyDetailsId) {
		CompanyDetails companyDetails = new CompanyDetailsImpl();

		companyDetails.setNew(true);
		companyDetails.setPrimaryKey(companyDetailsId);

		companyDetails.setCompanyId(CompanyThreadLocal.getCompanyId());

		return companyDetails;
	}

	/**
	 * Removes the company details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param companyDetailsId the primary key of the company details
	 * @return the company details that was removed
	 * @throws NoSuchCompanyDetailsException if a company details with the primary key could not be found
	 */
	@Override
	public CompanyDetails remove(long companyDetailsId)
		throws NoSuchCompanyDetailsException {

		return remove((Serializable)companyDetailsId);
	}

	/**
	 * Removes the company details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the company details
	 * @return the company details that was removed
	 * @throws NoSuchCompanyDetailsException if a company details with the primary key could not be found
	 */
	@Override
	public CompanyDetails remove(Serializable primaryKey)
		throws NoSuchCompanyDetailsException {

		Session session = null;

		try {
			session = openSession();

			CompanyDetails companyDetails = (CompanyDetails)session.get(
				CompanyDetailsImpl.class, primaryKey);

			if (companyDetails == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCompanyDetailsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(companyDetails);
		}
		catch (NoSuchCompanyDetailsException noSuchEntityException) {
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
	protected CompanyDetails removeImpl(CompanyDetails companyDetails) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(companyDetails)) {
				companyDetails = (CompanyDetails)session.get(
					CompanyDetailsImpl.class,
					companyDetails.getPrimaryKeyObj());
			}

			if (companyDetails != null) {
				session.delete(companyDetails);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (companyDetails != null) {
			clearCache(companyDetails);
		}

		return companyDetails;
	}

	@Override
	public CompanyDetails updateImpl(CompanyDetails companyDetails) {
		boolean isNew = companyDetails.isNew();

		if (!(companyDetails instanceof CompanyDetailsModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(companyDetails.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					companyDetails);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in companyDetails proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CompanyDetails implementation " +
					companyDetails.getClass());
		}

		CompanyDetailsModelImpl companyDetailsModelImpl =
			(CompanyDetailsModelImpl)companyDetails;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (companyDetails.getCreateDate() == null)) {
			if (serviceContext == null) {
				companyDetails.setCreateDate(date);
			}
			else {
				companyDetails.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!companyDetailsModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				companyDetails.setModifiedDate(date);
			}
			else {
				companyDetails.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(companyDetails);
			}
			else {
				companyDetails = (CompanyDetails)session.merge(companyDetails);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CompanyDetailsImpl.class, companyDetailsModelImpl, false, true);

		cacheUniqueFindersCache(companyDetailsModelImpl);

		if (isNew) {
			companyDetails.setNew(false);
		}

		companyDetails.resetOriginalValues();

		return companyDetails;
	}

	/**
	 * Returns the company details with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the company details
	 * @return the company details
	 * @throws NoSuchCompanyDetailsException if a company details with the primary key could not be found
	 */
	@Override
	public CompanyDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCompanyDetailsException {

		CompanyDetails companyDetails = fetchByPrimaryKey(primaryKey);

		if (companyDetails == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCompanyDetailsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return companyDetails;
	}

	/**
	 * Returns the company details with the primary key or throws a <code>NoSuchCompanyDetailsException</code> if it could not be found.
	 *
	 * @param companyDetailsId the primary key of the company details
	 * @return the company details
	 * @throws NoSuchCompanyDetailsException if a company details with the primary key could not be found
	 */
	@Override
	public CompanyDetails findByPrimaryKey(long companyDetailsId)
		throws NoSuchCompanyDetailsException {

		return findByPrimaryKey((Serializable)companyDetailsId);
	}

	/**
	 * Returns the company details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param companyDetailsId the primary key of the company details
	 * @return the company details, or <code>null</code> if a company details with the primary key could not be found
	 */
	@Override
	public CompanyDetails fetchByPrimaryKey(long companyDetailsId) {
		return fetchByPrimaryKey((Serializable)companyDetailsId);
	}

	/**
	 * Returns all the company detailses.
	 *
	 * @return the company detailses
	 */
	@Override
	public List<CompanyDetails> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the company detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company detailses
	 * @param end the upper bound of the range of company detailses (not inclusive)
	 * @return the range of company detailses
	 */
	@Override
	public List<CompanyDetails> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the company detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company detailses
	 * @param end the upper bound of the range of company detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of company detailses
	 */
	@Override
	public List<CompanyDetails> findAll(
		int start, int end,
		OrderByComparator<CompanyDetails> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the company detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company detailses
	 * @param end the upper bound of the range of company detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of company detailses
	 */
	@Override
	public List<CompanyDetails> findAll(
		int start, int end, OrderByComparator<CompanyDetails> orderByComparator,
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

		List<CompanyDetails> list = null;

		if (useFinderCache) {
			list = (List<CompanyDetails>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_COMPANYDETAILS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_COMPANYDETAILS;

				sql = sql.concat(CompanyDetailsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CompanyDetails>)QueryUtil.list(
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
	 * Removes all the company detailses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CompanyDetails companyDetails : findAll()) {
			remove(companyDetails);
		}
	}

	/**
	 * Returns the number of company detailses.
	 *
	 * @return the number of company detailses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_COMPANYDETAILS);

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
		return "companyDetailsId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_COMPANYDETAILS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CompanyDetailsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the company details persistence.
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

		CompanyDetailsUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CompanyDetailsUtil.setPersistence(null);

		entityCache.removeCache(CompanyDetailsImpl.class.getName());
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

	private static final String _SQL_SELECT_COMPANYDETAILS =
		"SELECT companyDetails FROM CompanyDetails companyDetails";

	private static final String _SQL_SELECT_COMPANYDETAILS_WHERE =
		"SELECT companyDetails FROM CompanyDetails companyDetails WHERE ";

	private static final String _SQL_COUNT_COMPANYDETAILS =
		"SELECT COUNT(companyDetails) FROM CompanyDetails companyDetails";

	private static final String _SQL_COUNT_COMPANYDETAILS_WHERE =
		"SELECT COUNT(companyDetails) FROM CompanyDetails companyDetails WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "companyDetails.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CompanyDetails exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CompanyDetails exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CompanyDetailsPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}