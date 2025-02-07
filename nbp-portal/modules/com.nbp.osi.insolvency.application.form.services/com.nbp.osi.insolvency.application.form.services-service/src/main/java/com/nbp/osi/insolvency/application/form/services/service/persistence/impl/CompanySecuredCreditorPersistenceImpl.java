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

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchCompanySecuredCreditorException;
import com.nbp.osi.insolvency.application.form.services.model.CompanySecuredCreditor;
import com.nbp.osi.insolvency.application.form.services.model.CompanySecuredCreditorTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.CompanySecuredCreditorImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.CompanySecuredCreditorModelImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.CompanySecuredCreditorPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.CompanySecuredCreditorUtil;
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
 * The persistence implementation for the company secured creditor service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CompanySecuredCreditorPersistence.class)
public class CompanySecuredCreditorPersistenceImpl
	extends BasePersistenceImpl<CompanySecuredCreditor>
	implements CompanySecuredCreditorPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CompanySecuredCreditorUtil</code> to access the company secured creditor persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CompanySecuredCreditorImpl.class.getName();

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
	 * Returns all the company secured creditors where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching company secured creditors
	 */
	@Override
	public List<CompanySecuredCreditor> findBygetOsiById(long osiInsolvencyId) {
		return findBygetOsiById(
			osiInsolvencyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the company secured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanySecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of company secured creditors
	 * @param end the upper bound of the range of company secured creditors (not inclusive)
	 * @return the range of matching company secured creditors
	 */
	@Override
	public List<CompanySecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end) {

		return findBygetOsiById(osiInsolvencyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the company secured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanySecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of company secured creditors
	 * @param end the upper bound of the range of company secured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching company secured creditors
	 */
	@Override
	public List<CompanySecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<CompanySecuredCreditor> orderByComparator) {

		return findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the company secured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanySecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of company secured creditors
	 * @param end the upper bound of the range of company secured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching company secured creditors
	 */
	@Override
	public List<CompanySecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<CompanySecuredCreditor> orderByComparator,
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

		List<CompanySecuredCreditor> list = null;

		if (useFinderCache) {
			list = (List<CompanySecuredCreditor>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CompanySecuredCreditor companySecuredCreditor : list) {
					if (osiInsolvencyId !=
							companySecuredCreditor.getOsiInsolvencyId()) {

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

			sb.append(_SQL_SELECT_COMPANYSECUREDCREDITOR_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CompanySecuredCreditorModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				list = (List<CompanySecuredCreditor>)QueryUtil.list(
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
	 * Returns the first company secured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching company secured creditor
	 * @throws NoSuchCompanySecuredCreditorException if a matching company secured creditor could not be found
	 */
	@Override
	public CompanySecuredCreditor findBygetOsiById_First(
			long osiInsolvencyId,
			OrderByComparator<CompanySecuredCreditor> orderByComparator)
		throws NoSuchCompanySecuredCreditorException {

		CompanySecuredCreditor companySecuredCreditor = fetchBygetOsiById_First(
			osiInsolvencyId, orderByComparator);

		if (companySecuredCreditor != null) {
			return companySecuredCreditor;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiInsolvencyId=");
		sb.append(osiInsolvencyId);

		sb.append("}");

		throw new NoSuchCompanySecuredCreditorException(sb.toString());
	}

	/**
	 * Returns the first company secured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching company secured creditor, or <code>null</code> if a matching company secured creditor could not be found
	 */
	@Override
	public CompanySecuredCreditor fetchBygetOsiById_First(
		long osiInsolvencyId,
		OrderByComparator<CompanySecuredCreditor> orderByComparator) {

		List<CompanySecuredCreditor> list = findBygetOsiById(
			osiInsolvencyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last company secured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching company secured creditor
	 * @throws NoSuchCompanySecuredCreditorException if a matching company secured creditor could not be found
	 */
	@Override
	public CompanySecuredCreditor findBygetOsiById_Last(
			long osiInsolvencyId,
			OrderByComparator<CompanySecuredCreditor> orderByComparator)
		throws NoSuchCompanySecuredCreditorException {

		CompanySecuredCreditor companySecuredCreditor = fetchBygetOsiById_Last(
			osiInsolvencyId, orderByComparator);

		if (companySecuredCreditor != null) {
			return companySecuredCreditor;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiInsolvencyId=");
		sb.append(osiInsolvencyId);

		sb.append("}");

		throw new NoSuchCompanySecuredCreditorException(sb.toString());
	}

	/**
	 * Returns the last company secured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching company secured creditor, or <code>null</code> if a matching company secured creditor could not be found
	 */
	@Override
	public CompanySecuredCreditor fetchBygetOsiById_Last(
		long osiInsolvencyId,
		OrderByComparator<CompanySecuredCreditor> orderByComparator) {

		int count = countBygetOsiById(osiInsolvencyId);

		if (count == 0) {
			return null;
		}

		List<CompanySecuredCreditor> list = findBygetOsiById(
			osiInsolvencyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the company secured creditors before and after the current company secured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param companySecuredCreditorId the primary key of the current company secured creditor
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next company secured creditor
	 * @throws NoSuchCompanySecuredCreditorException if a company secured creditor with the primary key could not be found
	 */
	@Override
	public CompanySecuredCreditor[] findBygetOsiById_PrevAndNext(
			long companySecuredCreditorId, long osiInsolvencyId,
			OrderByComparator<CompanySecuredCreditor> orderByComparator)
		throws NoSuchCompanySecuredCreditorException {

		CompanySecuredCreditor companySecuredCreditor = findByPrimaryKey(
			companySecuredCreditorId);

		Session session = null;

		try {
			session = openSession();

			CompanySecuredCreditor[] array = new CompanySecuredCreditorImpl[3];

			array[0] = getBygetOsiById_PrevAndNext(
				session, companySecuredCreditor, osiInsolvencyId,
				orderByComparator, true);

			array[1] = companySecuredCreditor;

			array[2] = getBygetOsiById_PrevAndNext(
				session, companySecuredCreditor, osiInsolvencyId,
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

	protected CompanySecuredCreditor getBygetOsiById_PrevAndNext(
		Session session, CompanySecuredCreditor companySecuredCreditor,
		long osiInsolvencyId,
		OrderByComparator<CompanySecuredCreditor> orderByComparator,
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

		sb.append(_SQL_SELECT_COMPANYSECUREDCREDITOR_WHERE);

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
			sb.append(CompanySecuredCreditorModelImpl.ORDER_BY_JPQL);
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
						companySecuredCreditor)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CompanySecuredCreditor> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the company secured creditors where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	@Override
	public void removeBygetOsiById(long osiInsolvencyId) {
		for (CompanySecuredCreditor companySecuredCreditor :
				findBygetOsiById(
					osiInsolvencyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(companySecuredCreditor);
		}
	}

	/**
	 * Returns the number of company secured creditors where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching company secured creditors
	 */
	@Override
	public int countBygetOsiById(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOsiById;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_COMPANYSECUREDCREDITOR_WHERE);

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
		"companySecuredCreditor.osiInsolvencyId = ?";

	public CompanySecuredCreditorPersistenceImpl() {
		setModelClass(CompanySecuredCreditor.class);

		setModelImplClass(CompanySecuredCreditorImpl.class);
		setModelPKClass(long.class);

		setTable(CompanySecuredCreditorTable.INSTANCE);
	}

	/**
	 * Caches the company secured creditor in the entity cache if it is enabled.
	 *
	 * @param companySecuredCreditor the company secured creditor
	 */
	@Override
	public void cacheResult(CompanySecuredCreditor companySecuredCreditor) {
		entityCache.putResult(
			CompanySecuredCreditorImpl.class,
			companySecuredCreditor.getPrimaryKey(), companySecuredCreditor);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the company secured creditors in the entity cache if it is enabled.
	 *
	 * @param companySecuredCreditors the company secured creditors
	 */
	@Override
	public void cacheResult(
		List<CompanySecuredCreditor> companySecuredCreditors) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (companySecuredCreditors.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CompanySecuredCreditor companySecuredCreditor :
				companySecuredCreditors) {

			if (entityCache.getResult(
					CompanySecuredCreditorImpl.class,
					companySecuredCreditor.getPrimaryKey()) == null) {

				cacheResult(companySecuredCreditor);
			}
		}
	}

	/**
	 * Clears the cache for all company secured creditors.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CompanySecuredCreditorImpl.class);

		finderCache.clearCache(CompanySecuredCreditorImpl.class);
	}

	/**
	 * Clears the cache for the company secured creditor.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CompanySecuredCreditor companySecuredCreditor) {
		entityCache.removeResult(
			CompanySecuredCreditorImpl.class, companySecuredCreditor);
	}

	@Override
	public void clearCache(
		List<CompanySecuredCreditor> companySecuredCreditors) {

		for (CompanySecuredCreditor companySecuredCreditor :
				companySecuredCreditors) {

			entityCache.removeResult(
				CompanySecuredCreditorImpl.class, companySecuredCreditor);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CompanySecuredCreditorImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CompanySecuredCreditorImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new company secured creditor with the primary key. Does not add the company secured creditor to the database.
	 *
	 * @param companySecuredCreditorId the primary key for the new company secured creditor
	 * @return the new company secured creditor
	 */
	@Override
	public CompanySecuredCreditor create(long companySecuredCreditorId) {
		CompanySecuredCreditor companySecuredCreditor =
			new CompanySecuredCreditorImpl();

		companySecuredCreditor.setNew(true);
		companySecuredCreditor.setPrimaryKey(companySecuredCreditorId);

		companySecuredCreditor.setCompanyId(CompanyThreadLocal.getCompanyId());

		return companySecuredCreditor;
	}

	/**
	 * Removes the company secured creditor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param companySecuredCreditorId the primary key of the company secured creditor
	 * @return the company secured creditor that was removed
	 * @throws NoSuchCompanySecuredCreditorException if a company secured creditor with the primary key could not be found
	 */
	@Override
	public CompanySecuredCreditor remove(long companySecuredCreditorId)
		throws NoSuchCompanySecuredCreditorException {

		return remove((Serializable)companySecuredCreditorId);
	}

	/**
	 * Removes the company secured creditor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the company secured creditor
	 * @return the company secured creditor that was removed
	 * @throws NoSuchCompanySecuredCreditorException if a company secured creditor with the primary key could not be found
	 */
	@Override
	public CompanySecuredCreditor remove(Serializable primaryKey)
		throws NoSuchCompanySecuredCreditorException {

		Session session = null;

		try {
			session = openSession();

			CompanySecuredCreditor companySecuredCreditor =
				(CompanySecuredCreditor)session.get(
					CompanySecuredCreditorImpl.class, primaryKey);

			if (companySecuredCreditor == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCompanySecuredCreditorException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(companySecuredCreditor);
		}
		catch (NoSuchCompanySecuredCreditorException noSuchEntityException) {
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
	protected CompanySecuredCreditor removeImpl(
		CompanySecuredCreditor companySecuredCreditor) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(companySecuredCreditor)) {
				companySecuredCreditor = (CompanySecuredCreditor)session.get(
					CompanySecuredCreditorImpl.class,
					companySecuredCreditor.getPrimaryKeyObj());
			}

			if (companySecuredCreditor != null) {
				session.delete(companySecuredCreditor);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (companySecuredCreditor != null) {
			clearCache(companySecuredCreditor);
		}

		return companySecuredCreditor;
	}

	@Override
	public CompanySecuredCreditor updateImpl(
		CompanySecuredCreditor companySecuredCreditor) {

		boolean isNew = companySecuredCreditor.isNew();

		if (!(companySecuredCreditor instanceof
				CompanySecuredCreditorModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(companySecuredCreditor.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					companySecuredCreditor);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in companySecuredCreditor proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CompanySecuredCreditor implementation " +
					companySecuredCreditor.getClass());
		}

		CompanySecuredCreditorModelImpl companySecuredCreditorModelImpl =
			(CompanySecuredCreditorModelImpl)companySecuredCreditor;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (companySecuredCreditor.getCreateDate() == null)) {
			if (serviceContext == null) {
				companySecuredCreditor.setCreateDate(date);
			}
			else {
				companySecuredCreditor.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!companySecuredCreditorModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				companySecuredCreditor.setModifiedDate(date);
			}
			else {
				companySecuredCreditor.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(companySecuredCreditor);
			}
			else {
				companySecuredCreditor = (CompanySecuredCreditor)session.merge(
					companySecuredCreditor);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CompanySecuredCreditorImpl.class, companySecuredCreditorModelImpl,
			false, true);

		if (isNew) {
			companySecuredCreditor.setNew(false);
		}

		companySecuredCreditor.resetOriginalValues();

		return companySecuredCreditor;
	}

	/**
	 * Returns the company secured creditor with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the company secured creditor
	 * @return the company secured creditor
	 * @throws NoSuchCompanySecuredCreditorException if a company secured creditor with the primary key could not be found
	 */
	@Override
	public CompanySecuredCreditor findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCompanySecuredCreditorException {

		CompanySecuredCreditor companySecuredCreditor = fetchByPrimaryKey(
			primaryKey);

		if (companySecuredCreditor == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCompanySecuredCreditorException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return companySecuredCreditor;
	}

	/**
	 * Returns the company secured creditor with the primary key or throws a <code>NoSuchCompanySecuredCreditorException</code> if it could not be found.
	 *
	 * @param companySecuredCreditorId the primary key of the company secured creditor
	 * @return the company secured creditor
	 * @throws NoSuchCompanySecuredCreditorException if a company secured creditor with the primary key could not be found
	 */
	@Override
	public CompanySecuredCreditor findByPrimaryKey(
			long companySecuredCreditorId)
		throws NoSuchCompanySecuredCreditorException {

		return findByPrimaryKey((Serializable)companySecuredCreditorId);
	}

	/**
	 * Returns the company secured creditor with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param companySecuredCreditorId the primary key of the company secured creditor
	 * @return the company secured creditor, or <code>null</code> if a company secured creditor with the primary key could not be found
	 */
	@Override
	public CompanySecuredCreditor fetchByPrimaryKey(
		long companySecuredCreditorId) {

		return fetchByPrimaryKey((Serializable)companySecuredCreditorId);
	}

	/**
	 * Returns all the company secured creditors.
	 *
	 * @return the company secured creditors
	 */
	@Override
	public List<CompanySecuredCreditor> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the company secured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanySecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company secured creditors
	 * @param end the upper bound of the range of company secured creditors (not inclusive)
	 * @return the range of company secured creditors
	 */
	@Override
	public List<CompanySecuredCreditor> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the company secured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanySecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company secured creditors
	 * @param end the upper bound of the range of company secured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of company secured creditors
	 */
	@Override
	public List<CompanySecuredCreditor> findAll(
		int start, int end,
		OrderByComparator<CompanySecuredCreditor> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the company secured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanySecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company secured creditors
	 * @param end the upper bound of the range of company secured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of company secured creditors
	 */
	@Override
	public List<CompanySecuredCreditor> findAll(
		int start, int end,
		OrderByComparator<CompanySecuredCreditor> orderByComparator,
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

		List<CompanySecuredCreditor> list = null;

		if (useFinderCache) {
			list = (List<CompanySecuredCreditor>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_COMPANYSECUREDCREDITOR);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_COMPANYSECUREDCREDITOR;

				sql = sql.concat(CompanySecuredCreditorModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CompanySecuredCreditor>)QueryUtil.list(
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
	 * Removes all the company secured creditors from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CompanySecuredCreditor companySecuredCreditor : findAll()) {
			remove(companySecuredCreditor);
		}
	}

	/**
	 * Returns the number of company secured creditors.
	 *
	 * @return the number of company secured creditors
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
					_SQL_COUNT_COMPANYSECUREDCREDITOR);

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
		return "companySecuredCreditorId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_COMPANYSECUREDCREDITOR;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CompanySecuredCreditorModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the company secured creditor persistence.
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

		CompanySecuredCreditorUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CompanySecuredCreditorUtil.setPersistence(null);

		entityCache.removeCache(CompanySecuredCreditorImpl.class.getName());
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

	private static final String _SQL_SELECT_COMPANYSECUREDCREDITOR =
		"SELECT companySecuredCreditor FROM CompanySecuredCreditor companySecuredCreditor";

	private static final String _SQL_SELECT_COMPANYSECUREDCREDITOR_WHERE =
		"SELECT companySecuredCreditor FROM CompanySecuredCreditor companySecuredCreditor WHERE ";

	private static final String _SQL_COUNT_COMPANYSECUREDCREDITOR =
		"SELECT COUNT(companySecuredCreditor) FROM CompanySecuredCreditor companySecuredCreditor";

	private static final String _SQL_COUNT_COMPANYSECUREDCREDITOR_WHERE =
		"SELECT COUNT(companySecuredCreditor) FROM CompanySecuredCreditor companySecuredCreditor WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"companySecuredCreditor.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CompanySecuredCreditor exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CompanySecuredCreditor exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CompanySecuredCreditorPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}