/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence.impl;

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

import com.nbp.manufacturing.application.form.service.exception.NoSuchProductiveInputsFormException;
import com.nbp.manufacturing.application.form.service.model.ProductiveInputsForm;
import com.nbp.manufacturing.application.form.service.model.ProductiveInputsFormTable;
import com.nbp.manufacturing.application.form.service.model.impl.ProductiveInputsFormImpl;
import com.nbp.manufacturing.application.form.service.model.impl.ProductiveInputsFormModelImpl;
import com.nbp.manufacturing.application.form.service.service.persistence.ProductiveInputsFormPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ProductiveInputsFormUtil;
import com.nbp.manufacturing.application.form.service.service.persistence.impl.constants.MANUFACTURINGPersistenceConstants;

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
 * The persistence implementation for the productive inputs form service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ProductiveInputsFormPersistence.class)
public class ProductiveInputsFormPersistenceImpl
	extends BasePersistenceImpl<ProductiveInputsForm>
	implements ProductiveInputsFormPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ProductiveInputsFormUtil</code> to access the productive inputs form persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ProductiveInputsFormImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetManufactureById;
	private FinderPath _finderPathCountBygetManufactureById;

	/**
	 * Returns the productive inputs form where manufacturingApplicationId = &#63; or throws a <code>NoSuchProductiveInputsFormException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching productive inputs form
	 * @throws NoSuchProductiveInputsFormException if a matching productive inputs form could not be found
	 */
	@Override
	public ProductiveInputsForm findBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchProductiveInputsFormException {

		ProductiveInputsForm productiveInputsForm = fetchBygetManufactureById(
			manufacturingApplicationId);

		if (productiveInputsForm == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("manufacturingApplicationId=");
			sb.append(manufacturingApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchProductiveInputsFormException(sb.toString());
		}

		return productiveInputsForm;
	}

	/**
	 * Returns the productive inputs form where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching productive inputs form, or <code>null</code> if a matching productive inputs form could not be found
	 */
	@Override
	public ProductiveInputsForm fetchBygetManufactureById(
		long manufacturingApplicationId) {

		return fetchBygetManufactureById(manufacturingApplicationId, true);
	}

	/**
	 * Returns the productive inputs form where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching productive inputs form, or <code>null</code> if a matching productive inputs form could not be found
	 */
	@Override
	public ProductiveInputsForm fetchBygetManufactureById(
		long manufacturingApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {manufacturingApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetManufactureById, finderArgs, this);
		}

		if (result instanceof ProductiveInputsForm) {
			ProductiveInputsForm productiveInputsForm =
				(ProductiveInputsForm)result;

			if (manufacturingApplicationId !=
					productiveInputsForm.getManufacturingApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_PRODUCTIVEINPUTSFORM_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMANUFACTUREBYID_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

				List<ProductiveInputsForm> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetManufactureById, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									manufacturingApplicationId
								};
							}

							_log.warn(
								"ProductiveInputsFormPersistenceImpl.fetchBygetManufactureById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ProductiveInputsForm productiveInputsForm = list.get(0);

					result = productiveInputsForm;

					cacheResult(productiveInputsForm);
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
			return (ProductiveInputsForm)result;
		}
	}

	/**
	 * Removes the productive inputs form where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the productive inputs form that was removed
	 */
	@Override
	public ProductiveInputsForm removeBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchProductiveInputsFormException {

		ProductiveInputsForm productiveInputsForm = findBygetManufactureById(
			manufacturingApplicationId);

		return remove(productiveInputsForm);
	}

	/**
	 * Returns the number of productive inputs forms where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching productive inputs forms
	 */
	@Override
	public int countBygetManufactureById(long manufacturingApplicationId) {
		FinderPath finderPath = _finderPathCountBygetManufactureById;

		Object[] finderArgs = new Object[] {manufacturingApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PRODUCTIVEINPUTSFORM_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMANUFACTUREBYID_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

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
		_FINDER_COLUMN_GETMANUFACTUREBYID_MANUFACTURINGAPPLICATIONID_2 =
			"productiveInputsForm.manufacturingApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetMA_PI_MAI;
	private FinderPath _finderPathWithoutPaginationFindBygetMA_PI_MAI;
	private FinderPath _finderPathCountBygetMA_PI_MAI;

	/**
	 * Returns all the productive inputs forms where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching productive inputs forms
	 */
	@Override
	public List<ProductiveInputsForm> findBygetMA_PI_MAI(
		long manufacturingApplicationId) {

		return findBygetMA_PI_MAI(
			manufacturingApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the productive inputs forms where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductiveInputsFormModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of productive inputs forms
	 * @param end the upper bound of the range of productive inputs forms (not inclusive)
	 * @return the range of matching productive inputs forms
	 */
	@Override
	public List<ProductiveInputsForm> findBygetMA_PI_MAI(
		long manufacturingApplicationId, int start, int end) {

		return findBygetMA_PI_MAI(manufacturingApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the productive inputs forms where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductiveInputsFormModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of productive inputs forms
	 * @param end the upper bound of the range of productive inputs forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching productive inputs forms
	 */
	@Override
	public List<ProductiveInputsForm> findBygetMA_PI_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ProductiveInputsForm> orderByComparator) {

		return findBygetMA_PI_MAI(
			manufacturingApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the productive inputs forms where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductiveInputsFormModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of productive inputs forms
	 * @param end the upper bound of the range of productive inputs forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching productive inputs forms
	 */
	@Override
	public List<ProductiveInputsForm> findBygetMA_PI_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ProductiveInputsForm> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetMA_PI_MAI;
				finderArgs = new Object[] {manufacturingApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMA_PI_MAI;
			finderArgs = new Object[] {
				manufacturingApplicationId, start, end, orderByComparator
			};
		}

		List<ProductiveInputsForm> list = null;

		if (useFinderCache) {
			list = (List<ProductiveInputsForm>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ProductiveInputsForm productiveInputsForm : list) {
					if (manufacturingApplicationId !=
							productiveInputsForm.
								getManufacturingApplicationId()) {

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

			sb.append(_SQL_SELECT_PRODUCTIVEINPUTSFORM_WHERE);

			sb.append(_FINDER_COLUMN_GETMA_PI_MAI_MANUFACTURINGAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ProductiveInputsFormModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

				list = (List<ProductiveInputsForm>)QueryUtil.list(
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
	 * Returns the first productive inputs form in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching productive inputs form
	 * @throws NoSuchProductiveInputsFormException if a matching productive inputs form could not be found
	 */
	@Override
	public ProductiveInputsForm findBygetMA_PI_MAI_First(
			long manufacturingApplicationId,
			OrderByComparator<ProductiveInputsForm> orderByComparator)
		throws NoSuchProductiveInputsFormException {

		ProductiveInputsForm productiveInputsForm = fetchBygetMA_PI_MAI_First(
			manufacturingApplicationId, orderByComparator);

		if (productiveInputsForm != null) {
			return productiveInputsForm;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);

		sb.append("}");

		throw new NoSuchProductiveInputsFormException(sb.toString());
	}

	/**
	 * Returns the first productive inputs form in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching productive inputs form, or <code>null</code> if a matching productive inputs form could not be found
	 */
	@Override
	public ProductiveInputsForm fetchBygetMA_PI_MAI_First(
		long manufacturingApplicationId,
		OrderByComparator<ProductiveInputsForm> orderByComparator) {

		List<ProductiveInputsForm> list = findBygetMA_PI_MAI(
			manufacturingApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last productive inputs form in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching productive inputs form
	 * @throws NoSuchProductiveInputsFormException if a matching productive inputs form could not be found
	 */
	@Override
	public ProductiveInputsForm findBygetMA_PI_MAI_Last(
			long manufacturingApplicationId,
			OrderByComparator<ProductiveInputsForm> orderByComparator)
		throws NoSuchProductiveInputsFormException {

		ProductiveInputsForm productiveInputsForm = fetchBygetMA_PI_MAI_Last(
			manufacturingApplicationId, orderByComparator);

		if (productiveInputsForm != null) {
			return productiveInputsForm;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);

		sb.append("}");

		throw new NoSuchProductiveInputsFormException(sb.toString());
	}

	/**
	 * Returns the last productive inputs form in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching productive inputs form, or <code>null</code> if a matching productive inputs form could not be found
	 */
	@Override
	public ProductiveInputsForm fetchBygetMA_PI_MAI_Last(
		long manufacturingApplicationId,
		OrderByComparator<ProductiveInputsForm> orderByComparator) {

		int count = countBygetMA_PI_MAI(manufacturingApplicationId);

		if (count == 0) {
			return null;
		}

		List<ProductiveInputsForm> list = findBygetMA_PI_MAI(
			manufacturingApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the productive inputs forms before and after the current productive inputs form in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param productiveInputsFormId the primary key of the current productive inputs form
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next productive inputs form
	 * @throws NoSuchProductiveInputsFormException if a productive inputs form with the primary key could not be found
	 */
	@Override
	public ProductiveInputsForm[] findBygetMA_PI_MAI_PrevAndNext(
			long productiveInputsFormId, long manufacturingApplicationId,
			OrderByComparator<ProductiveInputsForm> orderByComparator)
		throws NoSuchProductiveInputsFormException {

		ProductiveInputsForm productiveInputsForm = findByPrimaryKey(
			productiveInputsFormId);

		Session session = null;

		try {
			session = openSession();

			ProductiveInputsForm[] array = new ProductiveInputsFormImpl[3];

			array[0] = getBygetMA_PI_MAI_PrevAndNext(
				session, productiveInputsForm, manufacturingApplicationId,
				orderByComparator, true);

			array[1] = productiveInputsForm;

			array[2] = getBygetMA_PI_MAI_PrevAndNext(
				session, productiveInputsForm, manufacturingApplicationId,
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

	protected ProductiveInputsForm getBygetMA_PI_MAI_PrevAndNext(
		Session session, ProductiveInputsForm productiveInputsForm,
		long manufacturingApplicationId,
		OrderByComparator<ProductiveInputsForm> orderByComparator,
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

		sb.append(_SQL_SELECT_PRODUCTIVEINPUTSFORM_WHERE);

		sb.append(_FINDER_COLUMN_GETMA_PI_MAI_MANUFACTURINGAPPLICATIONID_2);

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
			sb.append(ProductiveInputsFormModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(manufacturingApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						productiveInputsForm)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ProductiveInputsForm> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the productive inputs forms where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	@Override
	public void removeBygetMA_PI_MAI(long manufacturingApplicationId) {
		for (ProductiveInputsForm productiveInputsForm :
				findBygetMA_PI_MAI(
					manufacturingApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(productiveInputsForm);
		}
	}

	/**
	 * Returns the number of productive inputs forms where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching productive inputs forms
	 */
	@Override
	public int countBygetMA_PI_MAI(long manufacturingApplicationId) {
		FinderPath finderPath = _finderPathCountBygetMA_PI_MAI;

		Object[] finderArgs = new Object[] {manufacturingApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PRODUCTIVEINPUTSFORM_WHERE);

			sb.append(_FINDER_COLUMN_GETMA_PI_MAI_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

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
		_FINDER_COLUMN_GETMA_PI_MAI_MANUFACTURINGAPPLICATIONID_2 =
			"productiveInputsForm.manufacturingApplicationId = ?";

	public ProductiveInputsFormPersistenceImpl() {
		setModelClass(ProductiveInputsForm.class);

		setModelImplClass(ProductiveInputsFormImpl.class);
		setModelPKClass(long.class);

		setTable(ProductiveInputsFormTable.INSTANCE);
	}

	/**
	 * Caches the productive inputs form in the entity cache if it is enabled.
	 *
	 * @param productiveInputsForm the productive inputs form
	 */
	@Override
	public void cacheResult(ProductiveInputsForm productiveInputsForm) {
		entityCache.putResult(
			ProductiveInputsFormImpl.class,
			productiveInputsForm.getPrimaryKey(), productiveInputsForm);

		finderCache.putResult(
			_finderPathFetchBygetManufactureById,
			new Object[] {productiveInputsForm.getManufacturingApplicationId()},
			productiveInputsForm);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the productive inputs forms in the entity cache if it is enabled.
	 *
	 * @param productiveInputsForms the productive inputs forms
	 */
	@Override
	public void cacheResult(List<ProductiveInputsForm> productiveInputsForms) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (productiveInputsForms.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (ProductiveInputsForm productiveInputsForm :
				productiveInputsForms) {

			if (entityCache.getResult(
					ProductiveInputsFormImpl.class,
					productiveInputsForm.getPrimaryKey()) == null) {

				cacheResult(productiveInputsForm);
			}
		}
	}

	/**
	 * Clears the cache for all productive inputs forms.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ProductiveInputsFormImpl.class);

		finderCache.clearCache(ProductiveInputsFormImpl.class);
	}

	/**
	 * Clears the cache for the productive inputs form.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ProductiveInputsForm productiveInputsForm) {
		entityCache.removeResult(
			ProductiveInputsFormImpl.class, productiveInputsForm);
	}

	@Override
	public void clearCache(List<ProductiveInputsForm> productiveInputsForms) {
		for (ProductiveInputsForm productiveInputsForm :
				productiveInputsForms) {

			entityCache.removeResult(
				ProductiveInputsFormImpl.class, productiveInputsForm);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ProductiveInputsFormImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				ProductiveInputsFormImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		ProductiveInputsFormModelImpl productiveInputsFormModelImpl) {

		Object[] args = new Object[] {
			productiveInputsFormModelImpl.getManufacturingApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetManufactureById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetManufactureById, args,
			productiveInputsFormModelImpl);
	}

	/**
	 * Creates a new productive inputs form with the primary key. Does not add the productive inputs form to the database.
	 *
	 * @param productiveInputsFormId the primary key for the new productive inputs form
	 * @return the new productive inputs form
	 */
	@Override
	public ProductiveInputsForm create(long productiveInputsFormId) {
		ProductiveInputsForm productiveInputsForm =
			new ProductiveInputsFormImpl();

		productiveInputsForm.setNew(true);
		productiveInputsForm.setPrimaryKey(productiveInputsFormId);

		productiveInputsForm.setCompanyId(CompanyThreadLocal.getCompanyId());

		return productiveInputsForm;
	}

	/**
	 * Removes the productive inputs form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param productiveInputsFormId the primary key of the productive inputs form
	 * @return the productive inputs form that was removed
	 * @throws NoSuchProductiveInputsFormException if a productive inputs form with the primary key could not be found
	 */
	@Override
	public ProductiveInputsForm remove(long productiveInputsFormId)
		throws NoSuchProductiveInputsFormException {

		return remove((Serializable)productiveInputsFormId);
	}

	/**
	 * Removes the productive inputs form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the productive inputs form
	 * @return the productive inputs form that was removed
	 * @throws NoSuchProductiveInputsFormException if a productive inputs form with the primary key could not be found
	 */
	@Override
	public ProductiveInputsForm remove(Serializable primaryKey)
		throws NoSuchProductiveInputsFormException {

		Session session = null;

		try {
			session = openSession();

			ProductiveInputsForm productiveInputsForm =
				(ProductiveInputsForm)session.get(
					ProductiveInputsFormImpl.class, primaryKey);

			if (productiveInputsForm == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchProductiveInputsFormException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(productiveInputsForm);
		}
		catch (NoSuchProductiveInputsFormException noSuchEntityException) {
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
	protected ProductiveInputsForm removeImpl(
		ProductiveInputsForm productiveInputsForm) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(productiveInputsForm)) {
				productiveInputsForm = (ProductiveInputsForm)session.get(
					ProductiveInputsFormImpl.class,
					productiveInputsForm.getPrimaryKeyObj());
			}

			if (productiveInputsForm != null) {
				session.delete(productiveInputsForm);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (productiveInputsForm != null) {
			clearCache(productiveInputsForm);
		}

		return productiveInputsForm;
	}

	@Override
	public ProductiveInputsForm updateImpl(
		ProductiveInputsForm productiveInputsForm) {

		boolean isNew = productiveInputsForm.isNew();

		if (!(productiveInputsForm instanceof ProductiveInputsFormModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(productiveInputsForm.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					productiveInputsForm);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in productiveInputsForm proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ProductiveInputsForm implementation " +
					productiveInputsForm.getClass());
		}

		ProductiveInputsFormModelImpl productiveInputsFormModelImpl =
			(ProductiveInputsFormModelImpl)productiveInputsForm;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (productiveInputsForm.getCreateDate() == null)) {
			if (serviceContext == null) {
				productiveInputsForm.setCreateDate(date);
			}
			else {
				productiveInputsForm.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!productiveInputsFormModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				productiveInputsForm.setModifiedDate(date);
			}
			else {
				productiveInputsForm.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(productiveInputsForm);
			}
			else {
				productiveInputsForm = (ProductiveInputsForm)session.merge(
					productiveInputsForm);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ProductiveInputsFormImpl.class, productiveInputsFormModelImpl,
			false, true);

		cacheUniqueFindersCache(productiveInputsFormModelImpl);

		if (isNew) {
			productiveInputsForm.setNew(false);
		}

		productiveInputsForm.resetOriginalValues();

		return productiveInputsForm;
	}

	/**
	 * Returns the productive inputs form with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the productive inputs form
	 * @return the productive inputs form
	 * @throws NoSuchProductiveInputsFormException if a productive inputs form with the primary key could not be found
	 */
	@Override
	public ProductiveInputsForm findByPrimaryKey(Serializable primaryKey)
		throws NoSuchProductiveInputsFormException {

		ProductiveInputsForm productiveInputsForm = fetchByPrimaryKey(
			primaryKey);

		if (productiveInputsForm == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchProductiveInputsFormException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return productiveInputsForm;
	}

	/**
	 * Returns the productive inputs form with the primary key or throws a <code>NoSuchProductiveInputsFormException</code> if it could not be found.
	 *
	 * @param productiveInputsFormId the primary key of the productive inputs form
	 * @return the productive inputs form
	 * @throws NoSuchProductiveInputsFormException if a productive inputs form with the primary key could not be found
	 */
	@Override
	public ProductiveInputsForm findByPrimaryKey(long productiveInputsFormId)
		throws NoSuchProductiveInputsFormException {

		return findByPrimaryKey((Serializable)productiveInputsFormId);
	}

	/**
	 * Returns the productive inputs form with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param productiveInputsFormId the primary key of the productive inputs form
	 * @return the productive inputs form, or <code>null</code> if a productive inputs form with the primary key could not be found
	 */
	@Override
	public ProductiveInputsForm fetchByPrimaryKey(long productiveInputsFormId) {
		return fetchByPrimaryKey((Serializable)productiveInputsFormId);
	}

	/**
	 * Returns all the productive inputs forms.
	 *
	 * @return the productive inputs forms
	 */
	@Override
	public List<ProductiveInputsForm> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the productive inputs forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductiveInputsFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of productive inputs forms
	 * @param end the upper bound of the range of productive inputs forms (not inclusive)
	 * @return the range of productive inputs forms
	 */
	@Override
	public List<ProductiveInputsForm> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the productive inputs forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductiveInputsFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of productive inputs forms
	 * @param end the upper bound of the range of productive inputs forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of productive inputs forms
	 */
	@Override
	public List<ProductiveInputsForm> findAll(
		int start, int end,
		OrderByComparator<ProductiveInputsForm> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the productive inputs forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductiveInputsFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of productive inputs forms
	 * @param end the upper bound of the range of productive inputs forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of productive inputs forms
	 */
	@Override
	public List<ProductiveInputsForm> findAll(
		int start, int end,
		OrderByComparator<ProductiveInputsForm> orderByComparator,
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

		List<ProductiveInputsForm> list = null;

		if (useFinderCache) {
			list = (List<ProductiveInputsForm>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PRODUCTIVEINPUTSFORM);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PRODUCTIVEINPUTSFORM;

				sql = sql.concat(ProductiveInputsFormModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ProductiveInputsForm>)QueryUtil.list(
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
	 * Removes all the productive inputs forms from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ProductiveInputsForm productiveInputsForm : findAll()) {
			remove(productiveInputsForm);
		}
	}

	/**
	 * Returns the number of productive inputs forms.
	 *
	 * @return the number of productive inputs forms
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
					_SQL_COUNT_PRODUCTIVEINPUTSFORM);

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
		return "productiveInputsFormId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PRODUCTIVEINPUTSFORM;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ProductiveInputsFormModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the productive inputs form persistence.
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

		_finderPathFetchBygetManufactureById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetManufactureById",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathCountBygetManufactureById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetManufactureById", new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, false);

		_finderPathWithPaginationFindBygetMA_PI_MAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMA_PI_MAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetMA_PI_MAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetMA_PI_MAI",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathCountBygetMA_PI_MAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMA_PI_MAI",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, false);

		ProductiveInputsFormUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		ProductiveInputsFormUtil.setPersistence(null);

		entityCache.removeCache(ProductiveInputsFormImpl.class.getName());
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_PRODUCTIVEINPUTSFORM =
		"SELECT productiveInputsForm FROM ProductiveInputsForm productiveInputsForm";

	private static final String _SQL_SELECT_PRODUCTIVEINPUTSFORM_WHERE =
		"SELECT productiveInputsForm FROM ProductiveInputsForm productiveInputsForm WHERE ";

	private static final String _SQL_COUNT_PRODUCTIVEINPUTSFORM =
		"SELECT COUNT(productiveInputsForm) FROM ProductiveInputsForm productiveInputsForm";

	private static final String _SQL_COUNT_PRODUCTIVEINPUTSFORM_WHERE =
		"SELECT COUNT(productiveInputsForm) FROM ProductiveInputsForm productiveInputsForm WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"productiveInputsForm.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ProductiveInputsForm exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ProductiveInputsForm exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ProductiveInputsFormPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}