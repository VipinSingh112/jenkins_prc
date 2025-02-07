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

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchCompanyUnsecuredCreditorException;
import com.nbp.osi.insolvency.application.form.services.model.CompanyUnsecuredCreditor;
import com.nbp.osi.insolvency.application.form.services.model.CompanyUnsecuredCreditorTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.CompanyUnsecuredCreditorImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.CompanyUnsecuredCreditorModelImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.CompanyUnsecuredCreditorPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.CompanyUnsecuredCreditorUtil;
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
 * The persistence implementation for the company unsecured creditor service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CompanyUnsecuredCreditorPersistence.class)
public class CompanyUnsecuredCreditorPersistenceImpl
	extends BasePersistenceImpl<CompanyUnsecuredCreditor>
	implements CompanyUnsecuredCreditorPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CompanyUnsecuredCreditorUtil</code> to access the company unsecured creditor persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CompanyUnsecuredCreditorImpl.class.getName();

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
	 * Returns all the company unsecured creditors where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching company unsecured creditors
	 */
	@Override
	public List<CompanyUnsecuredCreditor> findBygetOsiById(
		long osiInsolvencyId) {

		return findBygetOsiById(
			osiInsolvencyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the company unsecured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyUnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of company unsecured creditors
	 * @param end the upper bound of the range of company unsecured creditors (not inclusive)
	 * @return the range of matching company unsecured creditors
	 */
	@Override
	public List<CompanyUnsecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end) {

		return findBygetOsiById(osiInsolvencyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the company unsecured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyUnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of company unsecured creditors
	 * @param end the upper bound of the range of company unsecured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching company unsecured creditors
	 */
	@Override
	public List<CompanyUnsecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<CompanyUnsecuredCreditor> orderByComparator) {

		return findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the company unsecured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyUnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of company unsecured creditors
	 * @param end the upper bound of the range of company unsecured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching company unsecured creditors
	 */
	@Override
	public List<CompanyUnsecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<CompanyUnsecuredCreditor> orderByComparator,
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

		List<CompanyUnsecuredCreditor> list = null;

		if (useFinderCache) {
			list = (List<CompanyUnsecuredCreditor>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CompanyUnsecuredCreditor companyUnsecuredCreditor : list) {
					if (osiInsolvencyId !=
							companyUnsecuredCreditor.getOsiInsolvencyId()) {

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

			sb.append(_SQL_SELECT_COMPANYUNSECUREDCREDITOR_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CompanyUnsecuredCreditorModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				list = (List<CompanyUnsecuredCreditor>)QueryUtil.list(
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
	 * Returns the first company unsecured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching company unsecured creditor
	 * @throws NoSuchCompanyUnsecuredCreditorException if a matching company unsecured creditor could not be found
	 */
	@Override
	public CompanyUnsecuredCreditor findBygetOsiById_First(
			long osiInsolvencyId,
			OrderByComparator<CompanyUnsecuredCreditor> orderByComparator)
		throws NoSuchCompanyUnsecuredCreditorException {

		CompanyUnsecuredCreditor companyUnsecuredCreditor =
			fetchBygetOsiById_First(osiInsolvencyId, orderByComparator);

		if (companyUnsecuredCreditor != null) {
			return companyUnsecuredCreditor;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiInsolvencyId=");
		sb.append(osiInsolvencyId);

		sb.append("}");

		throw new NoSuchCompanyUnsecuredCreditorException(sb.toString());
	}

	/**
	 * Returns the first company unsecured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching company unsecured creditor, or <code>null</code> if a matching company unsecured creditor could not be found
	 */
	@Override
	public CompanyUnsecuredCreditor fetchBygetOsiById_First(
		long osiInsolvencyId,
		OrderByComparator<CompanyUnsecuredCreditor> orderByComparator) {

		List<CompanyUnsecuredCreditor> list = findBygetOsiById(
			osiInsolvencyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last company unsecured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching company unsecured creditor
	 * @throws NoSuchCompanyUnsecuredCreditorException if a matching company unsecured creditor could not be found
	 */
	@Override
	public CompanyUnsecuredCreditor findBygetOsiById_Last(
			long osiInsolvencyId,
			OrderByComparator<CompanyUnsecuredCreditor> orderByComparator)
		throws NoSuchCompanyUnsecuredCreditorException {

		CompanyUnsecuredCreditor companyUnsecuredCreditor =
			fetchBygetOsiById_Last(osiInsolvencyId, orderByComparator);

		if (companyUnsecuredCreditor != null) {
			return companyUnsecuredCreditor;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiInsolvencyId=");
		sb.append(osiInsolvencyId);

		sb.append("}");

		throw new NoSuchCompanyUnsecuredCreditorException(sb.toString());
	}

	/**
	 * Returns the last company unsecured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching company unsecured creditor, or <code>null</code> if a matching company unsecured creditor could not be found
	 */
	@Override
	public CompanyUnsecuredCreditor fetchBygetOsiById_Last(
		long osiInsolvencyId,
		OrderByComparator<CompanyUnsecuredCreditor> orderByComparator) {

		int count = countBygetOsiById(osiInsolvencyId);

		if (count == 0) {
			return null;
		}

		List<CompanyUnsecuredCreditor> list = findBygetOsiById(
			osiInsolvencyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the company unsecured creditors before and after the current company unsecured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param companyUnsecuredCreditorId the primary key of the current company unsecured creditor
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next company unsecured creditor
	 * @throws NoSuchCompanyUnsecuredCreditorException if a company unsecured creditor with the primary key could not be found
	 */
	@Override
	public CompanyUnsecuredCreditor[] findBygetOsiById_PrevAndNext(
			long companyUnsecuredCreditorId, long osiInsolvencyId,
			OrderByComparator<CompanyUnsecuredCreditor> orderByComparator)
		throws NoSuchCompanyUnsecuredCreditorException {

		CompanyUnsecuredCreditor companyUnsecuredCreditor = findByPrimaryKey(
			companyUnsecuredCreditorId);

		Session session = null;

		try {
			session = openSession();

			CompanyUnsecuredCreditor[] array =
				new CompanyUnsecuredCreditorImpl[3];

			array[0] = getBygetOsiById_PrevAndNext(
				session, companyUnsecuredCreditor, osiInsolvencyId,
				orderByComparator, true);

			array[1] = companyUnsecuredCreditor;

			array[2] = getBygetOsiById_PrevAndNext(
				session, companyUnsecuredCreditor, osiInsolvencyId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected CompanyUnsecuredCreditor getBygetOsiById_PrevAndNext(
		Session session, CompanyUnsecuredCreditor companyUnsecuredCreditor,
		long osiInsolvencyId,
		OrderByComparator<CompanyUnsecuredCreditor> orderByComparator,
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

		sb.append(_SQL_SELECT_COMPANYUNSECUREDCREDITOR_WHERE);

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
			sb.append(CompanyUnsecuredCreditorModelImpl.ORDER_BY_JPQL);
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
						companyUnsecuredCreditor)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CompanyUnsecuredCreditor> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the company unsecured creditors where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	@Override
	public void removeBygetOsiById(long osiInsolvencyId) {
		for (CompanyUnsecuredCreditor companyUnsecuredCreditor :
				findBygetOsiById(
					osiInsolvencyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(companyUnsecuredCreditor);
		}
	}

	/**
	 * Returns the number of company unsecured creditors where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching company unsecured creditors
	 */
	@Override
	public int countBygetOsiById(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOsiById;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_COMPANYUNSECUREDCREDITOR_WHERE);

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
		"companyUnsecuredCreditor.osiInsolvencyId = ?";

	public CompanyUnsecuredCreditorPersistenceImpl() {
		setModelClass(CompanyUnsecuredCreditor.class);

		setModelImplClass(CompanyUnsecuredCreditorImpl.class);
		setModelPKClass(long.class);

		setTable(CompanyUnsecuredCreditorTable.INSTANCE);
	}

	/**
	 * Caches the company unsecured creditor in the entity cache if it is enabled.
	 *
	 * @param companyUnsecuredCreditor the company unsecured creditor
	 */
	@Override
	public void cacheResult(CompanyUnsecuredCreditor companyUnsecuredCreditor) {
		entityCache.putResult(
			CompanyUnsecuredCreditorImpl.class,
			companyUnsecuredCreditor.getPrimaryKey(), companyUnsecuredCreditor);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the company unsecured creditors in the entity cache if it is enabled.
	 *
	 * @param companyUnsecuredCreditors the company unsecured creditors
	 */
	@Override
	public void cacheResult(
		List<CompanyUnsecuredCreditor> companyUnsecuredCreditors) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (companyUnsecuredCreditors.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CompanyUnsecuredCreditor companyUnsecuredCreditor :
				companyUnsecuredCreditors) {

			if (entityCache.getResult(
					CompanyUnsecuredCreditorImpl.class,
					companyUnsecuredCreditor.getPrimaryKey()) == null) {

				cacheResult(companyUnsecuredCreditor);
			}
		}
	}

	/**
	 * Clears the cache for all company unsecured creditors.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CompanyUnsecuredCreditorImpl.class);

		finderCache.clearCache(CompanyUnsecuredCreditorImpl.class);
	}

	/**
	 * Clears the cache for the company unsecured creditor.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CompanyUnsecuredCreditor companyUnsecuredCreditor) {
		entityCache.removeResult(
			CompanyUnsecuredCreditorImpl.class, companyUnsecuredCreditor);
	}

	@Override
	public void clearCache(
		List<CompanyUnsecuredCreditor> companyUnsecuredCreditors) {

		for (CompanyUnsecuredCreditor companyUnsecuredCreditor :
				companyUnsecuredCreditors) {

			entityCache.removeResult(
				CompanyUnsecuredCreditorImpl.class, companyUnsecuredCreditor);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CompanyUnsecuredCreditorImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CompanyUnsecuredCreditorImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new company unsecured creditor with the primary key. Does not add the company unsecured creditor to the database.
	 *
	 * @param companyUnsecuredCreditorId the primary key for the new company unsecured creditor
	 * @return the new company unsecured creditor
	 */
	@Override
	public CompanyUnsecuredCreditor create(long companyUnsecuredCreditorId) {
		CompanyUnsecuredCreditor companyUnsecuredCreditor =
			new CompanyUnsecuredCreditorImpl();

		companyUnsecuredCreditor.setNew(true);
		companyUnsecuredCreditor.setPrimaryKey(companyUnsecuredCreditorId);

		companyUnsecuredCreditor.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return companyUnsecuredCreditor;
	}

	/**
	 * Removes the company unsecured creditor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param companyUnsecuredCreditorId the primary key of the company unsecured creditor
	 * @return the company unsecured creditor that was removed
	 * @throws NoSuchCompanyUnsecuredCreditorException if a company unsecured creditor with the primary key could not be found
	 */
	@Override
	public CompanyUnsecuredCreditor remove(long companyUnsecuredCreditorId)
		throws NoSuchCompanyUnsecuredCreditorException {

		return remove((Serializable)companyUnsecuredCreditorId);
	}

	/**
	 * Removes the company unsecured creditor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the company unsecured creditor
	 * @return the company unsecured creditor that was removed
	 * @throws NoSuchCompanyUnsecuredCreditorException if a company unsecured creditor with the primary key could not be found
	 */
	@Override
	public CompanyUnsecuredCreditor remove(Serializable primaryKey)
		throws NoSuchCompanyUnsecuredCreditorException {

		Session session = null;

		try {
			session = openSession();

			CompanyUnsecuredCreditor companyUnsecuredCreditor =
				(CompanyUnsecuredCreditor)session.get(
					CompanyUnsecuredCreditorImpl.class, primaryKey);

			if (companyUnsecuredCreditor == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCompanyUnsecuredCreditorException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(companyUnsecuredCreditor);
		}
		catch (NoSuchCompanyUnsecuredCreditorException noSuchEntityException) {
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
	protected CompanyUnsecuredCreditor removeImpl(
		CompanyUnsecuredCreditor companyUnsecuredCreditor) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(companyUnsecuredCreditor)) {
				companyUnsecuredCreditor =
					(CompanyUnsecuredCreditor)session.get(
						CompanyUnsecuredCreditorImpl.class,
						companyUnsecuredCreditor.getPrimaryKeyObj());
			}

			if (companyUnsecuredCreditor != null) {
				session.delete(companyUnsecuredCreditor);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (companyUnsecuredCreditor != null) {
			clearCache(companyUnsecuredCreditor);
		}

		return companyUnsecuredCreditor;
	}

	@Override
	public CompanyUnsecuredCreditor updateImpl(
		CompanyUnsecuredCreditor companyUnsecuredCreditor) {

		boolean isNew = companyUnsecuredCreditor.isNew();

		if (!(companyUnsecuredCreditor instanceof
				CompanyUnsecuredCreditorModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(companyUnsecuredCreditor.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					companyUnsecuredCreditor);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in companyUnsecuredCreditor proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CompanyUnsecuredCreditor implementation " +
					companyUnsecuredCreditor.getClass());
		}

		CompanyUnsecuredCreditorModelImpl companyUnsecuredCreditorModelImpl =
			(CompanyUnsecuredCreditorModelImpl)companyUnsecuredCreditor;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (companyUnsecuredCreditor.getCreateDate() == null)) {
			if (serviceContext == null) {
				companyUnsecuredCreditor.setCreateDate(date);
			}
			else {
				companyUnsecuredCreditor.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!companyUnsecuredCreditorModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				companyUnsecuredCreditor.setModifiedDate(date);
			}
			else {
				companyUnsecuredCreditor.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(companyUnsecuredCreditor);
			}
			else {
				companyUnsecuredCreditor =
					(CompanyUnsecuredCreditor)session.merge(
						companyUnsecuredCreditor);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CompanyUnsecuredCreditorImpl.class,
			companyUnsecuredCreditorModelImpl, false, true);

		if (isNew) {
			companyUnsecuredCreditor.setNew(false);
		}

		companyUnsecuredCreditor.resetOriginalValues();

		return companyUnsecuredCreditor;
	}

	/**
	 * Returns the company unsecured creditor with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the company unsecured creditor
	 * @return the company unsecured creditor
	 * @throws NoSuchCompanyUnsecuredCreditorException if a company unsecured creditor with the primary key could not be found
	 */
	@Override
	public CompanyUnsecuredCreditor findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCompanyUnsecuredCreditorException {

		CompanyUnsecuredCreditor companyUnsecuredCreditor = fetchByPrimaryKey(
			primaryKey);

		if (companyUnsecuredCreditor == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCompanyUnsecuredCreditorException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return companyUnsecuredCreditor;
	}

	/**
	 * Returns the company unsecured creditor with the primary key or throws a <code>NoSuchCompanyUnsecuredCreditorException</code> if it could not be found.
	 *
	 * @param companyUnsecuredCreditorId the primary key of the company unsecured creditor
	 * @return the company unsecured creditor
	 * @throws NoSuchCompanyUnsecuredCreditorException if a company unsecured creditor with the primary key could not be found
	 */
	@Override
	public CompanyUnsecuredCreditor findByPrimaryKey(
			long companyUnsecuredCreditorId)
		throws NoSuchCompanyUnsecuredCreditorException {

		return findByPrimaryKey((Serializable)companyUnsecuredCreditorId);
	}

	/**
	 * Returns the company unsecured creditor with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param companyUnsecuredCreditorId the primary key of the company unsecured creditor
	 * @return the company unsecured creditor, or <code>null</code> if a company unsecured creditor with the primary key could not be found
	 */
	@Override
	public CompanyUnsecuredCreditor fetchByPrimaryKey(
		long companyUnsecuredCreditorId) {

		return fetchByPrimaryKey((Serializable)companyUnsecuredCreditorId);
	}

	/**
	 * Returns all the company unsecured creditors.
	 *
	 * @return the company unsecured creditors
	 */
	@Override
	public List<CompanyUnsecuredCreditor> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the company unsecured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyUnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company unsecured creditors
	 * @param end the upper bound of the range of company unsecured creditors (not inclusive)
	 * @return the range of company unsecured creditors
	 */
	@Override
	public List<CompanyUnsecuredCreditor> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the company unsecured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyUnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company unsecured creditors
	 * @param end the upper bound of the range of company unsecured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of company unsecured creditors
	 */
	@Override
	public List<CompanyUnsecuredCreditor> findAll(
		int start, int end,
		OrderByComparator<CompanyUnsecuredCreditor> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the company unsecured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyUnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company unsecured creditors
	 * @param end the upper bound of the range of company unsecured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of company unsecured creditors
	 */
	@Override
	public List<CompanyUnsecuredCreditor> findAll(
		int start, int end,
		OrderByComparator<CompanyUnsecuredCreditor> orderByComparator,
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

		List<CompanyUnsecuredCreditor> list = null;

		if (useFinderCache) {
			list = (List<CompanyUnsecuredCreditor>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_COMPANYUNSECUREDCREDITOR);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_COMPANYUNSECUREDCREDITOR;

				sql = sql.concat(
					CompanyUnsecuredCreditorModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CompanyUnsecuredCreditor>)QueryUtil.list(
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
	 * Removes all the company unsecured creditors from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CompanyUnsecuredCreditor companyUnsecuredCreditor : findAll()) {
			remove(companyUnsecuredCreditor);
		}
	}

	/**
	 * Returns the number of company unsecured creditors.
	 *
	 * @return the number of company unsecured creditors
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
					_SQL_COUNT_COMPANYUNSECUREDCREDITOR);

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
		return "companyUnsecuredCreditorId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_COMPANYUNSECUREDCREDITOR;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CompanyUnsecuredCreditorModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the company unsecured creditor persistence.
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

		CompanyUnsecuredCreditorUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CompanyUnsecuredCreditorUtil.setPersistence(null);

		entityCache.removeCache(CompanyUnsecuredCreditorImpl.class.getName());
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

	private static final String _SQL_SELECT_COMPANYUNSECUREDCREDITOR =
		"SELECT companyUnsecuredCreditor FROM CompanyUnsecuredCreditor companyUnsecuredCreditor";

	private static final String _SQL_SELECT_COMPANYUNSECUREDCREDITOR_WHERE =
		"SELECT companyUnsecuredCreditor FROM CompanyUnsecuredCreditor companyUnsecuredCreditor WHERE ";

	private static final String _SQL_COUNT_COMPANYUNSECUREDCREDITOR =
		"SELECT COUNT(companyUnsecuredCreditor) FROM CompanyUnsecuredCreditor companyUnsecuredCreditor";

	private static final String _SQL_COUNT_COMPANYUNSECUREDCREDITOR_WHERE =
		"SELECT COUNT(companyUnsecuredCreditor) FROM CompanyUnsecuredCreditor companyUnsecuredCreditor WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"companyUnsecuredCreditor.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CompanyUnsecuredCreditor exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CompanyUnsecuredCreditor exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CompanyUnsecuredCreditorPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}