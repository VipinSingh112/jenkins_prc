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

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchCompanySecretaryException;
import com.nbp.osi.insolvency.application.form.services.model.CompanySecretary;
import com.nbp.osi.insolvency.application.form.services.model.CompanySecretaryTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.CompanySecretaryImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.CompanySecretaryModelImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.CompanySecretaryPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.CompanySecretaryUtil;
import com.nbp.osi.insolvency.application.form.services.service.persistence.impl.constants.OSI_INSOLVENCYPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

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
 * The persistence implementation for the company secretary service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CompanySecretaryPersistence.class)
public class CompanySecretaryPersistenceImpl
	extends BasePersistenceImpl<CompanySecretary>
	implements CompanySecretaryPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CompanySecretaryUtil</code> to access the company secretary persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CompanySecretaryImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetOsiById;
	private FinderPath _finderPathWithoutPaginationFindBygetOsiById;
	private FinderPath _finderPathCountBygetOsiById;

	/**
	 * Returns all the company secretaries where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching company secretaries
	 */
	@Override
	public List<CompanySecretary> findBygetOsiById(long osiInsolvencyId) {
		return findBygetOsiById(
			osiInsolvencyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the company secretaries where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanySecretaryModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of company secretaries
	 * @param end the upper bound of the range of company secretaries (not inclusive)
	 * @return the range of matching company secretaries
	 */
	@Override
	public List<CompanySecretary> findBygetOsiById(
		long osiInsolvencyId, int start, int end) {

		return findBygetOsiById(osiInsolvencyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the company secretaries where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanySecretaryModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of company secretaries
	 * @param end the upper bound of the range of company secretaries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching company secretaries
	 */
	@Override
	public List<CompanySecretary> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<CompanySecretary> orderByComparator) {

		return findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the company secretaries where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanySecretaryModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of company secretaries
	 * @param end the upper bound of the range of company secretaries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching company secretaries
	 */
	@Override
	public List<CompanySecretary> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<CompanySecretary> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetOsiById;
				finderArgs = new Object[] {osiInsolvencyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetOsiById;
			finderArgs = new Object[] {
				osiInsolvencyId, start, end, orderByComparator
			};
		}

		List<CompanySecretary> list = null;

		if (useFinderCache) {
			list = (List<CompanySecretary>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CompanySecretary companySecretary : list) {
					if (osiInsolvencyId !=
							companySecretary.getOsiInsolvencyId()) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_COMPANYSECRETARY_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CompanySecretaryModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				list = (List<CompanySecretary>)QueryUtil.list(
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
	 * Returns the first company secretary in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching company secretary
	 * @throws NoSuchCompanySecretaryException if a matching company secretary could not be found
	 */
	@Override
	public CompanySecretary findBygetOsiById_First(
			long osiInsolvencyId,
			OrderByComparator<CompanySecretary> orderByComparator)
		throws NoSuchCompanySecretaryException {

		CompanySecretary companySecretary = fetchBygetOsiById_First(
			osiInsolvencyId, orderByComparator);

		if (companySecretary != null) {
			return companySecretary;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiInsolvencyId=");
		sb.append(osiInsolvencyId);

		sb.append("}");

		throw new NoSuchCompanySecretaryException(sb.toString());
	}

	/**
	 * Returns the first company secretary in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching company secretary, or <code>null</code> if a matching company secretary could not be found
	 */
	@Override
	public CompanySecretary fetchBygetOsiById_First(
		long osiInsolvencyId,
		OrderByComparator<CompanySecretary> orderByComparator) {

		List<CompanySecretary> list = findBygetOsiById(
			osiInsolvencyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last company secretary in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching company secretary
	 * @throws NoSuchCompanySecretaryException if a matching company secretary could not be found
	 */
	@Override
	public CompanySecretary findBygetOsiById_Last(
			long osiInsolvencyId,
			OrderByComparator<CompanySecretary> orderByComparator)
		throws NoSuchCompanySecretaryException {

		CompanySecretary companySecretary = fetchBygetOsiById_Last(
			osiInsolvencyId, orderByComparator);

		if (companySecretary != null) {
			return companySecretary;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiInsolvencyId=");
		sb.append(osiInsolvencyId);

		sb.append("}");

		throw new NoSuchCompanySecretaryException(sb.toString());
	}

	/**
	 * Returns the last company secretary in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching company secretary, or <code>null</code> if a matching company secretary could not be found
	 */
	@Override
	public CompanySecretary fetchBygetOsiById_Last(
		long osiInsolvencyId,
		OrderByComparator<CompanySecretary> orderByComparator) {

		int count = countBygetOsiById(osiInsolvencyId);

		if (count == 0) {
			return null;
		}

		List<CompanySecretary> list = findBygetOsiById(
			osiInsolvencyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the company secretaries before and after the current company secretary in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param companySecretaryId the primary key of the current company secretary
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next company secretary
	 * @throws NoSuchCompanySecretaryException if a company secretary with the primary key could not be found
	 */
	@Override
	public CompanySecretary[] findBygetOsiById_PrevAndNext(
			long companySecretaryId, long osiInsolvencyId,
			OrderByComparator<CompanySecretary> orderByComparator)
		throws NoSuchCompanySecretaryException {

		CompanySecretary companySecretary = findByPrimaryKey(
			companySecretaryId);

		Session session = null;

		try {
			session = openSession();

			CompanySecretary[] array = new CompanySecretaryImpl[3];

			array[0] = getBygetOsiById_PrevAndNext(
				session, companySecretary, osiInsolvencyId, orderByComparator,
				true);

			array[1] = companySecretary;

			array[2] = getBygetOsiById_PrevAndNext(
				session, companySecretary, osiInsolvencyId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected CompanySecretary getBygetOsiById_PrevAndNext(
		Session session, CompanySecretary companySecretary,
		long osiInsolvencyId,
		OrderByComparator<CompanySecretary> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_COMPANYSECRETARY_WHERE);

		sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(CompanySecretaryModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(osiInsolvencyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						companySecretary)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CompanySecretary> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the company secretaries where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	@Override
	public void removeBygetOsiById(long osiInsolvencyId) {
		for (CompanySecretary companySecretary :
				findBygetOsiById(
					osiInsolvencyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(companySecretary);
		}
	}

	/**
	 * Returns the number of company secretaries where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching company secretaries
	 */
	@Override
	public int countBygetOsiById(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOsiById;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_COMPANYSECRETARY_WHERE);

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
		"companySecretary.osiInsolvencyId = ?";

	public CompanySecretaryPersistenceImpl() {
		setModelClass(CompanySecretary.class);

		setModelImplClass(CompanySecretaryImpl.class);
		setModelPKClass(long.class);

		setTable(CompanySecretaryTable.INSTANCE);
	}

	/**
	 * Caches the company secretary in the entity cache if it is enabled.
	 *
	 * @param companySecretary the company secretary
	 */
	@Override
	public void cacheResult(CompanySecretary companySecretary) {
		entityCache.putResult(
			CompanySecretaryImpl.class, companySecretary.getPrimaryKey(),
			companySecretary);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the company secretaries in the entity cache if it is enabled.
	 *
	 * @param companySecretaries the company secretaries
	 */
	@Override
	public void cacheResult(List<CompanySecretary> companySecretaries) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (companySecretaries.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CompanySecretary companySecretary : companySecretaries) {
			if (entityCache.getResult(
					CompanySecretaryImpl.class,
					companySecretary.getPrimaryKey()) == null) {

				cacheResult(companySecretary);
			}
		}
	}

	/**
	 * Clears the cache for all company secretaries.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CompanySecretaryImpl.class);

		finderCache.clearCache(CompanySecretaryImpl.class);
	}

	/**
	 * Clears the cache for the company secretary.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CompanySecretary companySecretary) {
		entityCache.removeResult(CompanySecretaryImpl.class, companySecretary);
	}

	@Override
	public void clearCache(List<CompanySecretary> companySecretaries) {
		for (CompanySecretary companySecretary : companySecretaries) {
			entityCache.removeResult(
				CompanySecretaryImpl.class, companySecretary);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CompanySecretaryImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(CompanySecretaryImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new company secretary with the primary key. Does not add the company secretary to the database.
	 *
	 * @param companySecretaryId the primary key for the new company secretary
	 * @return the new company secretary
	 */
	@Override
	public CompanySecretary create(long companySecretaryId) {
		CompanySecretary companySecretary = new CompanySecretaryImpl();

		companySecretary.setNew(true);
		companySecretary.setPrimaryKey(companySecretaryId);

		companySecretary.setCompanyId(CompanyThreadLocal.getCompanyId());

		return companySecretary;
	}

	/**
	 * Removes the company secretary with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param companySecretaryId the primary key of the company secretary
	 * @return the company secretary that was removed
	 * @throws NoSuchCompanySecretaryException if a company secretary with the primary key could not be found
	 */
	@Override
	public CompanySecretary remove(long companySecretaryId)
		throws NoSuchCompanySecretaryException {

		return remove((Serializable)companySecretaryId);
	}

	/**
	 * Removes the company secretary with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the company secretary
	 * @return the company secretary that was removed
	 * @throws NoSuchCompanySecretaryException if a company secretary with the primary key could not be found
	 */
	@Override
	public CompanySecretary remove(Serializable primaryKey)
		throws NoSuchCompanySecretaryException {

		Session session = null;

		try {
			session = openSession();

			CompanySecretary companySecretary = (CompanySecretary)session.get(
				CompanySecretaryImpl.class, primaryKey);

			if (companySecretary == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCompanySecretaryException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(companySecretary);
		}
		catch (NoSuchCompanySecretaryException noSuchEntityException) {
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
	protected CompanySecretary removeImpl(CompanySecretary companySecretary) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(companySecretary)) {
				companySecretary = (CompanySecretary)session.get(
					CompanySecretaryImpl.class,
					companySecretary.getPrimaryKeyObj());
			}

			if (companySecretary != null) {
				session.delete(companySecretary);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (companySecretary != null) {
			clearCache(companySecretary);
		}

		return companySecretary;
	}

	@Override
	public CompanySecretary updateImpl(CompanySecretary companySecretary) {
		boolean isNew = companySecretary.isNew();

		if (!(companySecretary instanceof CompanySecretaryModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(companySecretary.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					companySecretary);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in companySecretary proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CompanySecretary implementation " +
					companySecretary.getClass());
		}

		CompanySecretaryModelImpl companySecretaryModelImpl =
			(CompanySecretaryModelImpl)companySecretary;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (companySecretary.getCreateDate() == null)) {
			if (serviceContext == null) {
				companySecretary.setCreateDate(date);
			}
			else {
				companySecretary.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!companySecretaryModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				companySecretary.setModifiedDate(date);
			}
			else {
				companySecretary.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(companySecretary);
			}
			else {
				companySecretary = (CompanySecretary)session.merge(
					companySecretary);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CompanySecretaryImpl.class, companySecretaryModelImpl, false, true);

		if (isNew) {
			companySecretary.setNew(false);
		}

		companySecretary.resetOriginalValues();

		return companySecretary;
	}

	/**
	 * Returns the company secretary with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the company secretary
	 * @return the company secretary
	 * @throws NoSuchCompanySecretaryException if a company secretary with the primary key could not be found
	 */
	@Override
	public CompanySecretary findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCompanySecretaryException {

		CompanySecretary companySecretary = fetchByPrimaryKey(primaryKey);

		if (companySecretary == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCompanySecretaryException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return companySecretary;
	}

	/**
	 * Returns the company secretary with the primary key or throws a <code>NoSuchCompanySecretaryException</code> if it could not be found.
	 *
	 * @param companySecretaryId the primary key of the company secretary
	 * @return the company secretary
	 * @throws NoSuchCompanySecretaryException if a company secretary with the primary key could not be found
	 */
	@Override
	public CompanySecretary findByPrimaryKey(long companySecretaryId)
		throws NoSuchCompanySecretaryException {

		return findByPrimaryKey((Serializable)companySecretaryId);
	}

	/**
	 * Returns the company secretary with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param companySecretaryId the primary key of the company secretary
	 * @return the company secretary, or <code>null</code> if a company secretary with the primary key could not be found
	 */
	@Override
	public CompanySecretary fetchByPrimaryKey(long companySecretaryId) {
		return fetchByPrimaryKey((Serializable)companySecretaryId);
	}

	/**
	 * Returns all the company secretaries.
	 *
	 * @return the company secretaries
	 */
	@Override
	public List<CompanySecretary> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the company secretaries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanySecretaryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company secretaries
	 * @param end the upper bound of the range of company secretaries (not inclusive)
	 * @return the range of company secretaries
	 */
	@Override
	public List<CompanySecretary> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the company secretaries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanySecretaryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company secretaries
	 * @param end the upper bound of the range of company secretaries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of company secretaries
	 */
	@Override
	public List<CompanySecretary> findAll(
		int start, int end,
		OrderByComparator<CompanySecretary> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the company secretaries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanySecretaryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company secretaries
	 * @param end the upper bound of the range of company secretaries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of company secretaries
	 */
	@Override
	public List<CompanySecretary> findAll(
		int start, int end,
		OrderByComparator<CompanySecretary> orderByComparator,
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

		List<CompanySecretary> list = null;

		if (useFinderCache) {
			list = (List<CompanySecretary>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_COMPANYSECRETARY);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_COMPANYSECRETARY;

				sql = sql.concat(CompanySecretaryModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CompanySecretary>)QueryUtil.list(
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
	 * Removes all the company secretaries from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CompanySecretary companySecretary : findAll()) {
			remove(companySecretary);
		}
	}

	/**
	 * Returns the number of company secretaries.
	 *
	 * @return the number of company secretaries
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_COMPANYSECRETARY);

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
		return "companySecretaryId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_COMPANYSECRETARY;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CompanySecretaryModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the company secretary persistence.
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

		_finderPathWithPaginationFindBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetOsiById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"osiInsolvencyId"}, true);

		_finderPathWithoutPaginationFindBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, true);

		_finderPathCountBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, false);

		CompanySecretaryUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CompanySecretaryUtil.setPersistence(null);

		entityCache.removeCache(CompanySecretaryImpl.class.getName());
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

	private static final String _SQL_SELECT_COMPANYSECRETARY =
		"SELECT companySecretary FROM CompanySecretary companySecretary";

	private static final String _SQL_SELECT_COMPANYSECRETARY_WHERE =
		"SELECT companySecretary FROM CompanySecretary companySecretary WHERE ";

	private static final String _SQL_COUNT_COMPANYSECRETARY =
		"SELECT COUNT(companySecretary) FROM CompanySecretary companySecretary";

	private static final String _SQL_COUNT_COMPANYSECRETARY_WHERE =
		"SELECT COUNT(companySecretary) FROM CompanySecretary companySecretary WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "companySecretary.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CompanySecretary exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CompanySecretary exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CompanySecretaryPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}